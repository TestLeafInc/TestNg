package contacts;

import org.testng.annotations.Test;

public class CreateContact {
	
	@Test(groups= {"contacts","Babu"},dependsOnGroups= {"leads"} )
	public void createContact() {
		
	}

}
