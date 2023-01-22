package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user navigates to the facebook website")
    public void user_navigates_to_the_facebook_website() {
        System.out.println("Given - user navigates to the facebook website");
    }
    @When("user validate the homepage title")
    public void user_validate_the_homepage_title() {
        System.out.println("When - user validate the homepage title");
    }
    @Then("user enters {string} username")
    public void user_enters_username(String username) {
        System.out.println("Then - user enters username " + username);
    }
    @And("user enters {string} password")
    public void user_enters_password(String password) {
        System.out.println("user enters password " + password);
    }
    @And("user clicks on the signIn button")
    public void user_clicks_on_the_sign_in_button() {
        System.out.println("user clicks on the signIn button");
    }

}
