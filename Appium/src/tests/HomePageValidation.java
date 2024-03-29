package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import generic.BaseMethods;
import pages.HomePage;

public class HomePageValidation extends BaseMethods {
	
	private static String testname = "Whatsapp";
	private static int num = 1;
	private static String path = "C:/Users/asofiadi/Desktop/SantanderUK/02.Appium/Evidences/";

	@BeforeClass
	public static void setUp() throws Exception {

		BaseMethods.openAPP();
	}

	@Test
	public void sendMessage() throws Exception {

		HomePage homepage = new HomePage(mobiledriver);

		homepage.clickOnCalls();
		homepage.clickOnStatus();
		homepage.clickOnChat();
		homepage.clickOnNewChat();
		clickAndroidBackButton();
		homepage.clickOnSearch();
		clickAndroidBackButton();
		clickAndroidBackButton();
		homepage.clickOnMoreMenu();
		clickAndroidBackButton();
		homepage.clickOnCamera();
		clickAndroidBackButton();
	
	}

	@AfterClass
	public static void teardown() throws Exception {
		// close the app
		closeBrowser();
	}
	
	

}
