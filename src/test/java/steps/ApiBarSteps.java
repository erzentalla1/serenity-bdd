package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.HashMap;

public class ApiBarSteps extends ScenarioSteps {
    final String CREATE_Bartender = "https://localhost:5010/api/bar";
    public void createBartender(String firstName, String lastName,String email, String password, String gender, String birthDate) {
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
                .body(postContent).when().post(CREATE_Bartender)
                .then().assertThat().statusCode(200);

    }
}
