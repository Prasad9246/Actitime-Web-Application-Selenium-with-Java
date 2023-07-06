package actitimeDemoAssinment;

import java.io.IOException;

public class HomePage {
	FindWebElement findWebElement = new FindWebElement();
	TestCaseVerify testCaseDataFile = new TestCaseVerify();
	CustomerDataProperties customerDataProperties = new CustomerDataProperties();
	BlinkWebElement blinkWebElement = new BlinkWebElement();
	ExplicitWaitSleepDemo explicitWaitSleepDemo = new ExplicitWaitSleepDemo();
	TakePageScreenshot takePageScreenshot = new TakePageScreenshot();

	/**
	 * Login with valid details and open HomePage
	 * 
	 * @author Prasad
	 * 
	 */
	protected void getHomePage() throws InterruptedException, IOException {
		String actUrl, expUrl;
		String username = customerDataProperties.cuatomerData("username");
		String password = customerDataProperties.cuatomerData("password");
		String yesOrNo = customerDataProperties.cuatomerData("screenshotYesOrNo");

		
		// Thread and Explicit wait
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.USERNAME);

		// Username text field color yellow
		blinkWebElement.originalAndColor("color", ByXpathDemo.USERNAME);

		if(yesOrNo.equals("yes")) {
			takePageScreenshot.myScreenshot("login");
		}
		
		// send value to username text field
		findWebElement.type(ByXpathDemo.USERNAME, username);

		blinkWebElement.originalAndColor("original", ByXpathDemo.USERNAME);

		// password text field color yellow
		blinkWebElement.originalAndColor("color", ByXpathDemo.PASSWORD);

		// send value to password text field
		findWebElement.type(ByXpathDemo.PASSWORD, password);

		// password text filed color white
		blinkWebElement.originalAndColor("original", ByXpathDemo.PASSWORD);

		// click on login button
		findWebElement.myClick(ByXpathDemo.LOGINBUTTON);

		// Thread and Explicit wait
		explicitWaitSleepDemo.waitSleep(ByXpathDemo.TASK);
		
		// getting current url of page
		actUrl = findWebElement.myGetCurrentUrl();
		expUrl = "http://127.0.0.1/user/submit_tt.do";
		// test case verification
		testCaseDataFile.linkVerify("homePageOpen", actUrl, expUrl);
		
		if(yesOrNo.equals("yes")) {
			takePageScreenshot.myScreenshot("home");
		}
		
	}
	/**
	 * LogOut the Account
	 * 
	 * @author Prasad
	 * @throws IOException 
	 * 
	 */
	protected void myLogOut() throws IOException {
		String logOut = customerDataProperties.cuatomerData("logOutYesOrNo");
		if (logOut.equals("yes")) {
			findWebElement.myClick(ByXpathDemo.LOGOUT);
			String actUrl = findWebElement.myGetCurrentUrl();
			String expUrl = "http://127.0.0.1/login.do";
			testCaseDataFile.linkVerify("LogOut", actUrl, expUrl);
		}
	}

	/**
	 * Closing all tabs
	 * 
	 * @author Prasad
	 * @throws IOException 
	 * 
	 */
	protected void getQuit() throws IOException {
		String browserClose = customerDataProperties.cuatomerData("browserCloseYesOrNot");
		if(browserClose.equals("yes")) {
			LaunchBrowser.driver.quit();
		}
	}
}
