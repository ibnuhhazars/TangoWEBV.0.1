package com.test.eventConnector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.test.helper.Hook;

public class OnSelect {

	private WebDriver onSelectDriver;

	public OnSelect() {
		this.onSelectDriver = Hook.getDriver();
	}

	public void selectById(String text, String objectName) throws InterruptedException {
		WebElement fieldSortBy = getOnSelectDriver().findElement(By.id(objectName));
		Select selectedItem = new Select(fieldSortBy);
		Thread.sleep(1000);
		selectedItem.selectByVisibleText(text);
	}

	public void selectByName(String text, String objectName) throws InterruptedException {
		WebElement fieldSortBy = getOnSelectDriver().findElement(By.name(objectName));
		Select selectedItem = new Select(fieldSortBy);
		Thread.sleep(1000);
		selectedItem.selectByVisibleText(text);
	}

	public WebDriver getOnSelectDriver() {
		return onSelectDriver;
	}

	public void setOnSelectDriver(WebDriver onSelectDriver) {
		this.onSelectDriver = onSelectDriver;
	}
}
