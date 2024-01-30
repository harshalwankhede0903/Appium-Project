package appAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo 
{
       public static void main(String[] args) throws MalformedURLException, InterruptedException
       {
		
    	   
    	   DesiredCapabilities cap = new DesiredCapabilities();
    	   
    	   cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
    	   cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    	   cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
    	   cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 10");
    	   
    	 //cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\ZMO-WIN-HarshalW-01\\Downloads\\DEMO APP_1.5_Apkpure.apk");
    	    
    	 cap.setCapability("appPackage", "com.flipkart.android");
    	  cap.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
    	   
    	   
    	   URL url = new URL("http://localhost:4723/wd/hub");
    	   
    	   AndroidDriver driver = new AndroidDriver(url,cap);
    	   
    	   System.out.println("app started");
    	   
    	   driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
    	            

          
       }
       
}
