package cucumbertest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import java.util.List;
import java.util.regex.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static utility.Utility.averageCalculator;

public class BowlingSteps {

    private List<Integer> scores;
    private Double actual;
    private Double perfectScore;

//    your steps are below
//    these pull directly from any matching feature file
    @Given("a set of scores:")
    public void aSetOfScores(List<Integer> scores){
        this.scores = scores;
    }

    @When("I calculate average")
    public void iCalculateAverage(){
        actual = averageCalculator(scores);
    }

    @Then("my score is not a perfect score")
    public void myScoreIsNotAPerfectScore(){
        perfectScore = 300.00;
        assertThat(perfectScore, Matchers.greaterThan(actual));
    }

    @Then("my score is a perfect score")
    public void myScoreIsAPerfectScore(){
        perfectScore = 300.00;
        System.out.println("This is my actual average: " + actual);
        assertThat(perfectScore, Matchers.equalTo(actual));
    }
}
