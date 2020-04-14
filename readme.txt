Resultats de la couverture de code : target/site/jacoco/FlightManagement/*.html

- Installer plugin JBehave pour Intellij (JBehave Support, Jbehave Step Generator)
- Ajouter la dependance JBehave-core et le plugin JBehave-maven-plugin au Pom.xml
- Creer le dossier resources puis le marquer comme Test Resources Root

- Creer la story dans un fichier xx.story de JBehave
- Intellij vous propose de creer les steps . Creer d'abord a la main le fichier test qui va les contenir .
- Implementer les tests avec la syntaxe BDD
- Creer la classe (ici, PassengersPolicy) qui configure le lancement de JBehave.
Elle etend JUnitStory. Surcharger les methodes <configuration> et <stepsFactory> comme decrit.
On lui dit que le resultat se fait au niveau de la console et on lui indique le nom du fichier
de test a executer (dans notre cas PassengersPolicy)
- Run passengersPolicyStory
- Si vous avez des erreurs du type : org.jbehave.core.io.StoryResourceNotFound: Story path 'airport/passenger_policy_story.story' not found
c'est que vous avez probablement fait une typo dans le nom des fichiers. 
ex  : passengers_policy_story.story et PassengerPolicyStory qui contient la conf



