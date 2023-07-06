package actitimeDemoAssinment;

import java.io.IOException;

public class TestCaseVerify {

	/**
	 * To verificaton of Test case and send the test case data to file 
	 * @author Prasad
	 * @throws IOException 
	 * 
	 */
	protected void testDataVerifyReport(String name, String actUrl, String expUrl) throws IOException{
		FileWriteRead fileWriteRead = new FileWriteRead();
		if (actUrl.equals(expUrl)) {
			fileWriteRead.fileWriting(name + " :-  Test Case is passed.");
		}
		else {
			fileWriteRead.fileWriting(name +" :-  Test Case is Failed.");
		}
		
		fileWriteRead.fileWriting("acturl :- "+actUrl+"\n"+"expUrl :- "+expUrl+"\n");
	}
	

	/**
	 * To verify the condition of test case data
	 * @author Prasad
	 * 
	 */
	protected void linkVerify(String name, String actUrl, String expUrl) throws IOException {

		switch (name) {
		case "homePageOpen":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "taskPageOpen":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "projectAndCustomerPageOpen":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "newCustomerPageOpen":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "customerCreatedMassege":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "projectCreatePageOpen":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "projectCreatedMassege":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "taskCreatedMassege":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "taskDeletedMassege":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "customerProjectDeletedMassege":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "customerDisplay":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "projectDisplay":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "taskDisplay":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "deletedCustomerNotDisplay":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "deletedprojectNotDisplay":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "deletedTaskNotDisplay":
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "cuatomerUpdate" :
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "projectUpdate" : 
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "updateTaskMsg" :
			testDataVerifyReport(name, actUrl, expUrl);
			break;
		case "LogOut" :
			testDataVerifyReport(name, actUrl, expUrl); 
			break;
			
		}
	}
}
