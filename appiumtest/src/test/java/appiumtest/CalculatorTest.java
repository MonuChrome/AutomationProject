package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			openCalculator();
			
		}catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
			
		}
	}
	
	public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Galaxy J5");
		cap.setCapability("udid", "10a63039" );
		cap.setCapability("platformName", "Android" );
		cap.setCapability("platformVersion", "6.0.1" );
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator" );
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator" );
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
			
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application Started........");
		
	}

}
