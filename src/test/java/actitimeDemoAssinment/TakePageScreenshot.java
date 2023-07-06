package actitimeDemoAssinment;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakePageScreenshot {
	/**
	 * To taking Screenshot of Msg and Display page
	 * 
	 * @author Prasad
	 *
	 */
	protected void myScreenshot(String fileName) throws IOException {

		String destFile = null;
		File sourceFile = ((TakesScreenshot) LaunchBrowser.driver).getScreenshotAs(OutputType.FILE);

		switch (fileName) {
		case "login":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/loginPage/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "home":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/homePage/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "createCustomer":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/createCustomerPage/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "customerMsg":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/createCustomerMsg/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "updateCustomer":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/updateCustomerPage/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "updateCustomerMsg":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/updateCustomerMsg/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "createProject":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/createProjectPage/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "projectMsg":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/createProjectMsg/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "updateProject":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/updateProjectPage/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "updateProjectMsg":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/updateProjectMsg/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "createTask":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/createTaskPage/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "taskMsg":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/createTaskMsg/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "updatetask":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/updateTaskPage/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "updateTaskMsg" :
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/updateTaskPage/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "deleteCuPrMsg":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/deleteCustomerProjectMsg/" + fileName
					+ "_";
			captureScreenshot(sourceFile, destFile);
			break;
		case "deleteTask":
			destFile = System.getProperty("user.dir") + "/src/test/resources/actitimePageScreenshot/deleteTaskMsg/" + fileName + "_";
			captureScreenshot(sourceFile, destFile);
			break;
		}

	}

	/**
	 * To set the screenshot's unique name
	 * 
	 * @author Prasad
	 *
	 */
	protected void captureScreenshot(File sourceFile, String destFile) throws IOException {
		Date dt = new Date();
		destFile = destFile + dt.toString().replaceAll(" ", "_").replaceAll(":", "_") + ".png";
		FileUtils.copyFile(sourceFile, new File(destFile));
	}

}
