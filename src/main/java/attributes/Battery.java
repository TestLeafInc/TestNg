package attributes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Battery {
	
	/*
	 * enabled -> false (disabled)
	 * 1) not fixed: you are unwilling to run test (dev -> defect : not fixed)
	 * 2) incomplete: not completed the full test case
	 */
	
	@Ignore
	@Test
	public void chargePercentage() {
		throw new RuntimeException();
	}
	
	@Test
	public void isBatteryWorks() {
	}
	
	@Test
	public void hasPower() {
		
	}

}
