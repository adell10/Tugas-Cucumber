package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void beforeTest(Scenario scenario){

        System.out.println("===== TEST DIMULAI =====");
        System.out.println("Scenario: " + scenario.getName());
    }

    @After
    public void afterTest(Scenario scenario){

        System.out.println("===== TEST SELESAI =====");
        System.out.println("Status: " + scenario.getStatus());

        LoginStepDef.driver.quit();
    }
}