package fr.isika.microservice_evenements.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import fr.isika.microservice_evenements.model.Evenement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/events")
public class EvenementController {

	private WebClient client = WebClient.create("http://localhost:8282");

	@GetMapping(path = "/events-api/public/events")
	public Flux<Evenement> getEvenement() {
		return client.get().uri("/events-api/public/events").accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToFlux(Evenement.class).log("retrieve emps :: ");
	}
	
	@GetMapping(path = "/events-api/public/events/{id}")
	public Mono<Evenement> getEvenementById(@PathVariable("id") String id) {
		return client.get().uri("/events-api/public/events/{id}", id).accept(MediaType.APPLICATION_JSON)
				.retrieve().bodyToMono(Evenement.class).log("retrieve emps :: ");
	}
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(path = "/events-api/public/user/events")
	public Mono<Evenement> createEvenement(@RequestBody Evenement event) {
		return client.post().uri("/events-api/public/user/events").accept(MediaType.APPLICATION_JSON)
				.body(BodyInserters.fromObject(event)).retrieve()
				.bodyToMono(Evenement.class)
				.log("insert using body");
	}
	
	@PutMapping ("/events-api/public/user/events")
	public Mono<Evenement> updateEvent(@RequestBody Evenement event){
		System.out.println("LAAAAA");
		return client.put().uri("/events-api/public/user/events")
				.accept(MediaType.APPLICATION_JSON)
				.syncBody(event)
				.retrieve()
				.bodyToMono(Evenement.class)
				.log("*** Evenement mis à jour ***");
	}
	
	@DeleteMapping("/events-api/public/user/events/{id}")
	public Mono<Evenement> deleteEvent(@PathVariable("id") String id){
		return client.delete().uri("/events-api/public/user/events/{id}", id)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(Evenement.class)
				.log("*** Evenement supprimé ***" + id);
	}

}
