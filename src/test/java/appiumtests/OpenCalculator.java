package appiumtests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

public class OpenCalculator {

	static URL url;
	static AppiumDriver driver;

	@Test
	public void Test() {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "OnePlus 9 5G");
			cap.setCapability("udid", "f4197de3");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "13");
			cap.setCapability("automationName", "UiAutomator2");
			cap.setCapability("ignoreHiddenApiPolicyError", true);
			cap.setCapability("appPackage", "com.oneplus.calculator");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");

			// cap.setCapability("appPackage", "compass.freecompassapp.digitalcompass");
			// cap.setCapability("appActivity", "com.volio.vn.compass.ui.MainActivity");

			url = new URL("http://127.0.0.1:4723/");
			// url = new URL("http://192.168.243.97:4723/");
			driver = new AppiumDriver(url, cap);
			System.out.println("Mobile application started.");

			Thread.sleep(5000);
			System.out.println("Before pressing 8 button.");
			driver.findElement(By.id("com.oneplus.calculator:id/digit_8")).click();
			String text = driver.findElement(By.id("com.oneplus.calculator:id/digit_8")).getText();
			System.out.println("Hi:" + text);
			driver.findElement(By.id("com.oneplus.calculator:id/img_op_add")).click();
			driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
			driver.findElement(By.id("com.oneplus.calculator:id/img_eq")).click();
			String text1 = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
			System.out.println("Hi:" + text1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception");
			e.printStackTrace();
		}
	}

}
