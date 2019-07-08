package com.test.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.helper.Hook;

public class OnClick {

	private WebDriver onClickDriver;

	public OnClick() {
		this.onClickDriver = Hook.getDriver();
	}

	public void clickById(String objectName) {
		getOnClickDriver().findElement(By.id(objectName)).click();
	}

	public void clickByName(String objectName) {
		getOnClickDriver().findElement(By.name(objectName)).click();
	}
	
	public void clickByXpath(String objectName) {
		getOnClickDriver().findElement(By.xpath(objectName)).click();
	}
	
	public void clickBySelector(String objectName) {
		getOnClickDriver().findElement(By.cssSelector(objectName)).click();
	}

	public WebDriver getOnClickDriver() {
		return onClickDriver;
	}

	public void setOnClickDriver(WebDriver onClickDriver) {
		this.onClickDriver = onClickDriver;
	}

}
