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
	public void sendMessage() throws Exception {

		HomePage homepage = new HomePage(mobiledriver);

		scrollUntilElement("In�s Mikas 93");
		homepage.sendMessageToFriend("Teste refactoring");

	}

	@AfterClass
	public static void teardown() throws Exception {
		// close the app
		closeBrowser();
	}

}
