package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.HashMap;

public class ApiPaymentSteps extends ScenarioSteps {
    final String CREATE_PAYMENT = "https://localhost:5007/api/payment";
    public void createPayment(String paymentType, int paymentAmount, int uid, String paymentDate) {
        HashMap<String,String> postContent =new HashMap<>();
        postContent.put("paymentType",paymentType);
        postContent.put("paymentAmount", String.valueOf(paymentAmount));
        postContent.put("uid", String.valueOf(uid));
        postContent.put("paymentDate",paymentDate);

        SerenityRest.given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .body(postContent).when().post(CREATE_PAYMENT)
                .then().assertThat().statusCode(200);
    }
}
