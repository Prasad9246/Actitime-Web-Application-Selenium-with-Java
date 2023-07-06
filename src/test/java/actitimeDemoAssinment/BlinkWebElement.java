package actitimeDemoAssinment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BlinkWebElement {

	byte ticks = 100;
	FindWebElement findWebElement = new FindWebElement();
	CustomerDataProperties propertiesCustomerData = new CustomerDataProperties();

	/**
	 * Blinking or stable the text field with different colors
	 * 
	 * @author Prasad
	 *
	 */
	protected void WebElementBlinkWithColor(WebElement element) throws IOException {
		String highLight = propertiesCustomerData.cuatomerData("highlight");
		String backgroundColor = propertiesCustomerData.cuatomerData("backgroundColor");
		String borderColor = propertiesCustomerData.cuatomerData("borderColor");
		String flag = "yes";
		JavascriptExecutor js = (JavascriptExecutor) LaunchBrowser.driver;
		String color1 = "arguments[0].setAttribute('style', 'background: ";
		String color2 = "; \" + \"border: 3px solid ";
		String color3 = ";');";
		if (highLight.equals(flag)) {
			highlight(js, element, ticks);

		} else {
			js.executeScript(color1 + backgroundColor + color2 + borderColor + color3, element);
		}

	}

	/**
	 * Text field original color
	 * 
	 * @author Prasad
	 *
	 */
	protected void WebElementOriginalColor(WebElement element) throws IOException {
		String borderColor = propertiesCustomerData.cuatomerData("borderColor");
		JavascriptExecutor js = (JavascriptExecutor) LaunchBrowser.driver;
		String color1 = "arguments[0].setAttribute('style', 'background: white; " + "border: 3px solid ";
		String color2 = ";');";
		js.executeScript(color1 + borderColor + color2, element);

	}

	/**
	 * Bilinking Text field with different color
	 * 
	 * @author Prasad
	 *
	 */
	protected void highlight(JavascriptExecutor js, WebElement element, int ticks) throws IOException {
		String backgroundColor = propertiesCustomerData.cuatomerData("backgroundColor");
		String color1 = "arguments[0].style.backgroundColor='";
		String color2 = "'";

		for (int i = 0; i < ticks; i++) {
			if (i % 2 == 0)
				js.executeScript(color1 + backgroundColor + color2, element);
			else
				js.executeScript("arguments[0].style.backgroundColor='white'", element);
		}
	}

	/**
	 * Text field Bilinking , stable color and original color
	 * 
	 * @author Prasad
	 *
	 */
	protected void originalAndColor(String field, By typeXpath) throws IOException {
		String clientDemo = propertiesCustomerData.cuatomerData("clientDemoColor");
		String flag = "true";

		if (field.equals("color")) {
			if (clientDemo.equals(flag)) {
				WebElementBlinkWithColor(findWebElement.getWebElement(typeXpath));
			}

		} else if (field.equals("original")) {
			if (clientDemo.equals(flag)) {
				WebElementOriginalColor(findWebElement.getWebElement(typeXpath));
			}
		}

	}
}
