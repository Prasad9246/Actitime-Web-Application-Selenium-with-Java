package actitimeDemoAssinment;

import java.io.IOException;

public class DeleteCustomerProjectTask {

	String actMsg, expMsg;
	TestCaseVerify testCaseDataFile = new TestCaseVerify();
	FindWebElement findWebElement = new FindWebElement();
	ExplicitWaitSleepDemo explicitWaitSleepDemo = new ExplicitWaitSleepDemo();
	CustomerDataProperties customerDataProperties = new CustomerDataProperties();
	TakePageScreenshot takePageScreenshot = new TakePageScreenshot();


	/**
	 * To Delete Task 
	 * @author Prasad
	 * 
	 */
	protected void getDeletingTask() throws InterruptedException, IOException {
		String deleteCustomerProject = customerDataProperties.cuatomerData("canYouDeleteTask");
		String yesOrNo = customerDataProperties.cuatomerData("screenshotYesOrNo");

		if(deleteCustomerProject.equals("yes")) {
			// Thread and Explicit wait  
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.DELETE);
			findWebElement.myClick(ByXpathDemo.DELETE);

			// Thread and Explicit wait  
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.TASKDELETEBUTTON);

			findWebElement.myClick(ByXpathDemo.TASKDELETEBUTTON);

			// Thread and Explicit wait  
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.CONFIRMDELETE);
			
			findWebElement.myClick(ByXpathDemo.CONFIRMDELETE);
			
			// Thread and Explicit wait  
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.SUCCESSEFULLMASSAGE);
			
			actMsg = findWebElement.myGetText(ByXpathDemo.SUCCESSEFULLMASSAGE);
			expMsg = "Selected tasks have been successfully deleted.";
			testCaseDataFile.linkVerify("taskDeletedMassege", actMsg, expMsg);
			if(yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("deleteCuPrMsg");
			}
		}
		

	}
	/**
	 * TO Deleting Customer and Project 
	 * @author Prasad
	 * 
	 */
	protected void getDeletingCustomerProject() throws InterruptedException, IOException {

		String deleteTask = customerDataProperties.cuatomerData("canYouDeleteCustomerProject");
		String yesOrNo = customerDataProperties.cuatomerData("screenshotYesOrNo");
		if(deleteTask.equals("yes")) {
			// Thread and Explicit wait  
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.PROJECTANDCUSTOMER);

			findWebElement.myClick(ByXpathDemo.PROJECTANDCUSTOMER);

			// Thread and Explicit wait  
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.DELETE);
			
			findWebElement.myClick(ByXpathDemo.DELETE);
			
			findWebElement.myClick(ByXpathDemo.PROJECTCUSTOMERSELECT);
			
			// Thread and Explicit wait  
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.CONFIRMDELETE);
			
			findWebElement.myClick(ByXpathDemo.CONFIRMDELETE);
			
			// Thread and Explicit wait  
			explicitWaitSleepDemo.waitSleep(ByXpathDemo.SUCCESSEFULLMASSAGE);

			actMsg = findWebElement.myGetText(ByXpathDemo.SUCCESSEFULLMASSAGE);
			expMsg = "Selected customers and projects have been successfully deleted.";
			testCaseDataFile.linkVerify("customerProjectDeletedMassege", actMsg, expMsg);
			
			if(yesOrNo.equals("yes")) {
				takePageScreenshot.myScreenshot("deleteTask");
			}
		}
		
	}
}
