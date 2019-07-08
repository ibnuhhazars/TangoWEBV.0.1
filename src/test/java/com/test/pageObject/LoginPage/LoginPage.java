package com.test.pageObject.LoginPage;

import com.test.eventConnector.Main;

public class LoginPage extends Main {

	//TODO: ELEMENT
	String btnNavigateLogin = "nav-link-accountList";
	String txtUser = "ap_email";
	String txtPassword = "ap_password";
	String btnSignIn = "signInSubmit";
	
	//TODO: DATA
	String pass = "Passw0rdGojek";
	
	public void clickBtnNavigateLogin() {
		getClick().clickById(btnNavigateLogin);
	}
	
	public void setUserPass(String text) {
		getSetText().onSetTextById(text, txtUser);
		getSetText().onSetTextById(pass, txtPassword);
	}
	
	public void clickBtnSignIn() {
		getClick().clickById(btnSignIn);
	}
}
