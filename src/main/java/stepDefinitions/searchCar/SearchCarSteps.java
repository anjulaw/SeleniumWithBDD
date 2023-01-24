package stepDefinitions.searchCar;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CarGuideHomePage;
import pages.CarSearchResultPage;
import stepDefinitions.UITestCase;
import utils.MainConfig;

public class SearchCarSteps {

    CarGuideHomePage carGuideHomePage;
    CarSearchResultPage carSearchResultPage;

    @Given("I am on the Home Page {string} of CarsGuide Website")
    public void i_am_on_the_home_page_of_cars_guide_website(String string) {
        UITestCase.browseToUrl(MainConfig.baseUrl);

    }

    @When("I select {string} as car make and {string} as model")
    public void i_select_as_car_make_and_as_model(String carMake, String carModel) {
        carGuideHomePage = new CarGuideHomePage(UITestCase.driver);
        carGuideHomePage
                .selectCarMake(carMake)
                .selectCarModel(carModel);
    }
    @When("I move to Car For Sale Menu")
    public void i_move_to_car_for_sale_menu(io.cucumber.datatable.DataTable dataTable) {

    }
    @And("click on {string} link")
    public void click_on_link(String string) {

    }
    @And("select carbrand as {string} from AnyMake dropdown")
    public void select_carbrand_as_from_any_make_dropdown(String string) {

    }
    @And("select {string} as car model")
    public void select_as_car_model(String string) {

    }
    @And("select location as {string} from SelectLocation dropdown")
    public void select_location_as_from_select_location_dropdown(String string) {

    }
    @And("select {string} as price")
    public void select_as_price(String string) {

    }
    @And("click on Find_My_Next_Car button")
    public void click_on_find_my_next_car_button() {
        carSearchResultPage = carGuideHomePage.clickShowMeCarsButton();
    }
    @Then("I should see list of searched cars")
    public void i_should_see_list_of_searched_cars() {

    }
    @And("the page title should be {string}")
    public void the_page_title_should_be(String string) {

    }
}
