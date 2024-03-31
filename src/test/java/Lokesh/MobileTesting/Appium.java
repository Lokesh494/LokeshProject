package Lokesh.MobileTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Appium extends Utilies {
	
	
	@Test
	public void AppiumWifiSetting() {
		
		//Automation code
		
		driver1.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		driver1.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		
		driver1.findElement(By.id("android:id/checkbox")).click();

		driver1.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		//Validating Alert Pop-up
		String validateWifi = driver1.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(validateWifi, "WiFi settings");
		
		driver1.findElement(By.id("android:id/edit")).sendKeys("AutoZone");
		
		driver1.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
}
}