package actitimeDemoAssinment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSleepDemo {
	/**
	 * Explicit wait and Thread sleep
	 * 
	 * @author Prasad
	 *
	 */
	protected void waitSleep(By typeXpath) throws IOException, InterruptedException {
		String sleep = "yes";
		CustomerDataProperties customerDataProperties = new CustomerDataProperties();
		WebDriverWait wait = new WebDriverWait(LaunchBrowser.driver, Duration.ofSeconds(20));
		String clientDemoSleep = customerDataProperties.cuatomerData("clientDemoSleep");
		long time = Long.parseLong(customerDataProperties.cuatomerData("clintSleepTime"));
		
		if (clientDemoSleep.equals(sleep)) {
			Thread.sleep(time);
		} else {
			wait.until(ExpectedConditions.presenceOfElementLocated(typeXpath));
		}

	}

}
