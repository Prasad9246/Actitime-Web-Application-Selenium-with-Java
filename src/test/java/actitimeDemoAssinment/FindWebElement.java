package actitimeDemoAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FindWebElement {

	/**
	 * To finding the WebElement 
	 * @return WebElement
	 * @author Prasad
	 * 
	 */
	protected WebElement getWebElement(By by) {
		return LaunchBrowser.driver.findElement(by);
	}

	/**
	 * Passing the value to WebElement 
	 * @author Prasad
	 * 
	 */
	protected void type(By by, String value) {
		getWebElement(by).sendKeys(value);
	}

	/**
	 * Getting the CurrentUrl of page
	 * @return String
	 * @author Prasad
	 * 
	 */
	protected String myGetCurrentUrl() {
		return LaunchBrowser.driver.getCurrentUrl();
	}

	/**
	 * To click on WebElement Button / Link
	 * @author Prasad
	 * 
	 */
	protected void myClick(By by) {
		getWebElement(by).click();
	}

	/**
	 * Getting a text on the page
	 * @return String
	 * @author Prasad
	 * 
	 */
	protected String myGetText(By by) {
		return getWebElement(by).getText();
	}
	
	/**
	 * Clear the text Field
	 * @author Prasad
	 * 
	 */
	protected void myClear(By by) {
		getWebElement(by).clear();
	}

	/**
	 * Selecting value of the dropdown list
	 * @author Prasad
	 * 
	 */
	
	protected void mySelect(By by, String name) {
		WebElement ddl = getWebElement(by);
		Select select = new Select(ddl);
		select.selectByVisibleText(name);
	}

}
