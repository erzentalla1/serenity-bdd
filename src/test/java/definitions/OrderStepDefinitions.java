package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiManagerSteps;
import steps.ApiOrderSteps;

public class OrderStepDefinitions {
    @Steps
    ApiOrderSteps apiorderSteps;
    @Given("^I create order with orderName \"([^\"]*)\" and orderType \"([^\"]*)\"  and orderdate \"([^\"]*)\" and WID (\\d+) and BID (\\d+) and CHID (\\d+)$")
    public void iCreateOrderWithOrderNameAndOrderTypeAndOrderdateAndWIDAndBIDAndCHID(String orderName, String orderType, String orderdate, int WID, int BID, int CHID) throws Throwable {
        apiorderSteps.createOrder(orderName,orderType,orderdate,WID,BID,CHID);
    }

    @Then("^order should created$")
    public void orderShouldCreated() {
    }
}
