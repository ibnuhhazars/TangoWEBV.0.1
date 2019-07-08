package com.test.pageObject.ProductDetailPage;

import com.test.eventConnector.Main;

public class ProductDetailPage extends Main {

	// TODO : ELEMENT
	String btnAddToCart = "#add-to-cart-button";
	String lblcartSucces = "huc-v2-order-row-confirm-text";
	String lblStock = "availability";
	String dropdownQuantity = "quantity";
	String btncloseCart = "a#attach-close_sideSheet-link.a-link-normal.close-button";
	String btnContinuePDP = "#a-autoid-15 > span > input";
	
	// TODO : DATA
	String lblPDPTittle = "Amazon.com: Bose QuietComfort 35 II Wireless Bluetooth Headphones, Noise-Cancelling, with Alexa voice control, enabled with Bose AR – Black: Electronics";
	String stock = "In Stock.";

	public void verifyPdpTittle() {
		getVerify().onVerifyByTittle(lblPDPTittle);
	}

	public void clickAddtoCart() throws InterruptedException {
		getClick().clickBySelector(btnAddToCart);
	}

	public void verifyCartSucces(String text) {
		getVerify().onVerifyById(text, lblcartSucces);
	}
	
	public void verifyStock() {
		getVerify().onVerifyById(stock, lblStock);
	}
	
	public void selectQuantity(String text) throws InterruptedException {
		getSelect().selectById(text, dropdownQuantity);
	}
	
	public void closeCart() {
		getClick().clickBySelector(btncloseCart);
	}
	
	public void continuePDP() throws InterruptedException {
		Thread.sleep(2000);
		getClick().clickBySelector(btnContinuePDP);
	}
}
