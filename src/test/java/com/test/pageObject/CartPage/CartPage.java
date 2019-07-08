package com.test.pageObject.CartPage;

import com.test.eventConnector.Main;

public class CartPage extends Main {

	// TODO : ELEMENT
	String btnDeleteHeadset = ".sc-list-body.sc-java-remote-feature>div:nth-child(3)>div.sc-list-item-content>div>div>div>div>div>div.a-row>span:nth-child(1)>span>input";
	String lblHeadsetProduct = ".sc-list-body.sc-java-remote-feature>div:nth-child(3)>div.sc-list-item-content>div>div>div>div>div.a-fixed-left-grid-col.a-col-right>ul>li>span>a>span";
	String lblDelete = "//*[@data-item-count='3']/div[3]/div[1]/span";
	String dropdownQuantityMacbook2 = "//*[@data-item-count='2']/div[4]/div/div[3]/div/div/span/span";
	String dropdownQuantityMacbook1 = "//*[@data-item-count='1']/div[4]/div/div[3]/div/div/span/span";
	String lblQuantityMacbook1 = "#a-popover-4 > div > div > ul > li:nth-child(1)";
	String lblQuantityMacbook2 = "#a-popover-5 > div > div > ul > li:nth-child(1)";
	String lblSubtotalItem = "sc-subtotal-label-activecart";
	String btnProcess = "sc-buy-box-ptc-button";
	
	// TODO : DATA
	String expectedHeadset = "Bose QuietComfort 35 II Wireless Bluetooth Headphones, Noise-Cancelling, with Alexa voice control, enabled with Bose AR – Black";

	public void clickBtnDeleteHeadset() {
		String actualHeadset = getGettext().getTextBySelector(lblHeadsetProduct);
		if (actualHeadset.equals(expectedHeadset)) {
			getClick().clickBySelector(btnDeleteHeadset);
		}
	}

	public void verifyLblDelete(String text) throws InterruptedException {
		Thread.sleep(3000);
		getVerify().onVerifyByXpath(text, lblDelete);
	}
	
	public void clickdpdQtyMacbook1() throws InterruptedException {
		Thread.sleep(2000);
		getClick().clickByXpath(dropdownQuantityMacbook1);
		getClick().clickBySelector(lblQuantityMacbook1);
	}
	
	public void clickdpdQtyMacbook2() throws InterruptedException {
		Thread.sleep(2000);
		getClick().clickByXpath(dropdownQuantityMacbook2);
		getClick().clickBySelector(lblQuantityMacbook2);
	}
	
	public void clickBtnProcess() {
		getClick().clickById(btnProcess);
	}
	
	public void verifyLblSubtotalItem(String text) throws InterruptedException {
		Thread.sleep(2000);
		getVerify().onVerifyById(text, lblSubtotalItem);
	}
}
