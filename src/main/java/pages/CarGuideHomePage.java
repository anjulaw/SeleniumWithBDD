package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarGuideHomePage extends AbstractPage {

    public static final By searchBarSection = By.id("cgAppCarsForSaleForm");
    public static final By submitButton = By.id("search-submit");

    public static final By carMakeDropDown = By.id("makes");
    public static final By carModelDropDown = By.id("models");

    public static final By carMakeOptions = By.xpath("//select[@id='makes']/option");
    public static final By carModelOptions = By.xpath("//select[@id='models']/option");
    public CarGuideHomePage(WebDriver driver){
        super(driver,searchBarSection);
    }

    public CarGuideHomePage selectCarMake(String carMake){
        actionClass.selectItemFromDropDown(carMakeDropDown,carMakeOptions,carMake);
        return this;
    }

    public CarGuideHomePage selectCarModel(String carModel){
        actionClass.selectItemFromDropDown(carModelDropDown,carModelOptions,carModel);
        return this;
    }

    public CarSearchResultPage clickShowMeCarsButton(){
        actionClass.click(submitButton);
        return new CarSearchResultPage(driver);
    }
}
