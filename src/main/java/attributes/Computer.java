package attributes;

import org.testng.annotations.Test;


public class Computer {
	
	/*
	 * Only run when
	 * a) Dependent methods are successful !!
	 * 
	 * When my dependent tests (even one) failed,
	 * then the dependsOn get skipped 
	 * 
	 * priority vs dom ?
	 * 
	 * priority -> @Test under same class, test2 (fails) -> test3 (run)
	 * dependsOnMethods -> Even under multiple classes
	 * test2 (dependency) fails -> tests3 (skip)
	 * 
	 * 
	 */
	
	@Test(dependsOnMethods= {"attributes.Battery.isBatteryWorks"})
	public void getMonitor() {
		
	}
	
	
	@Test
	public void getKeyboard() {
		
	}
	

}
