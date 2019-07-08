package com.test.pageObject.HomePage;

import java.awt.AWTException;

import com.test.eventConnector.Main;

public class HomePage extends Main {

	// TODO: Element
	String btnDepartement = "nav-link-shopall";
	String txtSearchBar = "twotabsearchtextbox";
	String btnSearchSubmit = "#nav-search > form > div.nav-right > div > input";
	String btnCart = "nav-cart";
	String lblSearchValue = "#search > span > h1 > div > div.sg-col-14-of-20.sg-col-26-of-32.sg-col-18-of-24.sg-col.sg-col-22-of-28.s-breadcrumb.sg-col-10-of-16.sg-col-30-of-36.sg-col-6-of-12 > div > div > span.a-color-state.a-text-bold";
	
	// TODO: DATA
	String homePage = "https://www.amazon.com/";

	public void clickBtnDepartement() {
		getClick().clickById(btnDepartement);
	}

	public void setTextSearchBar(String text) {
		getSetText().onSetTextById(text, txtSearchBar);
	}

	public void navigateHomepage() throws InterruptedException {
		getNavigate().navigate(homePage);
	}

	public void enterSearchBar() throws AWTException {
		getEnter().onEnter();
	}

	public void clickBtnSearchSubmit() {
		getClick().clickBySelector(btnSearchSubmit);
	}
	
	public void clickBtnCart() {
		getClick().clickById(btnCart);
	}
	
	public void verifylblSearchValue(String text) {
		getVerify().onVerifyBySelector(text, lblSearchValue);
	}
}
