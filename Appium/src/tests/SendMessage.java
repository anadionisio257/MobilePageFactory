package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import generic.BaseMethods;
import pages.SingleChatPage;

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

		SingleChatPage singlechatpage = new SingleChatPage(mobiledriver);
		
		scrollUntilElement("HMV <3 91");
		//turnWiFI();
		singlechatpage.sendMessageToFriend("Atenção que é teste");
		singlechatpage.sendMessageToFriend("\ud83d\udce2"); //send an Emoji
		
	
		

	}

	@AfterClass
	public static void teardown() throws Exception {
		// close the app
		closeBrowser();
	}

}
