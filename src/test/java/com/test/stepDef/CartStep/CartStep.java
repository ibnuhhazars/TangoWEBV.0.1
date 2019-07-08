package com.test.stepDef.CartStep;

import com.test.pageObject.CartPage.CartPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartStep extends CartPage {
	
	@When("^i remove headphone from cart$")
	public void i_remove_headphone_from_cart () {
		clickBtnDeleteHeadset();
	}
	
	@Then("^i see headphone \"([^\"]*)\"$")
	public void i_see_headphone(String text) throws InterruptedException {
		verifyLblDelete(text);
	}
	
	@When("^i reduce quantity of the macbook pro to \"([^\"]*)\"$")
	public void i_reduce_quantity_of_the_macbook_pro_to(String text) throws InterruptedException {
		clickdpdQtyMacbook1();
		clickdpdQtyMacbook2();
	}
	
	@Then("^i see subtotal item \"([^\"]*)\"$")
	public void i_see_subtotal_item (String text) throws InterruptedException {
		verifyLblSubtotalItem(text);
	}
	
	@When("^i process to checkout$")
	public void i_process_to_checkout () {
		clickBtnProcess();
	}
	
}
