package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ContactUsSteps  {

    private String url = "http://www.webdriveruniversity.com/Contact-Us/contactus.html";

    @Given("I access the webdriver univesity contact us page")
    public void i_access_the_webdriver_univesity_contact_us_page() {
        UITestCase.browseToUrl(url);
    }
    @When("I enter a first name")
    public void i_enter_a_first_name() {

    }
    @And("I enter a lst name")
    public void i_enter_a_lst_name() {

    }
    @And("I enter a email address")
    public void i_enter_a_email_address() {

    }
    @And("I enter a comment")
    public void i_enter_a_comment() {

    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {

    }
    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {

    }
}
