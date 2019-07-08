package com.test.pageObject.ShippingPage;

import com.test.eventConnector.Main;

public class ShippingPage extends Main {
	
	// TODO: ELEMENT
	String lblShippingAddress = "body > div.checkout.checkout-as.checkout-as-desktop > div:nth-child(2) > div.clearfix > h1";

	// TODO: DATA 
	String dataShippingPage = "Select a shipping address";
	
	public void verifyLblShippingAddress() {
		getVerify().onVerifyBySelector(dataShippingPage, lblShippingAddress);
	}
}
