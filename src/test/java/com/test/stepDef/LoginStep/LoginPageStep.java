package com.test.stepDef.LoginStep;

import com.test.pageObject.LoginPage.LoginPage;

import cucumber.api.java.en.When;

public class LoginPageStep extends LoginPage {

	@When("^i login with user \"([^\"]*)\"$")
	public void i_login_with_user(String text) {
		clickBtnNavigateLogin();
		setUserPass(text);
		clickBtnSignIn();
	}
}
