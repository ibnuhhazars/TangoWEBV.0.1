package com.test.pageObject.DepartementMenuPage;

import com.test.eventConnector.Main;

public class DepartementMenuPage extends Main {
	
	//TODO: Elements
	String btnHeadphone = "//*[@id=\"a-page\"]/div[1]/div/div[3]/div[1]/div/a[7]";
	String btnProduct = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/span/a/div";
	String btnProductMacPro1 = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[3]/div/div/div/div[2]/div[1]/div/div/span/a/div/img";
	String btnProductMacPro2 = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[5]/div/div/div/div[2]/div[1]/div/div/span/a/div/img";

	//TODO: Data
	
	public void clickBtnHeadphone() {
		getClick().clickByXpath(btnHeadphone);
	}

	public void clickBtnProduct() {
		getClick().clickByXpath(btnProduct);
	}

	public void clickBtnProductMacPro1() {
		getClick().clickByXpath(btnProductMacPro1);
	}

	public void clickBtnProductMacPro2() {
		getClick().clickByXpath(btnProductMacPro2);
	}
}
