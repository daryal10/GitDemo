package qaclickacademy.MavenJava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test(groups="Smoke")
	public void browserAutomation() {
		System.out.println("browserAutomation");
	}
	
	@Test(groups="Sanity")
	public void elementsUI() {
		System.out.println("elementsUI");
	}

}
