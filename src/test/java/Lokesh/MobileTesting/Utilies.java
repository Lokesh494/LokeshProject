package Lokesh.MobileTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Utilies {
	
			public AndroidDriver driver1;
			public AppiumDriverLocalService service;
			
			
	@BeforeClass
	public void configureAppium() throws MalformedURLException {
		
		//code to start server
	    //two drivers -----> AndroidDriver and IOSDriver 
			//Appium code  ---> Appium Server ---> Mobile
	
		service=new AppiumServiceBuilder()
			.withAppiumJS(new File("C://Users//admin//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
			.withIPAddress("127.0.0.1")
			.usingPort(4723).build();
	
		service.start();
	
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("LokeshPhone");
		options.setApp("C://Users//admin//eclipse-workspace//MobileTesting//src//test//java//resources//ApiDemos-debug.apk");
	
		//Android Driver
	
		driver1 = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	//	mobile: longClickGesture
	//	This gesture performs long click action on the given element/coordinates. Available since Appium v1.19

	
	//	Supported arguments
	//	elementId: The id of the element to be clicked. If the element is missing then both click offset coordinates must be provided. If both the element id and offset are provided then the coordinates are parsed as relative offsets from the top left corner of the element.
	//	x: The x-offset coordinate
	//	y: The y-offset coordinate
	//	duration: Click duration in milliseconds. 500 by default. The value must not be negative
	//	locator: The map containing strategy and selector items to make it possible to click dynamic elements.
	
	public void longPress(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
				"duration", 2000));

	}
	
	@AfterClass
	public void tearDown() {
		driver1.quit();
		service.stop();

	}
}
