package actitimeDemoAssinment;

import java.io.IOException;

public class ActitimeRunner {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Instance of FileWriteRead class and work is write a file (test Case) and read
		// file
		FileWriteRead fileWriteRead = new FileWriteRead();

		// Instance of BrowserDemo class and work is Browser choosing
		LaunchBrowser launchBrowser = new LaunchBrowser();

		// Instance of LoginPage class
		HomePage homePage = new HomePage();

		// Instance of CreateCustomerProject class
		CreateCustomerProject createCustomerProject = new CreateCustomerProject();

		// Instance of UpdateCustomerProjectTask class
		UpdateCustomerProjectTask updateCustomerProjectTask = new UpdateCustomerProjectTask();

		// Instance of CustomerProjectTaskFound class and find out customer, project and
		// task found or not
		CustomerProjectTaskDisplay customerProjectTaskDisplay = new CustomerProjectTaskDisplay();

		// Instance of CreateNewTask class
		CreateNewTask createNewTask = new CreateNewTask();

		// Instance of DeleteCustomerProjectTask class
		DeleteCustomerProjectTask deleteCustomerProjectTask = new DeleteCustomerProjectTask();

		// setBrowser Method call and pass the parameter like as browser name chrome
		// browser choose
		launchBrowser.setBrowser();

		// getHomePage method calling and open a Home page
		homePage.getHomePage();
		
		// getCreateNewCustomer method call and create new customer
		createCustomerProject.getCreateNewCustomer();

		// customer name change
		updateCustomerProjectTask.changeCustomerName();

		// find out customer found or Not
		customerProjectTaskDisplay.customerDisplayOrNot();

		// getCreateNewProject method call and create new project
		createCustomerProject.getCreateNewProject();

		// project name change
		updateCustomerProjectTask.changeProjectName();

		// find out project found or Not
		customerProjectTaskDisplay.projectDisplayOrNot();

		// getCreateNewTask method call and create new task
		createNewTask.getCreateNewTask();

		// find out task found or Not
		customerProjectTaskDisplay.taskDisplayOrNot();

		updateCustomerProjectTask.changeTaskName();
		
		// getDeletingTask method call and delete the created task
		deleteCustomerProjectTask.getDeletingTask();

		// find out task found or Not
		customerProjectTaskDisplay.taskDisplayOrNot();

		// getDeletingCustomerProject method call and delete Customer and Project
		deleteCustomerProjectTask.getDeletingCustomerProject();

		// find out customer found or Not
		customerProjectTaskDisplay.customerDisplayOrNot();

		// find out project found or Not
		customerProjectTaskDisplay.projectDisplayOrNot();

		// logOut the Account
		homePage.myLogOut();

		// getQuit mehtod call and quit the browser
		homePage.getQuit();

		// readTheFile method call and Read the file
		fileWriteRead.readTheFile();
	
	}

}
