package appiumtests;

// This sample code supports Appium Java client >=9
// https://github.com/appium/java-client
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class OpenCalculator {

  private AndroidDriver driver;
  private AppiumDriverLocalService service;

  @Test
  public void sampleTest() throws Exception {
	  try {
		  
	 
	  
	  	//Open Appium server..
	    service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\rajya\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
	    service.stop();
	    System.out.println("@@1");
	    Thread.sleep(5000);
		service.start();
	@SuppressWarnings("rawtypes")
	var options = new BaseOptions()
		      .amend("appium:deviceName", "OnePlus 9 5G")
		      .amend("appium:udid", "192.168.29.193:5555")
		      .amend("platformName", "Android")
		      .amend("appium:automationName", "UiAutomator2")
		      .amend("appium:appPackage", "com.oneplus.calculator")
		      .amend("appium:appActivity", "com.android.calculator2.Calculator")
		      .amend("appium:platformVersion", "14")
		      .amend("appium:ensureWebviewsHavePages", true)
		      .amend("appium:nativeWebScreenshot", true)
		      .amend("appium:newCommandTimeout", 3600)
		      .amend("appium:connectHardwareKeyboard", true);

	  URL url=new URL("http://127.0.0.1:4723/");
	  //URL url = new URL("http://192.168.243.97:4723/");
	  System.out.println("@@2");
	  driver = new AndroidDriver(url, options);
	  System.out.println("@@3");
	  Thread.sleep(5000);
	  driver.quit();
	  System.out.println("@@4");
	  service.stop();
	  System.out.println("@@5");
	  }catch(Exception e) {
		// TODO Auto-generated catch block
					System.out.println("Exception");
					e.printStackTrace();
					service.stop();
	  }
  }
 
}
