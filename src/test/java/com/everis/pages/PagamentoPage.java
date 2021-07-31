package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;

import com.everis.util.Hooks;
public class PagamentoPage extends BasePage {
	
	@FindBy(css = "p.payment_module a.bankwire")
	protected WebElement botaoPagamentoTransferenciaBancaria;
	
	@FindBy(css = ".cart_navigation .button-medium span")
	protected WebElement confirmacaoFinal;
	
	@FindBy( xpath = "//*[contains(text(),'Your order on My Store is complete.')]")
	protected WebElement mensagemCompraFinalizada;
	
	
	public PagamentoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void pagarPorTransferenciaBancaria() {
		botaoPagamentoTransferenciaBancaria.click();
		log("Pagamento efetuado por Transferencia Bancaria.");
		confirmacaoFinal.click();
		log("Seguiu para a página final de pagamento");
		
		
	}

	public void orderCompleted() {
		String string = "Your order on My Store is complete.";	
	}
}
