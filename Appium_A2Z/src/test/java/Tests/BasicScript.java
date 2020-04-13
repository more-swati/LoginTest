package Tests;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BasicScript {
	
	AndroidDriver<MobileElement> driver;
	
	@Test
	public void initialize() throws MalformedURLException, InterruptedException 
	{
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "CPH1923");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\ue\\Desktop\\Apk\\Eqanim.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		
		
		driver = new AndroidDriver<MobileElement>(url, dc);
		Thread.sleep(20000);
	
		WebElement phone = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText\r\n" + 
				"");
		phone.click();
		phone.clear();
		phone.sendKeys("8149233196");
		Thread.sleep(2000);
		
		driver.findElementByClassName("android.widget.Button").click();
		Thread.sleep(10000);
		
		WebElement otp = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\r\n" + 
				"");
		otp.click();
		otp.sendKeys("1234");
		Thread.sleep(1000);
		
		driver.findElementByXPath("//android.widget.Button[@text='Sign In']").click();
		Thread.sleep(8000);
		 
	}

}
