package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.HashMap;

public class ApiOrderSteps extends ScenarioSteps {
    final String CREATE_Order = "https://localhost:5005/api/order";
    public void createOrder(String orderName, String orderType, String orderdate, int wid, int bid, int chid) {
        HashMap<String,String> postContent =new HashMap<>();
        postContent.put("orderName",orderName);
        postContent.put("orderType",orderType);
        postContent.put("orderdate",orderdate);
        postContent.put("wid", String.valueOf(wid));
        postContent.put("bid", String.valueOf(bid));
        postContent.put("chid", String.valueOf(chid));
        SerenityRest.given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .body(postContent).when().post(CREATE_Order)
                .then().assertThat().statusCode(200);

    }
}
