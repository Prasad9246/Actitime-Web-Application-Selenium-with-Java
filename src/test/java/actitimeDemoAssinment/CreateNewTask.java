package actitimeDemoAssinment;

import java.io.IOException;

public class CreateNewTask {

	/**
	 * open Creates Tasks page and Creates New Tasks
	 * 
	 * @author Prasad
	 * 
	 */
	protected void getCreateNewTask() throws InterruptedException, IOException {
		String actMsg, expMsg;
		TestCaseVerify testCaseDataFile = new TestCaseVerify();
		FindWebElement findWebElement = new FindWebElement();
		BlinkWebElement blinkWebElement = new BlinkWebElement();
		ExplicitWaitSleepDemo explicitWaitSleepDemo = new ExplicitWaitSleepDemo();
		CustomerDataProperties customerDataProperties = new CustomerDataProperties();
		TakePageScreenshot takePageScreenshot = new TakePageScreenshot();

		String customerName = customerDataProperties.cuatomerData("companyName");
		String projectName = customerDataProperties.cuatomerData("projectName");
		String taskName = customerDataProperties.cuatomerData("taskName");
		String taskdeadlineDate = customerDataProperties.cuatomerData("taskdeadlineDate");
		String billingType = customerDataProperties.cuatomerData("billingType");
		String addToTimeTrack = customerDataProperties.cuatomerData("addToTimeTrack");
		String updateCustomerName = customerDataProperties.cuatomerData("companyUpdateName");
		String updateCName = customerDataProperties.cuatomerData("canYouUpdateCompanyName");
		String updateProjectName = customerDataProperties.cuatomerData("projectUpdateName");
		String updatePName = customerDataProperties.cuatomerData("canYouUpdateProjectName");
		String yesOrNo = customerDataProperties.cuatomerData("screenshotYesOrNo");
		String newCustomer = customerDataProperties.cuatomerData("canYouCreateNewCustomer");

		// Thread and Explicit wait
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.OPENTASK);

		findWebElement.myClick(ByXpathDemo.OPENTASK);
		// Thread and Explicit wait
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.CREATETASK);

		if (newCustomer.equals("yes")) {

			findWebElement.myClick(ByXpathDemo.CREATETASK);

			if (yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("createTask");
			}

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.CUSTOMERSELECTE);
			// customer select text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.CUSTOMERSELECTE);

			// select customer name

			if (updateCName.equals("yes")) {
				findWebElement.mySelect(ByXpathDemo.CUSTOMERSELECTE, updateCustomerName);
			} else {
				findWebElement.mySelect(ByXpathDemo.CUSTOMERSELECTE, customerName);
			}

			// Thread.sleep(3000l);

			// customer name text box color white
			blinkWebElement.originalAndColor("original", ByXpathDemo.CUSTOMERSELECTE);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.PROJECTSELECT);
			// project name text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.PROJECTSELECT);

			// select project name
			if (updatePName.equals("yes")) {
				findWebElement.mySelect(ByXpathDemo.PROJECTSELECT, updateProjectName);
			} else {
				findWebElement.mySelect(ByXpathDemo.PROJECTSELECT, projectName);
			}
			// Thread.sleep(3000l);

			// project name text field color white
			blinkWebElement.originalAndColor("original", ByXpathDemo.PROJECTSELECT);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.TASKNAME);
			// task name text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.TASKNAME);

			// send value to task Name text field
			findWebElement.type(ByXpathDemo.TASKNAME, taskName);
			// Thread.sleep(3000l);

			// task name text box color white
			blinkWebElement.originalAndColor("original", ByXpathDemo.TASKNAME);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.TASKDEADLINE);
			// taskdeadlineDate text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.TASKDEADLINE);

			// send value to taskdeadlineDate text field
			findWebElement.type(ByXpathDemo.TASKDEADLINE, taskdeadlineDate);
			// Thread.sleep(3000l);

			explicitWaitSleepDemo.waitSleep(ByXpathDemo.TASKDEADLINE);

			// taskdeadlineDate text field color white
			blinkWebElement.originalAndColor("original", ByXpathDemo.TASKDEADLINE);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.BILLINGTYPE);

			// billingtype text field color yellow
			blinkWebElement.originalAndColor("color", ByXpathDemo.BILLINGTYPE);

			// select billingtype
			findWebElement.mySelect(ByXpathDemo.BILLINGTYPE, billingType);
			// Thread.sleep(3000l);

			// billingtype text field color white
			blinkWebElement.originalAndColor("original", ByXpathDemo.BILLINGTYPE);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.ADDTOTIMETRACK);

			if (addToTimeTrack.equals("yes")) {
				findWebElement.myClick(ByXpathDemo.ADDTOTIMETRACK);
			}

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.TASKSUBMIT);

			findWebElement.myClick(ByXpathDemo.TASKSUBMIT);

			// Thread and Explicit wait
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.SUCCESSEFULLMASSAGE);

			actMsg = findWebElement.myGetText(ByXpathDemo.SUCCESSEFULLMASSAGE);

			if (updateCName.equals("yes") && updatePName.equals("no")) {
				expMsg = "1 new task was added to the customer \"" + updateCustomerName + "\", project \"" + projectName
						+ "\".";
				testCaseDataFile.linkVerify("taskCreatedMassege", actMsg, expMsg);
			} else if (updatePName.equals("yes") && updateCName.equals("no")) {
				expMsg = "1 new task was added to the customer \"" + customerName + "\", project \"" + updateProjectName
						+ "\".";
				testCaseDataFile.linkVerify("taskCreatedMassege", actMsg, expMsg);
			} else if (updatePName.equals("yes") && updateCName.equals("yes")) {
				expMsg = "1 new task was added to the customer \"" + updateCustomerName + "\", project \""
						+ updateProjectName + "\".";
				testCaseDataFile.linkVerify("taskCreatedMassege", actMsg, expMsg);
			} else if (updateCName.equals("no") && updatePName.equals("no")) {
				expMsg = "1 new task was added to the customer \"" + customerName + "\", project \"" + projectName
						+ "\".";
				testCaseDataFile.linkVerify("taskCreatedMassege", actMsg, expMsg);
			}

			if (yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("taskMsg");
			}
		}
	}
}
