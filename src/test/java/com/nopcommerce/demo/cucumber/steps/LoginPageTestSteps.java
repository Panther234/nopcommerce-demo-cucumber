package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageTestSteps {

    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User clicks on login link$")
    public void userClicksOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^User should navigate to login page$")
    public void userShouldNavigateToLoginPage() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @And("^User enters email$")
    public void userEntersEmail() {
        new LoginPage().enterRandomEmailId();
    }

    @And("^User clicks on login button$")
    public void userClicksOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^User can see the error message$")
    public void userCanSeeTheErrorMessage() {
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals("Login failed",expectedErrorMessage, new LoginPage().getErrorMessage());
    }

    @Then("^User can see the log out link is displayed$")
    public void userCanSeeTheLogOutLinkIsDisplayed() {
        new HomePage().logoutLinkDisplayed();
    }

    @And("^User clicks on logout link$")
    public void userClicksOnLogoutLink() {
        new HomePage().clickOnLogoutLink();
    }

    @Then("^User can see the login link displayed$")
    public void userCanSeeTheLoginLinkDisplayed() {
        new HomePage().loginLinkDisplayed();
    }

    @And("^User enters password \"([^\"]*)\"$")
    public void userEntersPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^User enters email \"([^\"]*)\"$")
    public void userEntersEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

}
