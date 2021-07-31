package com.everis.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
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
	
	
	@Quando("^o pagamento for confirmado$")
	public void pagarPorTransferenciaBancaria() {
		PagamentoPage pagamentoPage = new PagamentoPage();
		pagamentoPage.pagarPorTransferenciaBancaria();
	}
		
	@Entao("Entao deve ser apresentado a mensagem \"( .*)\"$")
	public void orderCompleted() {
		PagamentoPage pagamentoPage = new PagamentoPage();
		pagamentoPage.orderCompleted();
	}
	
}
/*	
	@Quando("^o pagamento for confirmado com cheque")
	public void pagarComCheque() {
		PagamentoPage pagamentoPage = new PagamentoPage();
		pagamentoPage.pagarComCheque();

	}
 */