package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;


import generic.BaseMethods;
import pages.HomePage;



public class SendMessage extends BaseMethods {

	private static String testname = "Whatsapp";
	private static int num = 1;
	private static String path = "C:/Users/asofiadi/Desktop/SantanderUK/02.Appium/Evidences/";

	@BeforeClass
	public static void setUp() throws Exception {
		
		BaseMethods.openAPP();	
	}

	@Test
	public void testCal() throws Exception {
		
		HomePage homepage = new HomePage(mobiledriver);

		String str = "Inês Mikas 93";
		mobiledriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ str + "\").instance(0))").click();
		
		/*// takeScreenshot(testname, num++, path);
		mobiledriver.findElement(By.id("com.whatsapp:id/entry")).click();
		// takeScreenshot(testname, num++, path);
		mobiledriver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("teste mae"); 
		// takeScreenshot(testname, num++, path);
		mobiledriver.findElementByAccessibilityId("Send").click();
		// takeScreenshot(testname, num++, path);*/
		
		homepage.chat.click();
		homepage.chat.sendKeys("teste page factory");
		homepage.buttonsend.click();
		

	}
 
	@AfterClass
	public static void teardown() {
		// close the app
		mobiledriver.quit();
	}

	

}
