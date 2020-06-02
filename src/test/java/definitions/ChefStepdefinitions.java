package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiChefSteps;

public class ChefStepdefinitions {
    @Steps
    ApiChefSteps apiChefSteps;
    @Given("^I create chef with name \"([^\"]*)\" and last name \"([^\"]*)\" and password \"([^\"]*)\" and gender \"([^\"]*)\" and birthdate \"([^\"]*)\"$")
    public void iCreateChefWithNameAndLastNameAndPasswordAndGenderAndBirthdate(String firstName, String lastName, String password, String gender, String birthDate) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        apiChefSteps.createUser(firstName,lastName,password,gender,birthDate);
    }

    @Then("^chef should created$")
    public void chefShouldCreated() {
    }
}
