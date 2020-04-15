package FlightManagment;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Entry point for running the Cucumber tests in JUnit.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	plugin = {"pretty"},
	snippets = SnippetType.CAMELCASE,
	features = "classpath:features")
public class CucumberTest {

	/**
	 * This class should be empty, step definitions should be in separate classes.
	 */

}
