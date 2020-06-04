package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.HashMap;

public class ApiWaiterSteps extends ScenarioSteps {
    final String CREATE_Waiter = "https://localhost:5003/api/waiter";
    public void createWaiter(String name, String lastname, String password, String email, String gender, String birthdate) {
        HashMap<String,String> postContent =new HashMap<>();
        postContent.put("firstName",name);
        postContent.put("lastName",lastname);
        postContent.put("password",password);
        postContent.put("gender",gender);
        postContent.put("birthDate",birthdate);
        postContent.put("email",email);
        SerenityRest.given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .body(postContent).when().post(CREATE_Waiter)
                .then().assertThat().statusCode(200);
    }
}
