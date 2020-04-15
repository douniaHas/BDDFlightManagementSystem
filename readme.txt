-   Resultats de la couverture de code : target/site/jacoco/FlightManagement/*.html
-   Reecriture des tests en utilisant : @Nested et @DisplayName de Junit-5 pour profiter de la clarte du BDD
avec le GHERKIN (GIVEN-WHEN-THEN)
-   Utilisation de assertAll de Junit-5 et java 8 pour grouper les assertions par unite de sens
-   Rajouter la dependance Cucumber et Creer les repertoires test/resources/features
-   Verifier que les plugins <Cucumber for Java> et <Gherkin> sont coches dans settings/plugins

Creer les features :
-   Creer un dossier resources et le definir comme <Test Resources Root>
-   Ajouter un fichier xx.feature ou vous definissez les features en style Gherkin
-   Creer le fichier CucumberTest avec le template fourni, le test Cucumber execute tous les tests qui sont dans le
meme package
-   Creer la feature dans xx.feature
-   run CucumberTest -> KO
-   On retourne sur xx.feature. Intellij nous propose de creer les steps manquants dans le fichier de tests BDD
-   On les rajoute puis run -> KO
-   On rajoute le code en TDD jusqu'à avoir tous les tests qui passent
-   On verifie que la couverture de code est de 100%

-   Executer Mvn verify
-   Rapports Serenity presents dans le repertoire target/site/serenity -> afficher index.html
-   Si index.html s'affiche mais avec des résultats à 0% alors que run CucumberTest donne 100%, il faudra essayer
mvn serenity:aggregate





