# Commentaar van Wouter!
## File structure
- De file heet code i.p.v. Code.java. Dit is niet per-se fout maar maakt het verwarrend voor sommige IDE's en mensen.
- In Java moet iedere public class een eigen file hebben e.g. de class TimeCalculations moet in de file TimeCalculations.java. (Dit geld alleen voor public classes - hoor je nog niet te weten Intelij verwerkt het vgm prima :) 

## Code
- Inderdaad heel veel ```if()``` statments, dit is niet echt netjes en zou makkelijk uitgesplitst kunnen worden in meerdere methods. (heb je die al gehad?)
- Aansluitend op het vorige punt, probeer je code maar een keer te schrijven. Het heeft geen zit 4x dezelfde input code te schrijven als deze toch niet veranderd. (Methods!)
- Geen type safety op de scanner (Had je ws niet kunnen weten)
- Het programma sluit wanneer er ongeldige input gegeven wordt (That's one way of error handling lmao)
- Probeer console input met nummers te doen i.p.v. text. Het is makkelijker voor jezelf en je gebruikers als er alleen maar "1" getypt hoeft te worden in plaats van "conversion", zeker als je aan het debuggen bent.

# Things to google
Deze site heeft echt alle basic stof https://www.w3schools.com/java/  
Oracle documentatie heeft letterlijk alles. https://docs.oracle.com/en/java/javase/17/docs/api/ goed als je in slaap wil vallen.
- Java Methodes.   
Een methode is een manier om een blok code meerdere keren te gebruiken zonder het opnieuw te schrijven.  
De syntax hiervoor is ``` void getValue()```. De ``` void ``` in het voorbeeld betekend dat deze methode niets terug geeft, deze waarde geeft aan wat het type van de uiteindelijke output van de methode is. Voor een betere uitleg: zie de links hierboven of kijk op line 57, 72 & 84 van mijn versie.

- ```For()``` en ```While()``` loops.  
Je leven wordt zo veel makkelijker als je door lijsten heen kan loopen!  
```While``` gebruik je als je voor een onbepaalde tijd of door een onbekende hoeveelheid gegevens heen moet loopen &  
```For``` wanneer je door een bekende hoeveelheid e.g. de lengte van een lijst heen moet loopen.

- ```Switch``` Statments.  
Deze leuke dingen zijn compactere if-else statments en kunnen gebruikt worden om overzichtelijk door condities voor bvb numerieke input heen te filteren. Ze zijn niet super belangerijk maar wel handig om te weten.

# Disclaimer
Je pakt het sneller op dan sommige van mijn klasgenoten, zeker binnen een paar uur dus ga vooral zo door!  
Ik wel de neiging om over dingen als netheid en design patterns te zeuren die je niet hoeft/wil weten. Neem het dus vooral met een korreltje zout.  
Also geweldige github username 0w0.  
Love, -W