package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public boolean logoDisplayed() {

        return isDisplayed(
                LoginPageLocator.logo
        );
    }

    public void inputUsername(String username) {

        setText(
                LoginPageLocator.username,
                username
        );
    }

    public void inputPassword(String password) {

        setText(
                LoginPageLocator.password,
                password
        );
    }

    public void clickLogin() {

        click(
                LoginPageLocator.loginButton
        );
    }

    public void login(String username, String password) {

        inputUsername(username);
        inputPassword(password);
        clickLogin();
    }

    public String getErrorMessage() {

        return getText(
                LoginPageLocator.errorMessage
        );
    }

    public boolean errorDisplayed() {

        return isDisplayed(
                LoginPageLocator.errorMessage
        );
    }
}