package com.test.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.helper.Hook;

public class OnGetText {

	private WebDriver onGetTextDriver;

	public OnGetText() {
		this.onGetTextDriver = Hook.getDriver();
	}

	public String getTextById(String objectName) {
		String text = getOnGetTextDriver().findElement(By.id(objectName)).getText();
		return text;
	}

	public String getTextByName(String objectName) {
		String text = getOnGetTextDriver().findElement(By.name(objectName)).getText();
		return text;
	}

	public String getTextBySelector(String objectName) {
		String text = getOnGetTextDriver().findElement(By.cssSelector(objectName)).getText();
		System.out.println(text + " Ini Text");
		
		return text;
	}

	public String getTextByXpath(String objectName) {
		String text = getOnGetTextDriver().findElement(By.xpath(objectName)).getText();
		return text;
	}

	public WebDriver getOnGetTextDriver() {
		return onGetTextDriver;
	}

	public void setOnGetTextDriver(WebDriver onGetTextDriver) {
		this.onGetTextDriver = onGetTextDriver;
	}
}
