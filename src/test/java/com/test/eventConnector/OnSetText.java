package com.test.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.helper.Hook;

public class OnSetText {
	
	private WebDriver onSetTextDriver;

	public OnSetText() {
		this.onSetTextDriver = Hook.getDriver();
	}
	
	public void onSetTextById(String text, String objectEvent) {
		getOnSetTextDriver().findElement(By.id(objectEvent)).sendKeys(text);
	}
	
	public void onSetTextByName(String text, String objectEvent) {
		getOnSetTextDriver().findElement(By.name(objectEvent)).sendKeys(text);
	}
	
	public WebDriver getOnSetTextDriver() {
		return onSetTextDriver;
	}

	public void setOnSetTextDriver(WebDriver onSetTextDriver) {
		this.onSetTextDriver = onSetTextDriver;
	}
}
