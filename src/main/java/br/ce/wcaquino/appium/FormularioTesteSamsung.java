package br.ce.wcaquino.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FormularioTesteSamsung {
	
	@Test
	public void deveInstalarApk() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.ctappium");
	    desiredCapabilities.setCapability("appActivity", "com.ctappium.MainActivity");
	    //desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/EvertonRafaelDeSouza/eclipse-workspace/teste/CursoAppium/src/main/resources/CTAppium_1_2.apk");

	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);


	    driver.quit();
		
	}

}
