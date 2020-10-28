package cucumbertest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utility.Utility.statusOfIceCaps;

public class PenguinSteps {

    Integer amountOfPunts;
    String actual;

    @Given("I punted less than 60 penguins")
    public void iPuntedLessThan60Penguins(){
        amountOfPunts = 34;
    }

    @Given("I punted 60 or more penguins")
    public void iPunted60OrMorePenguins(){
        amountOfPunts = 61;
    }

    @When("I check the status of the ice caps")
    public void iCheckTheStatusOfTheIceCaps(){
        actual = statusOfIceCaps(amountOfPunts);
    }

    @Then("the ice caps should be {string}")
    public void theIceCapsShouldBe(String expected){
        assertEquals(expected, actual);
    }

}
