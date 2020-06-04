package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.HashMap;

public class ApiManagerSteps extends ScenarioSteps {
    final String CREATE_Manager = "https://localhost:5013/api/manager";
    public void createManager(String firstName, String lastName, String email, String password, String gender, String birthDate) {
        HashMap<String,String> postContent =new HashMap<>();
        postContent.put("firstName",firstName);
        postContent.put("lastName",lastName);
        postContent.put("password",password);
        postContent.put("gender",gender);
        postContent.put("birthDate",birthDate);
        postContent.put("email",email);

        SerenityRest.given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .body(postContent).when().post(CREATE_Manager)
                .then().assertThat().statusCode(200);
    }
}
