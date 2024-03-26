package Base;

import org.openqa.selenium.WebDriver;

import PomPages.HomePage;
import Utils.LogUtility;
import Utils.PropertyFile;
import Utils.Validation;
import Utils.WebdriverUtility;


public class BaseClass {
	
	public static WebDriver driver;
	 public WebdriverUtility webUtils= new WebdriverUtility(driver);
	 public LogUtility logutils=new LogUtility();
	 public Validation validation=new Validation();
     public PropertyFile propertyfile=new PropertyFile();
     public HomePage homePage;



}
