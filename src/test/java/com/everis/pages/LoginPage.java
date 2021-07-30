package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class LoginPage extends BasePage {

	@FindBy(id = "email")
    private WebElement usernameInput;
	
    @FindBy(id = "passwd")
	private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
	private WebElement SubmitLogin;
    
    public LoginPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	
	public void fazerLogin(String emailaddress, String password) {
        usernameInput.sendKeys("admin@hotmail.com");
        passwordInput.sendKeys("12345");
        SubmitLogin.click();
    }
	
	
}
