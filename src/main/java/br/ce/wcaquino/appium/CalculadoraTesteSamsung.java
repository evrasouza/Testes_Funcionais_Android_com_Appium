package br.ce.wcaquino.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTesteSamsung {
	
	@Test
	public void deveSomarDoisValores() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	    desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    
	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("2");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Mais");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("2");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Visualizar resultado 4");
	    
	    
	    Assert.assertEquals("4", el4.getText());

	    driver.quit();
		
	}

}
