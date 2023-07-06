package actitimeDemoAssinment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class CustomerDataProperties {
	
	final String RESOURCE_PATH = System.getProperty("user.dir");
	/**
	 * Getting the value to Properties file of customer
	 * @return String
	 * @author Prasad
	 *
	 */
	protected String cuatomerData(String key) throws IOException {
		String fiName = RESOURCE_PATH +"/src/test/java/actitimeDemoAssinment/customerData.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(fiName);
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	

}
