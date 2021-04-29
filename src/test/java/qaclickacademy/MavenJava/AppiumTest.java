package qaclickacademy.MavenJava;

import org.testng.annotations.Test;

public class AppiumTest {

	@Test(groups="Smoke")
	public void nativeAppAndroid() {
		System.out.println("nativeAppAndroid");	
	}
	
	@Test(groups="Sanity")
	public void IosApp() {
		System.out.println("IosApp");
	}

}
