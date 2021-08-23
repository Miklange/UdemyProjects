Tutoriel de creation d'une application Web :
https://thales.udemy.com/course/developper-une-application-web-avec-java-ee

Dans une première partie il y a le développement du Core (DirectMedia)
D'un back Office (DirectMediaBackOffice) 
et d'un Front Office (DirectMediaFrontOffice) 

On peut lancer sur un Serveur Tomcat 9.0 ces projets pour les utiliser



A la fin de la formation, il y a creation d'un service (DirectMediaService) RESTFul
On peut y acceder avec deux Front End (DirectMediaBackOfficeFrontEnd et (DirectMediaFrontOfficeFrontEnd).
On lance ces 3 projets sur le même serveur Tomcat

On ne peut y afficher seulement le catalogue.

http://localhost:8080/DirectMediaServices/
http://localhost:8080/DirectMediaFrontOfficeFrontEnd/
http://localhost:8080/DirectMediaBackOfficeFrontEnd/

Resterait à implementer les liens permettant de voir le contenu des oeuvres dans le FrontOffice
Resterait a implementer la methode d'ajout d'une oeuvre dans le back Office