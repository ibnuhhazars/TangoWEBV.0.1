package com.test.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;

public class Drivers {

	private static WebDriver driver;
	private DesiredCapabilities cap = new DesiredCapabilities();
	private Scenario myScenario;
	private String urlAmazone = "https://www.amazon.com/";

	public String getUrlAmazone() {
		return urlAmazone;
	}

	public void setUrlAmazone(String urlAmazone) {
		this.urlAmazone = urlAmazone;
	}

	public DesiredCapabilities getCap() {
		return cap;
	}

	public void setCap(DesiredCapabilities cap) {
		this.cap = cap;
	}

	public Scenario getMyScenario() {
		return myScenario;
	}

	public void setMyScenario(Scenario myScenario) {
		this.myScenario = myScenario;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Drivers.driver = driver;
	}
}
