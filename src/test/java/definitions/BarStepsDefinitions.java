package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiBarSteps;
import steps.ApiChefSteps;

public class BarStepsDefinitions {
    @Steps
    ApiBarSteps apibarSteps;


    @Then("^bartender should created$")
    public void bartenderShouldCreated() {
    }

    @Given("^I create bartender with name \"([^\"]*)\" and last name \"([^\"]*)\" and password \"([^\"]*)\" and email \"([^\"]*)\" and gender \"([^\"]*)\" and birthdate \"([^\"]*)\"$")
    public void iCreateBartenderWithNameAndLastNameAndPasswordAndEmailAndGenderAndBirthdate(String firstName, String lastName, String email, String password, String gender, String birthdate) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        apibarSteps.createBartender(firstName,lastName,email,password,gender,birthdate);
    }
}
