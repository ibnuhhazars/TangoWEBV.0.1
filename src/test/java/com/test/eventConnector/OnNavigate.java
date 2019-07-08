package com.test.eventConnector;

import org.openqa.selenium.WebDriver;

import com.test.helper.Hook;

public class OnNavigate {

	private WebDriver onNavigateDriver;
	
	public OnNavigate() {
		this.onNavigateDriver = Hook.getDriver();
	}
	
	public void navigate(String text) throws InterruptedException {
		Thread.sleep(3000);
		getOnNavigateDriver().navigate().to(text);
	}

	public WebDriver getOnNavigateDriver() {
		return onNavigateDriver;
	}

	public void setOnNavigateDriver(WebDriver onNavigateDriver) {
		this.onNavigateDriver = onNavigateDriver;
	}
}
