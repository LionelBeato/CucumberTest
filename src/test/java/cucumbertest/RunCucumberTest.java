package cucumbertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


 /* Cucumber allows code to match plain english acceptance tests
  * it pulls data from simple .feature files
  * it heavily uses Gherkin as a language
  */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", plugin = {"pretty"})
public class RunCucumberTest {
}
