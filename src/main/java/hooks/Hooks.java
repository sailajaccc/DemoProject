package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{

	
	String Browser="Edge";
	@Before
	public void Launch_browser() {
		switch(Browser) {
		case "Chrome":  launch_ChromeBrowser();break;
		case "Edge":  launch_EdgeBrowser();break;
		case "Firefox":  launch_FirefoxBrowser();break;
		}
	}	
	public void launch_ChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		System.out.println("ChromeBrowser launche successfully");
	}
	
	public void launch_EdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		System.out.println("EdgeBrowser launche successfully");
	}
	public void launch_FirefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		System.out.println("ChromeBrowser launche successfully");
	}
	

	
	@After
	public void Close_Browser(Scenario scenario) {
		
		if(scenario.isFailed()) {

			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			scenario.attach(screenshot, "image/png", scenario.getName());

			}
		driver.close();
	}
}



