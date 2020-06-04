package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiReportSteps;
import steps.ApiWaiterSteps;

public class WaiterStepDefinitions {
    @Steps
    ApiWaiterSteps apiwaiterSteps;
    @Given("^I create waiter with name \"([^\"]*)\" and last name \"([^\"]*)\" and password \"([^\"]*)\" and email \"([^\"]*)\" and gender \"([^\"]*)\" and birthdate \"([^\"]*)\"$")
    public void iCreateWaiterWithNameAndLastNameAndPasswordAndEmailAndGenderAndBirthdate(String name, String lastname, String password, String email, String gender, String birthdate) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        apiwaiterSteps.createWaiter(name,lastname,password,email,gender,birthdate);
    }

    @Then("^waiter should created$")
    public void waiterShouldCreated() {
    }
}
