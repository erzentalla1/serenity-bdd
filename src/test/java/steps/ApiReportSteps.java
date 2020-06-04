package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.HashMap;

public class ApiReportSteps extends ScenarioSteps {
    final String CREATE_REPORT = "https://localhost:5011/api/report";
    public void createReport(String reportType, String reportDate) {
        HashMap<String,String> postContent =new HashMap<>();
        postContent.put("reportType",reportType);
        postContent.put("reportDate",reportDate);
        SerenityRest.given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .body(postContent).when().post(CREATE_REPORT)
                .then().assertThat().statusCode(200);

    }
}
