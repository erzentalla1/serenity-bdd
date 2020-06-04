package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiManagerSteps;
import steps.ApiPaymentSteps;

public class PaymentStepDefinitions {
    @Steps
    ApiPaymentSteps apipaymentSteps;
    @Given("^I create payment with paymentType \"([^\"]*)\" and paymentAmount (\\d+) and UID (\\d+)  and paymentDate \"([^\"]*)\"$")
    public void iCreatePaymentWithPaymentTypeAndPaymentAmountAndUIDAndPaymentDate(String paymentType, int paymentAmount, int UID, String paymentDate) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        apipaymentSteps.createPayment(paymentType,paymentAmount,UID,paymentDate);
    }

    @Then("^payment should created$")
    public void paymentShouldCreated() {
    }
}
