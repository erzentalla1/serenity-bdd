package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiBarSteps;
import steps.ApiReportSteps;

public class ReportStepdefinitions {
    @Steps
    ApiReportSteps apireportSteps;
    @Given("^I create report with reportType \"([^\"]*)\" and  ReportDate \"([^\"]*)\"$")
    public void iCreateReportWithReportTypeAndReportDate(String reportType, String ReportDate) throws Throwable {
        apireportSteps.createReport(reportType,ReportDate);

    }

    @Then("^report should created$")
    public void reportShouldCreated() {
    }
}
