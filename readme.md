Le projet africaparis est un site web qui permet de regrouper tout ce qui tourne au tour de la mode et de la culture africaine et afro caribéenne. 
L'architechture du projet comprend les éléments suivants :
- Un front Angular qui se connecter à un backend via une API rest
- Un backend Java / Spring boot sur lequel Angular viendra se connecter
- Une base de données MySQL pour stocker les informations “métiers” du Backend
- Une base de données MongoDB pour stocker les informations “data”
- Une partie server-side en NodeJS, qui devra récolter des données, les traiter et les insérer dans la base de données MongoDB.

Le projet est composé de 6 repos github :

# scrapping : https://github.com/alniang/scrapping
# africaparis-nodejs : https://github.com/alniang/africaparis-nodejs
# africaparis-ms-evenement : https://github.com/alniang/africaparis-ms-evenement
# africaparis-ms-boutique :https://github.com/alniang/africaparis-ms-boutique
# africaparis-ms-login : https://github.com/alniang/africaparis-ms-login
# africaparis-frontend-angular : https://github.com/alniang/africaparis-frontend-angular


   # africaparis-ms-evenement #
Dans cette partie on recupére des données du server nodejs et on les expose au frontend-angular via une API rest.
  
Cette partie est réalisée avec java 8 et spring boot