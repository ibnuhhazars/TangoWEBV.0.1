package com.test.helper;

import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Drivers {

	@Before
	public void beforeTest(Scenario scenario) throws Exception {
		this.setMyScenario(scenario);
		getCap().setPlatform(Platform.LINUX);
		getCap().setBrowserName("chrome");
		getCap().setVersion("68.0");
		getCap().setCapability("enableVNC", true);
		getCap().setCapability("enableVideo", false);

		URL url = new URL("http://localhost:4444/wd/hub");

		setDriver(new RemoteWebDriver(url, getCap()));
		getDriver().get(getUrlAmazone());
		getDriver().manage().window().setSize(new Dimension(1920, 1080));
	}

	@After
	public void afterTest() throws Exception {

		if (getMyScenario().isFailed()) {
			getMyScenario().embed(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
			getMyScenario().write("Scenario Fail");
		} else {
			getMyScenario().write("Scenario Pass");
		}

		Thread.sleep(3000);

		getDriver().quit();
	}
}
