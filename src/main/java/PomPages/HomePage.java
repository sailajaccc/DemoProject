package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
import Utils.WebdriverUtility;

public class HomePage extends BaseClass {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#findCarText")
	public WebElement findCars;

	@FindBy(css = "#closeLocIcon")
	public WebElement closeBtn;
	
	@FindBy(xpath=" //span[contains(text(),'Maruti ')] [1]")
	public WebElement textbox;
	

	@FindBy(xpath = "//span[@title='Petrol'][1]")
	public WebElement selectCar;

	@FindBy(xpath = "//h1[contains(text(),'2022 BMW 5')][1]")
	public WebElement cartPrice;

	@FindBy(xpath = "//div[contains(@class,'o-cpnu')]")
	public WebElement price;

	public void Find() {

		findCars.click();

	}

	public void closeButton() throws InterruptedException {
		Thread.sleep(5000);
		closeBtn.click();
	}

	public void clickOnCar() {
		webUtils.scrollAction(driver);
		textbox.click();
		selectCar.click();
		
		String strExpectedText = cartPrice.getText();
		webUtils.scrollAction(driver);
		selectCar.click();

	}

	public void verifyPrice() {
		String strExpectedText = cartPrice.getText();
		validation.asserEqualswithStrings(strExpectedText, propertyfile.readDataFromPropertyFile("ActualPrice"));

	}

}
