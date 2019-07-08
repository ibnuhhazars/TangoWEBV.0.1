package com.test.stepDef.HomeStep;

import java.awt.AWTException;

import com.test.pageObject.DepartementMenuPage.DepartementMenuPage;
import com.test.pageObject.HomePage.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStep extends HomePage {

	@When("^i click menu Departements Headphone$")
	public void i_click_menu_departement_headphone() {
		clickBtnDepartement();
		DepartementMenuPage deptMenu = new DepartementMenuPage();
		deptMenu.clickBtnHeadphone();
	}

	@When("^i search \"([^\"]*)\"$")
	public void i_search(String text) throws AWTException {
		setTextSearchBar(text);
		clickBtnSearchSubmit();
	}

	@When("^i navigate to homepage$")
	public void i_navigate_to_homepage() throws InterruptedException {
		navigateHomepage();
	}

	@When("^i click cart from homepage$")
	public void i_click_cart_from_homepage() throws InterruptedException {
		clickBtnCart();
	}

	@Then("^i see search label is \"(.*)\"$")
	public void i_see_search_label_is(String text) {
		verifylblSearchValue(text);
	}

}
