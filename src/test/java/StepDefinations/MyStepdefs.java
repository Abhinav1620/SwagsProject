package StepDefinations;

import Actions.Operations;
import BaseClass.BaseDrivers;
import Objects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends Operations {
    String username;
    String password;
    LoginPage loginPage = new LoginPage(BaseDrivers.driver);
    @Given("I navigated to portal")
    public void iNavigatedToPortal() {
        BaseDrivers.driver.get("https://www.saucedemo.com/");
    }

    @And("Enter {string} and {string}")
    public void enterAnd(String arg0, String arg1) {
        username=arg0;
        password=arg1;
        type(loginPage.username(), arg0);
        type(loginPage.password(), arg1);
    }

    @When("I click on login")
    public void iClickOnLogin() {
        clickMethod(loginPage.loginBTN());
    }

    @Then("I should be able to see dashboard")
    public void iShouldBeAbleToSeeDashboard() {
        System.out.println("passs");
    }
}
