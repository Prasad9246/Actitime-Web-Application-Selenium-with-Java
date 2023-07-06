package actitimeDemoAssinment;

import java.io.IOException;

public class CustomerProjectTaskDisplay {
	boolean flag = false;
	FindWebElement findWebElement = new FindWebElement();
	TestCaseVerify testCaseDataFile = new TestCaseVerify();


	/**
	 * To verifing Created Customer Display Or Not and Also verifing Deleted
	 * Customer Display Or Not
	 * 
	 * @author Prasad
	 * 
	 */

	protected void customerDisplayOrNot() throws IOException, InterruptedException {
		try {

			flag = findWebElement.getWebElement(ByXpathDemo.CREATECUSTOMERDISPLAY).isDisplayed();
			if (flag)
				testCaseDataFile.linkVerify("customerDisplay", "Display", "Display");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			testCaseDataFile.linkVerify("deletedCustomerNotDisplay", "NotDisplay", "NotDisplay");
		}
	}

	/**
	 * To verifing Created Project Display Or Not and also verifing Deleted Project
	 * Display Or Not
	 * 
	 * @author Prasad
	 * 
	 */
	protected void projectDisplayOrNot() throws IOException, InterruptedException {
		try {

			flag = findWebElement.getWebElement(ByXpathDemo.CREATEPROJECTDISPLAY).isDisplayed();
			if (flag)
				testCaseDataFile.linkVerify("projectDisplay", "Display", "Display");

		} catch (org.openqa.selenium.NoSuchElementException e) {
			testCaseDataFile.linkVerify("deletedProjectNotDisplay", "NotDisplay", "NotDisplay");

		}
	}

	/**
	 * To verifing Created Task Display Or Not and also verifing Deleted Task
	 * Display Or Not
	 * 
	 * @author Prasad
	 * 
	 */
	protected void taskDisplayOrNot() throws IOException, InterruptedException {
		try {
			flag = findWebElement.getWebElement(ByXpathDemo.TASKDISPLAY).isDisplayed();
			if (flag)
				testCaseDataFile.linkVerify("taskDisplay", "Display", "Display");

		} catch (org.openqa.selenium.NoSuchElementException e) {
			testCaseDataFile.linkVerify("deletedTaskNotDisplay", "NotDisplay", "NotDisplay");

		}
	}
}
