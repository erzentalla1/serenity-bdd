package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.steps.ScenarioSteps;
import pages.WaiterPage;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WaiterSteps extends ScenarioSteps {

    WaiterPage waiterPage;

    public void createWaiter(String name, String lastname, String password, String email, String gender, String bdate){

        waiterPage.getNameInput().type(name);
        waiterPage.getLastnameInput().type(lastname);
        waiterPage.getEmailInput().type(email);
        waiterPage.getPasswordInput().type(password);
        waiterPage.getGenderInput().type(gender);
        waiterPage.getBirthdateInput().type(bdate);
        waiterPage.getLoginButton().click();
    }
}
