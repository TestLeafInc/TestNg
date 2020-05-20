package alternate;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

import leads.CreateLead;

public class RunXml {

	public static void main(String[] args) {

		TestNG testNG = new TestNG();
		List<String> suites = new ArrayList<String>();
		suites.add("leads.xml");
		//suites.add("testng.xml");
		testNG.setTestSuites(suites);
		testNG.run();
	}

}
