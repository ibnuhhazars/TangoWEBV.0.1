package com.test.eventConnector;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.test.helper.Hook;

public class OnEnter {

	private WebDriver onEnterDriver;

	public OnEnter() {
		this.onEnterDriver = Hook.getDriver();
	}

	public void onEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}

	public WebDriver getOnEnterDriver() {
		return onEnterDriver;
	}

	public void setOnEnterDriver(WebDriver onEnterDriver) {
		this.onEnterDriver = onEnterDriver;
	}
}
