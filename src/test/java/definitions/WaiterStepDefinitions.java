package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiReportSteps;
import steps.ApiWaiterSteps;
import steps.WaiterSteps;

public class WaiterStepDefinitions {
    @Steps
    ApiWaiterSteps apiwaiterSteps;

    @Steps
    WaiterSteps waiterSteps;

    @Given("^I create waiter with name \"([^\"]*)\" and last name \"([^\"]*)\" and password \"([^\"]*)\" and email \"([^\"]*)\" and gender \"([^\"]*)\" and birthdate \"([^\"]*)\"$")
    public void iCreateWaiterWithNameAndLastNameAndPasswordAndEmailAndGenderAndBirthdate(String name, String lastname, String password, String email, String gender, String birthdate) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        apiwaiterSteps.createWaiter(name,lastname,password,email,gender,birthdate);
    }

    @Then("^waiter should created$")
    public void waiterShouldCreated() {
    }

    @Given("^I create waiter by filling fields with name \"([^\"]*)\" and last name \"([^\"]*)\" and password \"([^\"]*)\" and email \"([^\"]*)\" and gender \"([^\"]*)\" and birthdate \"([^\"]*)\"$")
    public void iCreateWaiterByFillingFieldsWithNameAndLastNameAndPasswordAndEmailAndGenderAndBirthdate(String name, String lastname, String password, String email, String gender, String bdate) throws Throwable {
        waiterSteps.createWaiter(name, lastname, password, email, gender, bdate);
    }

    @Then("^Waiter should be created$")
    public void waiterShouldBeCreated() {

    }
}
