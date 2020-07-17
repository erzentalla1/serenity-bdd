package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WaiterPage extends AbstractPage {

    @FindBy(id = "name")
    WebElementFacade nameInput;

    @FindBy(id = "lastname")
    WebElementFacade lastnameInput;

    @FindBy(id = "gender")
    WebElementFacade genderInput;

    @FindBy(id = "email")
    WebElementFacade emailInput;

    @FindBy(id = "password")
    WebElementFacade passwordInput;

    @FindBy(id = "birthdate")
    WebElementFacade birthdateInput;

    public WebElementFacade getEmailInput() {
        return emailInput;
    }

    public WebElementFacade getPasswordInput() {
        return passwordInput;
    }

    public WebElementFacade getNameInput() {
        return nameInput;
    }

    public WebElementFacade getLastnameInput() {
        return lastnameInput;
    }

    public WebElementFacade getGenderInput() {
        return genderInput;
    }

    public WebElementFacade getBirthdateInput() {
        return birthdateInput;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    @FindBy(css = "[value=\"Login\"]")
    WebElementFacade loginButton;
}
