package actitimeDemoAssinment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LaunchBrowser {
	static WebDriver driver;

	/**
	 * To Set a browser to Run the Program
	 * @author Prasad
	 * @throws IOException
	 * 
	 */
	@SuppressWarnings("deprecation")
	protected void setBrowser() throws IOException {
		CustomerDataProperties customerDataProperties = new CustomerDataProperties();
		String name = customerDataProperties.cuatomerData("browser");
		String headLess = customerDataProperties.cuatomerData("headLessYesOrNot");
		String url = customerDataProperties.cuatomerData("url");
		ChromeOptions chromeOptions = new ChromeOptions();
		EdgeOptions edgeOptions = new EdgeOptions();
		FirefoxOptions firefoxOptions = new FirefoxOptions();

		switch (name.toUpperCase()) {
		case "CHROME":
			if (headLess.equals("yes")) {
				chromeOptions.setHeadless(true);
				driver = new ChromeDriver(chromeOptions);
			} else {
				driver = new ChromeDriver();
			}
			break;
		case "FIREFOX":
			if (headLess.equals("yes")) {
				firefoxOptions.setHeadless(true);
				driver = new FirefoxDriver(firefoxOptions);
			} else {
				driver = new FirefoxDriver();
			}
			break;
		case "EDGE":
			if (headLess.equals("yes")) {
				edgeOptions.setHeadless(true);
				driver = new EdgeDriver(edgeOptions);
			} else {
				driver = new EdgeDriver();
			}
			break;
			default : throw new RuntimeException("Invalid browser : " + name);
		}
		driver.get(url);

	}
}
