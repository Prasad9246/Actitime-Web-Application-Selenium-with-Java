package actitimeDemoAssinment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// important
public class FileWriteRead {

	final String RESOURCE_PATH = System.getProperty("user.dir");
	File f;
	FileWriter fw ;
	static boolean onlyOnce=true;

	/**
	 * To Write the test Case data text file
	 * @author Prasad
	 * 
	 */
	
	protected void fileWriting(String write) throws IOException {

		String fiName = RESOURCE_PATH + "/src/test/java/actitimeDemoAssinment/TestCaseData.txt";
		f = new File(fiName);
		if(onlyOnce == true)
		{
			fw = new FileWriter(f, false);
			onlyOnce = false;
		}
		else {
			fw = new FileWriter(f, true);
		}
		fw.write(write + "\n");
		fw.close();

	}

	/**
	 * To Read the Test case data text file and printing in console
	 * @author Prasad
	 * 
	 */
	protected void readTheFile() throws IOException {

		String fiName = RESOURCE_PATH + "/src/test/java/actitimeDemoAssinment/TestCaseData.txt";
		f = new File(fiName);
		FileReader fr = new FileReader(f);
		int ch;
		while ((ch = fr.read()) != -1)
			System.out.print((char) ch);

		fr.close();
	}
}
