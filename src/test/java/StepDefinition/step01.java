package StepDefinition;


import Base.BaseClass;
import PomPages.HomePage;
import Utils.PropertyFile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step01 extends BaseClass{
	
	BaseClass base = new BaseClass();
	PropertyFile plib = new PropertyFile();
	HomePage home;
	
	
	@Given("Navigate to the application using url")
	public void navigate_to_the_application_using_url() {
	  String Url=propertyfile.readDataFromPropertyFile("Url");
	  driver.get(Url);
	  webUtils.maximiseWindow(driver);
	}

	@When("click on the find cars button")
	public void click_on_the_find_cars_button() {
	  homePage=new HomePage(driver);
	  homePage.Find();
	}

	@When("Click on the selected the car")
	public void click_on_the_selected_the_car() throws InterruptedException {
	  homePage.closeButton();
	  homePage.clickOnCar();
	}

	@Then("Validate the price with {string}")
	public void validate_the_price_with(String Actualprice) {
	   homePage.verifyPrice();
	   
	}

}
