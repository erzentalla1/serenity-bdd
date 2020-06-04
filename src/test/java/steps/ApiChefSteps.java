package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.HashMap;

public class ApiChefSteps extends ScenarioSteps {
    final String CREATE_CHEF = "https://localhost:5015/api/chef";
    @Step("Create user with parameters {0} & {1} & {2} & {3} & {4}")
    public void createUser(String firstName, String lastName, String password, String gender, String birthDate) {
        HashMap<String,String>postContent =new HashMap<>();
        postContent.put("firstName",firstName);
        postContent.put("lastName",lastName);
        postContent.put("password",password);
        postContent.put("gender",gender);
        postContent.put("birthDate",birthDate);
//getUsers
//        SerenityRest.given().relaxedHTTPSValidation().when().get(CREATE_CHEF).then().assertThat().statusCode(200);
        SerenityRest.given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .body(postContent).when().post(CREATE_CHEF)
                .then().assertThat().statusCode(200);


    }


}
