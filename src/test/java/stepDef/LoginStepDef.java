package stepDef;

import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class LoginStepDef {

    public static WebDriver driver;

    LoginPage loginPage;

    @Given("User berada di halaman login")
    public void user_berada_di_halaman_login() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
    }

    @When("User input username {string}")
    public void user_input_username(String username) {

        loginPage.inputUsername(username);
    }

    @And("User input password {string}")
    public void user_input_password(String password) {

        loginPage.inputPassword(password);
    }

    @And("User klik tombol login")
    public void user_klik_tombol_login() {

        loginPage.clickLogin();
    }

    @Then("User berhasil login")
    public void user_berhasil_login() {

        assertTrue(
                driver.getCurrentUrl()
                        .contains("inventory")
        );
    }

    @Then("Error message tampil")
    public void error_message_tampil() {

        assertTrue(
                loginPage.errorDisplayed()
        );

        System.out.println(
                loginPage.getErrorMessage()
        );
    }
}