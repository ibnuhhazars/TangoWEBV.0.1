package com.test.stepDef.ShippingStep;

import com.test.pageObject.ShippingPage.ShippingPage;

import cucumber.api.java.en.Then;

public class ShippingStep extends ShippingPage{

	@Then("^i see shipping page$")
	public void i_remove_headphone_from_cart () {
		verifyLblShippingAddress();
	}
}
