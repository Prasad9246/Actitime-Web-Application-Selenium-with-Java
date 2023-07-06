package actitimeDemoAssinment;

import org.openqa.selenium.By;

public class ByXpathDemo {

	protected static final By USERNAME = By.name("username");
	protected static final By PASSWORD = By.name("pwd");
	protected static final By LOGINBUTTON = By.id("loginButton");
	protected static final By CUSTOMERNAME = By.xpath("//input[@name='name']");
	protected static final By DESCRIPTION = By.xpath("//textarea[@name='description']");
	protected static final By TASK = By.xpath("//a[@class='content tasks']//img[@class='sizer']");
	protected static final By PROJECTANDCUSTOMER = By.xpath("//a[normalize-space()='Projects & Customers']");
	protected static final By CREATECUSTOMER = By.xpath("//input[@value='Create New Customer']");
	protected static final By CREATEBLANKCUSTOMERRADIOBUTTON = By.xpath("//input[@id='pre_fill_blank']");
	protected static final By CUSTOMERSUBMIT = By.xpath("//input[@name='createCustomerSubmit']");
	protected static final By SUCCESSEFULLMASSAGE = By.xpath("//span[@class='successmsg']");
	protected static final By CREATECUSTOMERDISPLAY = By.xpath("(//td[@class='customer-cell']//a)[1]");
	protected static final By PROJECTNAME = By.xpath("//input[@name='name']");
	protected static final By CREATEPROJECT = By.xpath("//input[@value='Create New Project']");
	protected static final By CUSTOMERSELECTE = By.xpath("//select[@name='customerId']");
	protected static final By PROJECTSUBMIT = By.xpath("//input[@name='createProjectSubmit']");
	protected static final By CREATEPROJECTDISPLAY = By.xpath("(//td[@class='project-cell']//a)[1]");
	protected static final By OPENTASK = By.xpath("//a[normalize-space()='Open Tasks']");
	protected static final By PROJECTSELECT = By.xpath("//select[@name='projectId']");
	protected static final By CREATETASK = By.xpath("//input[@value='Create New Tasks']");
	protected static final By TASKNAME = By.xpath("//input[@name='task[0].name']");
	protected static final By BILLINGTYPE = By.xpath("//select[@name='task[0].billingType']");
	protected static final By TASKDEADLINE = By.xpath("//input[@id='taskDeadline0']");
	protected static final By ADDTOTIMETRACK = By.xpath("//input[@name='task[0].markedToBeAddedToUserTasks']");
	protected static final By TASKSUBMIT = By.xpath("//input[@value='Create Tasks']");
	protected static final By TASKDISPLAY = By.xpath("(//td[@class='listtblcell'])[1]");
	protected static final By DELETE = By.xpath("//a[normalize-space()='All']");
	protected static final By TASKDELETEBUTTON = By.xpath("//input[@value='Delete Selected Tasks']");
	protected static final By CONFIRMDELETE = By.xpath("//input[@id='deleteButton']");
	protected static final By PROJECTCUSTOMERSELECT = By.xpath("//input[@value='Delete Selected']");
	protected static final By UPDATECUSTOMER = By.xpath("(//td[@class='customer-cell']//a)[1]");
	protected static final By UPDATEBUTTON = By.xpath("//input[@name='saveChanges']");
	protected static final By UPDATEPROJECT = By.xpath("(//td[@class='project-cell']//a)[1]");
	protected static final By LOGOUT = By.xpath("//a[@id='logoutLink']");
	protected static final By TASKUPDATE = By.xpath("(//td[@class='listtblcell']//a)[2]");
	protected static final By TASKEDIT = By.xpath("//nobr[text()='Edit Task Parameters']");
	protected static final By UPDATETASKNAME = By.xpath("//input[@name='name']");
	protected static final By UPDATETASKDEADLINE = By.xpath("//input[@name='formattedDeadline']");
	protected static final By UPDATEBILLINGTYPE = By.xpath("//select[@name='billingTypeId']");
	protected static final By UPADTETASKBUTTON = By.xpath("//input[@onclick='doSubmit();']");
	
	

}