package Lokesh.MobileTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class SwipeDemo  extends Utilies{
	
	
	
	@Test
	public void testSwipe() {
		
		
		driver1.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver1.findElement(AppiumBy.accessibilityId("Gallery")).click();
		
		driver1.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
		
		WebElement firstImage = driver1.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		
		Assert.assertEquals(driver1.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"), "true");
		
		//swipe
		
		((JavascriptExecutor) driver1).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) firstImage).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
		
		Assert.assertEquals(driver1.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"), "false");
	}

}
