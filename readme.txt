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
