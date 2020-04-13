package Tests;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;

public class BasicScript {
	
	AndroidDriver<MobileElement> driver;
	
	@Test
	public void initialize() throws MalformedURLException, InterruptedException 
	{
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "CPH1923");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\ue\\Desktop\\Apk\\Eqanim.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		
		driver = new AndroidDriver<MobileElement>(url, dc);
		Thread.sleep(20000);
	
		WebElement phone = driver.findElementByXPath("//android.widget.EditText[@index='0']");
			
		phone.clear();
		phone.sendKeys("8149233196");
		Thread.sleep(4000);
		
		driver.findElementByClassName("android.widget.Button").click();
		Thread.sleep(10000);
		
		WebElement otp = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.EditText\r\n" + 
				"");
		otp.click();
		otp.sendKeys("1234");
		Thread.sleep(1000);
		
		driver.findElementByXPath("//android.widget.Button[@text='Sign In']").click();
		Thread.sleep(8000);
		
		String notBar = driver.findElementByXPath("//android.view.View[@text='Home home']").getText();
		System.out.println(notBar);
		assertEquals(notBar, "Home home");
		 
	}

}
