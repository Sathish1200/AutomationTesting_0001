package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends BaseClass {

	public PurchasePage() {
		PageFactory.initElements(driver, this);

	}

	public WebElement getSerchBtn() {
		return serchBtn;
	}

	public WebElement getClickBtn() {
		return clickBtn;
	}

	public WebElement getAddcartBtn() {
		return addcartBtn;

	}

	public WebElement getShopCart() {
		return shopCart;

	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getComName() {
		return comName;
	}

	public WebElement getBilling() {
		return billing;

	}

	public WebElement getArmenia() {
		return armenia;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getFaxNo() {
		return faxNo;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCheckBox1() {
		return checkBox1;
	}

	public WebElement getContinueBtn1() {
		return continueBtn1;
	}

	public WebElement getContinueBtn2() {
		return continueBtn2;
	}

	public WebElement getContinueBtn3() {
		return continueBtn3;

	}
	public WebElement getContinueBtn4() {
		return continueBtn4;
	}
	public WebElement getContinueBtn5() {
		return continueBtn5;
	}

	

	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement serchBtn;

	@FindBy(xpath = "(//input[@value='Search'])[1]")
	public WebElement clickBtn;

	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	public WebElement addcartBtn;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	public WebElement shopCart;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement checkBox;

	@FindBy(id = "checkout")
	public WebElement checkOut;

	@FindBy(id = "BillingNewAddress_Company")
	public WebElement comName;

	@FindBy(id = "BillingNewAddress_CountryId")
	public WebElement billing;

	@FindBy(xpath = "//option[text()='Armenia']")
	public WebElement armenia;

	@FindBy(xpath = "(//input[@data-val='true'])[5]")
	public WebElement city;

	@FindBy(xpath = "(//input[@data-val='true'])[6]")
	public WebElement address1;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement address2;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement postalCode;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement phoneNo;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement faxNo;

	@FindBy(xpath = "(//input[@type='button'])[2]")
	public WebElement continueBtn;

	@FindBy(id = "PickUpInStore")
	public WebElement checkBox1;




	@FindBy(xpath = "(//input[@type='button'])[3]")
	public WebElement continueBtn1;

	@FindBy(xpath = "(//input[@type='button'])[5]")
	public WebElement continueBtn2;

	@FindBy(xpath = "(//input[@type='button'])[6]")
	public WebElement continueBtn3;
	
	@FindBy(xpath = "//input[@value='Confirm']")
	public WebElement continueBtn4;
	
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement continueBtn5;

	
	

	}

	
	


