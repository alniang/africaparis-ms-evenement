package fr.isika.microservice_evenements.model;

public class Evenement {
	
	//private String _id;
	
	private String id;
	
	private String titre;
	
	private String lieu;
	
	private String desc;
	
	private String debut;
	
	private String fin;
	
	private String heure;
	
	private String logo;
	
	private String url;
	
	public Evenement() {
		
	}

	public Evenement(String id, String titre, String lieu, String desc, String debut, String fin, String heure, String logo, String url) {
		super();
		this.id = id;
		this.titre = titre;
		this.lieu = lieu;
		this.desc = desc;
		this.debut = debut;
		this.fin = fin;
		this.heure = heure;
		this.logo = logo;
		this.url = url;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}
	
	public String getHeure() {
		return heure;
	}
	
	public void setHeure(String heure) {
		this.heure = heure;
	}
	
	public String getLogo() {
		return logo;
	}
	
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Evenement [id=" + id + ", titre=" + titre + ", lieu=" + lieu + ", desc=" + desc + ", debut=" + debut
				+ ", fin=" + fin + ", logo=" + logo + ", url=" + url + "]";
	}
}
