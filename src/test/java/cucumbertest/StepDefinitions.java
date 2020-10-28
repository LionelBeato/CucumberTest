package cucumbertest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utility.Utility.isItFriday;

public class StepDefinitions {

    private String today;
    private String actual;

    @Given("today is Sunday")
    public void todayIsSunday(){
        today = "Sunday";
    }

    @Given("today is Friday")
    public void todayIsFriday(){
        today = "Friday";
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItsFridayYet(){
        actual = isItFriday(today);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expected){
        assertEquals(expected, "actual");
    }

}
