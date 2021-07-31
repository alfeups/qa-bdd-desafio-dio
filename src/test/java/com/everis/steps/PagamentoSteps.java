package com.everis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.everis.util.Hooks;

import com.everis.pages.CarrinhoPage;
import com.everis.pages.HomePage;
import com.everis.pages.LoginPage;
import com.everis.pages.PagamentoPage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PagamentoSteps {
	
	
	@E("quando o pagamento for confirmado")
	public void pagarPorTransferenciaBancaria() {
		PagamentoPage pagamentoPage = new PagamentoPage();
		pagamentoPage.pagarPorTransferenciaBancaria();
	}
											
	@Entao("^deve ser apresentado a mensagem \"(.*)\"$")
	public void orderCompleted(String string) {
		PagamentoPage pagamentoPage = new PagamentoPage();
		pagamentoPage.orderCompleted();
}
}