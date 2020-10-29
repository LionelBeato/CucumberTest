package cucumbertest;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import utility.Utility;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalcSteps {

    private int total;
    private Utility calculator;

    @Before
    private void init(){
        total = -999;
    }

//    your steps are below
//    these pull directly from any matching feature file
    @Given("^I have a calculator")
    public void initializeCalculator(){
        calculator = new Utility();
    }

    @When("^I add (-?\\d+) and (-?\\d+)$")
    public void testAdd(int num1, int num2){
        total = calculator.add(num1, num2);
    }

    @Then("^the result should be (-?\\d+)$")
    public void validateResult(int result){
        /* below is a call to Hamcrest via equalTo()
         * Hamcrest allows for more flexible tests
         * that are easier to read
         */
        assertThat(total, equalTo(result));
    }

}
