package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass {

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegBtn() {
		return RegBtn;
	}

	public WebElement getClikRadio() {
		return ClikRadio;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getConfomPass() {
		return ConfomPass;
	}

	public WebElement getRegBtn2() {
		return RegBtn2;
	}

	public WebElement getContn() {
		return contn;
	}


	@FindBy(xpath = "//a[text()='Register']")
	public WebElement RegBtn;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement ClikRadio;

	@FindBy(id = "FirstName")
	public WebElement firstName;

	@FindBy(id = "LastName")
	public WebElement lastName;

	@FindBy(id = "Email")
	public WebElement email;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	public WebElement pass;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement ConfomPass;

	@FindBy(xpath = "//input[@value='Register']")
	public WebElement RegBtn2;

	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement contn;

	

}
