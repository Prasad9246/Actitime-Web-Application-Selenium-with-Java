package actitimeDemoAssinment;

import java.io.IOException;

public class CreateCustomerProject {

	TestCaseVerify testCaseDataFile = new TestCaseVerify();
	FindWebElement findWebElement = new FindWebElement();
	BlinkWebElement blinkWebElement = new BlinkWebElement();
	ExplicitWaitSleepDemo explicitWaitSleepDemo = new ExplicitWaitSleepDemo();
	CustomerDataProperties customerDataProperties = new CustomerDataProperties();
	TakePageScreenshot takePageScreenshot = new TakePageScreenshot();
	String actMsg, actUrl, expUrl, expMsg;

	/**
	 * open Creates Customer page and Creates New Customer
	 * 
	 * @author Prasad
	 */
	protected void getCreateNewCustomer() throws InterruptedException, IOException {
		String customerName = customerDataProperties.cuatomerData("companyName");
		String description = customerDataProperties.cuatomerData("description");
		String yesOrNo = customerDataProperties.cuatomerData("screenshotYesOrNo");
		String newCustomer = customerDataProperties.cuatomerData("canYouCreateNewCustomer");
		// Thread and Explicit wait
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.TASK);
		findWebElement.myClick(ByXpathDemo.TASK);

		// Thread.sleep(3000l);
		actUrl = findWebElement.myGetCurrentUrl();
		expUrl = "http://127.0.0.1/tasks/otasklist.do";
		testCaseDataFile.linkVerify("taskPageOpen", actUrl, expUrl);

		// Thread and Explicit wait
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.PROJECTANDCUSTOMER);

		findWebElement.myClick(ByXpathDemo.PROJECTANDCUSTOMER);
		// Thread.sleep(3000l);
		actUrl = findWebElement.myGetCurrentUrl();
		expUrl = "http://127.0.0.1/project/customers_projects.do";
		testCaseDataFile.linkVerify("projectAndCustomerPageOpen", actUrl, expUrl);

		if (newCustomer.equals("yes")) {

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.CREATECUSTOMER);

			findWebElement.myClick(ByXpathDemo.CREATECUSTOMER);
			// Thread.sleep(3000l);
			actUrl = findWebElement.myGetCurrentUrl();
			expUrl = "http://127.0.0.1/project/customeradd.do?resetForm=true";
			testCaseDataFile.linkVerify("newCustomerPageOpen", actUrl, expUrl);

			if (yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("createCustomer");
			}

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.CUSTOMERNAME);

			// customer name text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.CUSTOMERNAME);

			// send value to customerName text field
			findWebElement.type(ByXpathDemo.CUSTOMERNAME, customerName);
			// Thread.sleep(3000l);

			// customer name text field color white
			blinkWebElement.originalAndColor("original", ByXpathDemo.CUSTOMERNAME);

			// Description text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.DESCRIPTION);

			// send value description text field
			findWebElement.type(ByXpathDemo.DESCRIPTION, description);

			// Description text field color white
			blinkWebElement.originalAndColor("original", ByXpathDemo.DESCRIPTION);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.CREATEBLANKCUSTOMERRADIOBUTTON);

			findWebElement.myClick(ByXpathDemo.CREATEBLANKCUSTOMERRADIOBUTTON);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.CUSTOMERSUBMIT);

			findWebElement.myClick(ByXpathDemo.CUSTOMERSUBMIT);
			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.SUCCESSEFULLMASSAGE);

			actMsg = findWebElement.myGetText(ByXpathDemo.SUCCESSEFULLMASSAGE);
			expMsg = "Customer \"" + customerName + "\" has been successfully created.";
			testCaseDataFile.linkVerify("customerCreatedMassege", actMsg, expMsg);

			if (yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("customerMsg");
			}
		}
	}

	/**
	 * open Creates Project page and Creates New Project
	 * 
	 * @author Prasad
	 * 
	 */
	protected void getCreateNewProject() throws InterruptedException, IOException {

		String customerName = customerDataProperties.cuatomerData("companyName");
		String description = customerDataProperties.cuatomerData("description");
		String projectName = customerDataProperties.cuatomerData("projectName");
		String updateCustomerName = customerDataProperties.cuatomerData("companyUpdateName");
		String updateName = customerDataProperties.cuatomerData("canYouUpdateCompanyName");
		String yesOrNo = customerDataProperties.cuatomerData("screenshotYesOrNo");
		String newProject = customerDataProperties.cuatomerData("canYouCreateNewProject");
		// Thread and Explicit wait
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.CREATEPROJECT);

		if (newProject.equals("yes")) {
			findWebElement.myClick(ByXpathDemo.CREATEPROJECT);

			if (yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("createProject");
			}

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.CUSTOMERSELECTE);

			actUrl = findWebElement.myGetCurrentUrl();
			expUrl = "http://127.0.0.1/project/projectadd.do?resetForm=true&customerId=0";
			testCaseDataFile.linkVerify("projectCreatePageOpen", actUrl, expUrl);

			// customer text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.CUSTOMERSELECTE);

			// select customer
			if (updateName.equals("yes")) {
				findWebElement.mySelect(ByXpathDemo.CUSTOMERSELECTE, updateCustomerName);

			} else {
				findWebElement.mySelect(ByXpathDemo.CUSTOMERSELECTE, customerName);
			}

			// customer text field color White
			blinkWebElement.originalAndColor("original", ByXpathDemo.CUSTOMERSELECTE);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.PROJECTNAME);

			// Project text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.PROJECTNAME);

			// send value to projectname text field
			findWebElement.type(ByXpathDemo.PROJECTNAME, projectName);

			// Project text field color White
			blinkWebElement.originalAndColor("original", ByXpathDemo.PROJECTNAME);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.DESCRIPTION);

			// Description text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.DESCRIPTION);

			// send value to description text field
			findWebElement.type(ByXpathDemo.DESCRIPTION, description);

			// Description text field color white
			blinkWebElement.originalAndColor("original", ByXpathDemo.DESCRIPTION);

			findWebElement.myClick(ByXpathDemo.PROJECTSUBMIT);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.SUCCESSEFULLMASSAGE);

			actMsg = findWebElement.myGetText(ByXpathDemo.SUCCESSEFULLMASSAGE);
			expMsg = "Project \"" + projectName + "\" has been successfully created.";
			testCaseDataFile.linkVerify("projectCreatedMassege", actMsg, expMsg);

			if (yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("projectMsg");
			}
		}
	}

}
