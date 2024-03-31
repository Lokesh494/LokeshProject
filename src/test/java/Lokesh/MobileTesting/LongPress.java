package Lokesh.MobileTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.appium.java_client.AppiumBy;

public class LongPress  extends Utilies{
	
	
	
	@Test
	public void pressLong() throws InterruptedException {
		
			driver1.findElement(AppiumBy.accessibilityId("Views")).click();
			
			driver1.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
			
			driver1.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
			
			WebElement peopleNames = driver1.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
			
			//Extended from Utilies class
			longPress(peopleNames);
			
			String sampleMenu=driver1.findElement(By.id("android:id/title")).getText();
			
			Assert.assertEquals(sampleMenu, "Sample menu");
			
			Assert.assertTrue(driver1.findElement(By.id("android:id/title")).isDisplayed());
			
			Thread.sleep(2000);
	}

}
