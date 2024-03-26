package Utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

//import com.aventstack.extentreports.util.Assert;

public class Validation {
	
	
	public void validation(String expected, WebElement element) {
		String actual = getText(element);
		String expect ="" ;
		if(actual.contains(expect)) {
			assertionTrue(true);
		}else {
			assertionTrue(false);
		}
	}

	public void assertionTrue(boolean value) {
		Assert.assertTrue(value);
	}
	
	public String getText(WebElement element) {
		 return element.getText();
	}
	
	public void asserEqualswithStrings(String Expect,String Actual) {
		Assert.assertEquals(Expect, Actual);
	}

}
