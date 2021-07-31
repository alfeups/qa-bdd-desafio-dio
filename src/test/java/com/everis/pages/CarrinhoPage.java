package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class CarrinhoPage extends BasePage {
	
	@FindBy(css =".cart_navigation .button-medium span")
	protected WebElement botaoAcessarCheckout;
	
	@FindBy(css = ".cart_navigation .button-medium span")
	protected WebElement botaoConfirmaEndereco;
	
	@FindBy(css = "div.radio input")
	protected WebElement botaoModoEnvio;
		
	@FindBy(css = ".checker span input")
	protected WebElement botaoConcordarTermos;
	
	@FindBy(css = ".cart_navigation .button-medium span")
	protected WebElement botaoSeguirParaPagamento;
	
	
	
	public CarrinhoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public boolean apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		boolean apresentouProdutoEsperadoNoCarrinho = isElementDisplayed(By.xpath("//*[contains(@class,'cart_item')]//a[text()='" + nomeProduto + "']"));
		if (apresentouProdutoEsperadoNoCarrinho) {
			log("Apresentou o produto [" + nomeProduto + "] no carrinho conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho.");
		return false;
	}

	
	public void acessarCheckout() {
		botaoAcessarCheckout.click();
		log("Seguiu para checkout.");
		
	}

	public void confirmarEndereco() {
		botaoConfirmaEndereco.click();
		log("Confirmou o endereço");
	}

	public void escolherModoEnvio() {
		botaoModoEnvio.click();
		log("Modo de envio escolhido");
		botaoConcordarTermos.click();
		log("Concordou com os termos");
		botaoSeguirParaPagamento.click();
		log("Seguiu para pagamento");
	}

}