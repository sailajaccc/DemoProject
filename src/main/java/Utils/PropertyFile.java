package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public String readDataFromPropertyFile(String key)  {
		try {
		FileInputStream fis;
	
			fis = new FileInputStream(ConstantUtility.propertyFile);
	
		Properties pObj = new Properties();
		
			pObj.load(fis);
			String value = pObj.getProperty(key);
			return value;
		}catch(IOException e) {
		e.printStackTrace();
		return key;
		
	}
	}
}


