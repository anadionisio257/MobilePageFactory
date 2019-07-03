package generic;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseMethods {

	public static AndroidDriver<?> mobiledriver;

	public static void openAPP() throws Exception {

		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.11.0");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "5467c8c87cf4"); // Give Device ID of your
													// mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.1.2");
		caps.setCapability("appPackage", "com.whatsapp");
		caps.setCapability("appActivity", "com.whatsapp.HomeActivity");
		caps.setCapability("noReset", "true");
		caps.setCapability("unicodeKeyboard", "true");
		caps.setCapability("resetKeyboard", "true");
		

		mobiledriver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		// takeScreenshot(testname, num++, path);
	}

	// Method to take screenshots
	public void takeScreenshot(String testname, int testid, String path) throws Exception {
		File scrFile = ((TakesScreenshot) mobiledriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(path + testname + testid + "-" + timestamp() + ".jpeg"));
	}

	public static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy HH.mm.ss").format(new Date());
	}
	
	//Method to scroll until the element
	public static void scrollUntilElement(String str) {
		mobiledriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ str + "\").instance(0))").click();
	}
	
	public static void closeBrowser() throws Exception {
		mobiledriver.quit();	
	}
	
	//Method to click on Android Native Back Button
	public static void clickAndroidBackButton(){
		mobiledriver.navigate().back();
	}

}
