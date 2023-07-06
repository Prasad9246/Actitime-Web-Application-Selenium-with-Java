package actitimeDemoAssinment;

import java.io.IOException;

public class UpdateCustomerProjectTask {
	ExplicitWaitSleepDemo explicitWaitSleepDemo = new ExplicitWaitSleepDemo();
	CustomerDataProperties customerDataProperties = new CustomerDataProperties();
	BlinkWebElement blinkWebElement = new BlinkWebElement();
	TestCaseVerify testCaseDataFile = new TestCaseVerify();
	FindWebElement findWebElement = new FindWebElement();
	TakePageScreenshot takePageScreenshot = new TakePageScreenshot();

	protected void changeTaskName() throws IOException, InterruptedException {
		String canYouUpdateTask = customerDataProperties.cuatomerData("canYouUpdateTask");
		String upateTaskName = customerDataProperties.cuatomerData("updateTaskName");
		String updateTaskdeadlineDate = customerDataProperties.cuatomerData("updateTaskdeadlineDate");
		String updateBillingType = customerDataProperties.cuatomerData("updateBillingType");
		String canYouUpdateTaskName = customerDataProperties.cuatomerData("canYouUpdateTaskName");
		String canYouUpdateTaskdeadlineDate = customerDataProperties.cuatomerData("canYouUpdateTaskdeadlineDate");
		String canYouUpdateBillingtype = customerDataProperties.cuatomerData("canYouUpdateBillingtype");
		String yesOrNo = customerDataProperties.cuatomerData("screenshotYesOrNo");

		// Thread and Explicit wait
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.OPENTASK);

		if(canYouUpdateTask.equals("yes")) {
		findWebElement.myClick(ByXpathDemo.OPENTASK);
		// Thread and Explicit wait
		
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.TASKUPDATE);
		
		findWebElement.myClick(ByXpathDemo.TASKUPDATE);
		
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.TASKEDIT);
		
		findWebElement.myClick(ByXpathDemo.TASKEDIT);
		
		if(yesOrNo.equals("yes")) {
		takePageScreenshot.myScreenshot("updatetask");
		}
		
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.UPDATETASKNAME);
		
		if(canYouUpdateTaskName.equals("yes")) {
			findWebElement.myClear(ByXpathDemo.UPDATETASKNAME);
			
			findWebElement.type(ByXpathDemo.UPDATETASKNAME, upateTaskName);
		}
		
		if(canYouUpdateTaskdeadlineDate.equals("yes")) {
			findWebElement.myClear(ByXpathDemo.UPDATETASKDEADLINE);
			
			findWebElement.type(ByXpathDemo.UPDATETASKDEADLINE, updateTaskdeadlineDate);
		}
		if(canYouUpdateBillingtype.equals("yes")) {
			findWebElement.mySelect(ByXpathDemo.UPDATEBILLINGTYPE, updateBillingType);
		}
		
		findWebElement.myClick(ByXpathDemo.UPADTETASKBUTTON);

		explicitWaitSleepDemo.waitSleep(ByXpathDemo.SUCCESSEFULLMASSAGE);
		String actMag = findWebElement.myGetText(ByXpathDemo.SUCCESSEFULLMASSAGE);
		String expMsg = "Your changes have been saved.";
		testCaseDataFile.linkVerify("updateTaskMsg", actMag, expMsg);
		
		if(yesOrNo.equals("yes")) {
			takePageScreenshot.myScreenshot("updateTaskMsg");
		}
		
		findWebElement.myClick(ByXpathDemo.OPENTASK);

		}
	}

	/**
	 * update and change the Company name
	 * 
	 * @author Prasad
	 */
	protected void changeCustomerName() throws IOException, InterruptedException {

		String updateCustomerName = customerDataProperties.cuatomerData("companyUpdateName");
		String updateName = customerDataProperties.cuatomerData("canYouUpdateCompanyName");
		String yesOrNo = customerDataProperties.cuatomerData("screenshotYesOrNo");

		if (updateName.equals("yes")) {
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.UPDATECUSTOMER);

			findWebElement.myClick(ByXpathDemo.UPDATECUSTOMER);
			if (yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("updateCustomer");
			}

			explicitWaitSleepDemo.waitSleep(ByXpathDemo.CUSTOMERNAME);

			blinkWebElement.originalAndColor("color", ByXpathDemo.CUSTOMERNAME);

			findWebElement.myClear(ByXpathDemo.CUSTOMERNAME);
			findWebElement.type(ByXpathDemo.CUSTOMERNAME, updateCustomerName);

			blinkWebElement.originalAndColor("original", ByXpathDemo.CUSTOMERNAME);

			findWebElement.myClick(ByXpathDemo.UPDATEBUTTON);

			explicitWaitSleepDemo.waitSleep(ByXpathDemo.SUCCESSEFULLMASSAGE);
			String actMag = findWebElement.myGetText(ByXpathDemo.SUCCESSEFULLMASSAGE);
			String expMsg = "Your changes have been saved.";
			testCaseDataFile.linkVerify("cuatomerUpdate", actMag, expMsg);
			takePageScreenshot.myScreenshot("updateCustomerMsg");
		}

	}

	/**
	 * update and change the Project name
	 * 
	 * @author Prasad
	 */
	protected void changeProjectName() throws IOException, InterruptedException {
		String updateProjectName = customerDataProperties.cuatomerData("projectUpdateName");
		String updateName = customerDataProperties.cuatomerData("canYouUpdateProjectName");
		String yesOrNo = customerDataProperties.cuatomerData("screenshotYesOrNo");
		if (updateName.equals("yes")) {
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.UPDATEPROJECT);

			findWebElement.myClick(ByXpathDemo.UPDATEPROJECT);
			if (yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("updateProject");
			}

			explicitWaitSleepDemo.waitSleep(ByXpathDemo.PROJECTNAME);

			blinkWebElement.originalAndColor("color", ByXpathDemo.PROJECTNAME);

			findWebElement.myClear(ByXpathDemo.PROJECTNAME);

			findWebElement.type(ByXpathDemo.PROJECTNAME, updateProjectName);

			blinkWebElement.originalAndColor("original", ByXpathDemo.PROJECTNAME);

			findWebElement.myClick(ByXpathDemo.UPDATEBUTTON);

			explicitWaitSleepDemo.waitSleep(ByXpathDemo.SUCCESSEFULLMASSAGE);

			String actMag = findWebElement.myGetText(ByXpathDemo.SUCCESSEFULLMASSAGE);
			String expMsg = "Your changes have been saved.";
			testCaseDataFile.linkVerify("projectUpdate", actMag, expMsg);
			if (yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("updateProjectMsg");
			}
		}
	}
}
