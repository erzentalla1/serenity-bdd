package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by Ardit Podrimaj
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginPage extends AbstractPage {

    @FindBy(id = "name")
    WebElementFacade nameInput;

    @FindBy(id = "password")
    WebElementFacade passwordInput;

    public WebElementFacade getNameInput() {
        return nameInput;
    }

    public WebElementFacade getPasswordInput() {
        return passwordInput;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    @FindBy(css = "[value=\"Login\"]")
    WebElementFacade loginButton;
}