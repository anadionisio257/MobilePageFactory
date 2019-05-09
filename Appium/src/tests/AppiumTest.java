package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumTest {

	public static AndroidDriver<?> mobiledriver;

	private static String testname = "Whatsapp";
	private static int num = 1;
	private static String path = "C:/Users/asofiadi/Desktop/SantanderUK/02.Appium/Evidences/";

	@BeforeClass
	public static void setUp() throws Exception {

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

		mobiledriver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		// takeScreenshot(testname, num++, path);
	}

	@Test
	public void testCal() throws Exception {

		String str = "In�s Mikas 93";
		mobiledriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ str + "\").instance(0))").click();
		
		// takeScreenshot(testname, num++, path);
		mobiledriver.findElement(By.id("com.whatsapp:id/entry")).click();
		// takeScreenshot(testname, num++, path);
		mobiledriver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("teste mae"); 
		// takeScreenshot(testname, num++, path);
		mobiledriver.findElementByAccessibilityId("Send").click();
		// takeScreenshot(testname, num++, path);

	}

	@AfterClass
	public static void teardown() {
		// close the app
		mobiledriver.quit();
	}

	// Method to take screenshots
	public static void takeScreenshot(String testname, int testid, String path) throws Exception {
		File scrFile = ((TakesScreenshot) mobiledriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(path + testname + testid + "-" + timestamp() + ".jpeg"));
	}

	public static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy HH.mm.ss").format(new Date());
	}

}