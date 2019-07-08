package com.test.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;

import com.test.helper.Hook;

public class OnVerify {

	private WebDriver onVerifyDriver;

	public OnVerify() {
		this.setOnVerifyDriver(Hook.getDriver());
	}

	public void onVerifyById(String text, String objectName) {
		String getText = getOnVerifyDriver().findElement(By.id(objectName)).getText();
		AssertJUnit.assertEquals(text, getText);
	}

	public void onVerifyByName(String text, String objectName) {
		String getText = getOnVerifyDriver().findElement(By.name(objectName)).getText();
		AssertJUnit.assertEquals(text, getText);
	}

	public void onVerifyBySelector(String text, String objectName) {
		String getText = getOnVerifyDriver().findElement(By.cssSelector(objectName)).getText();
		AssertJUnit.assertEquals(text, getText);
	}

	public void onVerifyByXpath(String text, String objectName) {
		String getText = getOnVerifyDriver().findElement(By.xpath(objectName)).getText();
		AssertJUnit.assertEquals(text, getText);
	}

	public void onVerifyByTittle(String text) {
		String getTittle = getOnVerifyDriver().getTitle();
		AssertJUnit.assertEquals(text, getTittle);
	}

	public WebDriver getOnVerifyDriver() {
		return onVerifyDriver;
	}

	public void setOnVerifyDriver(WebDriver onVerifyDriver) {
		this.onVerifyDriver = onVerifyDriver;
	}
}
