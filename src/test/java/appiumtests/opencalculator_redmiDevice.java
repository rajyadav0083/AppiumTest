package appiumtests;

import java.lang.StackWalker.Option;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.remote.options.CanSetCapability;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.*;



public class opencalculator_redmiDevice {

	static URL url;
	static AppiumDriver driver;
	
	@Test
	public void opencalculator() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi Note 7S");
		cap.setCapability("udid", "df8f95d");
		cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("platformVersion", "29");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("ignoreHiddenApiPolicyError", true);
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

		//cap.setCapability("appPackage", "compass.freecompassapp.digitalcompass");
		//cap.setCapability("appActivity", "com.volio.vn.compass.ui.MainActivity");
		
		url = new URL("http://127.0.0.1:4723/");
		//url = new URL("http://192.168.243.97:4723/");
		driver = new AppiumDriver(url, cap);
		System.out.println("Mobile application started.");
		Thread.sleep(5000);
		System.out.println("Before pressing 8 button.");
		driver.findElement(By.id("com.miui.calculator:id/content_wrapper")).click();
		String text= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Tap here to minimise calculator\"]")).getText();
		System.out.println("Hi:"+text);
		
		driver.switchTo().frame("");
	}

}
