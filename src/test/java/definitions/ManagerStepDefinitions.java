package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiBarSteps;
import steps.ApiManagerSteps;

public class ManagerStepDefinitions {
    @Steps
    ApiManagerSteps apimanagerSteps;
    @Given("^I create manager with name \"([^\"]*)\" and last name \"([^\"]*)\" and password \"([^\"]*)\" and email \"([^\"]*)\" and gender \"([^\"]*)\" and birthdate \"([^\"]*)\"$")
    public void iCreateManagerWithNameAndLastNameAndPasswordAndEmailAndGenderAndBirthdate(String firstName, String lastName, String email, String password, String gender, String birthdate) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        apimanagerSteps.createManager(firstName,lastName,password,email,gender,birthdate);
    }

    @Then("^manager should created$")
    public void managerShouldCreated() {
    }
}
