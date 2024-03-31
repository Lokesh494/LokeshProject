package Lokesh.MobileTesting;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemo  extends Utilies{
	
	
	@Test
	public void scrollingDown() throws InterruptedException {
		
		
		driver1.findElement(AppiumBy.accessibilityId("Views")).click();
		
		
		//Scrolldown method1:
		
		driver1.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		//                (or)
		
		//Scrolldown method2:
		
		boolean canScrollMore;
		
		do
		{
			
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver1).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		}while(canScrollMore);
		
		Thread.sleep(2000);
	}

}
