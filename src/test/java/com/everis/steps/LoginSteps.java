package com.everis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.everis.util.Hooks;

import com.everis.pages.CarrinhoPage;
import com.everis.pages.HomePage;
import com.everis.pages.LoginPage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class LoginSteps {
	
	@E("^realiza login \"(.*)\" \"(.*)\"$")
	public void fazerLogin(String emailaddress, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.fazerLogin(emailaddress, password);
	}
	
}

	