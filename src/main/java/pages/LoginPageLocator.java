package pages;

import org.openqa.selenium.By;

public class LoginPageLocator {

    public static By logo =
            By.className("login_logo");

    public static By username =
            By.tagName("input");

    public static By password =
            By.name("password");

    public static By loginButton =
            By.xpath("//input[@id='login-button']");

    public static By errorMessage =
            By.cssSelector("[data-test='error']");
}