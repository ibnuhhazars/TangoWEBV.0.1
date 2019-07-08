package com.test.stepDef.DepartementMenuStep;

import com.test.pageObject.DepartementMenuPage.DepartementMenuPage;
import com.test.pageObject.HomePage.HomePage;
import com.test.pageObject.ProductDetailPage.ProductDetailPage;

import cucumber.api.java.en.When;

public class DepartementMenuStep extends DepartementMenuPage {

	@When("^i click one item available$")
	public void i_click_one_item_available() {
		clickBtnProduct();
	}

	@When("^i add to cart two Available product with \"([^\"]*)\" qty$")
	public void i_select_nd_Available_product_with_qty(String text) throws InterruptedException {
		clickBtnProductMacPro1();
		ProductDetailPage pdp = new ProductDetailPage();
		pdp.verifyStock();
		pdp.selectQuantity(text);
		pdp.clickAddtoCart();
		pdp.continuePDP();
		
		HomePage homePage = new HomePage();
		homePage.getNavigate();
		homePage.setTextSearchBar("Macbook Pro");
		homePage.clickBtnSearchSubmit();
		clickBtnProductMacPro2();
		pdp.verifyStock();
		pdp.selectQuantity(text);
		pdp.clickAddtoCart();
		pdp.continuePDP();
	}
}
