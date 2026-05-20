import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach
    public void setUp() {

        System.out.println("Tes dimulai");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);

        System.out.println("Website terbuka");
    }

    @Test
    public void loginTest() {

        assertTrue(
                loginPage.logoDisplayed()
        );

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        System.out.println("Login berhasil");
    }

    @Test
    public void loginFailedTest() {

        loginPage.login(
                "wrong_user",
                "wrong_pass"
        );

        assertTrue(
                loginPage.errorDisplayed()
        );

        System.out.println(
                "Error Message: " + loginPage.getErrorMessage()
        );
    }

    @AfterEach
    public void tearDown() {

//        driver.quit();

    }
}