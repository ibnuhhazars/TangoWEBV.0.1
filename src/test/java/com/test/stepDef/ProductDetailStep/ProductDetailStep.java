package com.test.stepDef.ProductDetailStep;

import com.test.pageObject.ProductDetailPage.ProductDetailPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductDetailStep extends ProductDetailPage {

	@When("^i see product detail page$")
	public void i_see_product_detail_page() {
		verifyPdpTittle();
	}
	
	@When("^i click add to cart$")
	public void i_click_add_to_cart() throws InterruptedException {
		clickAddtoCart();
	}
	
	@Then("^i see product already \"([^\"]*)\"$")
	public void i_see_product_already(String text) {

	}
}
