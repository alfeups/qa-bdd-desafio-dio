# language: pt
# encoding: utf-8

#@test
#	Funcionalidade: Realizar Compra no E-commerce

	#Como um comprador
	#Quero ver a lista de produtos disponiveis
	#Para que eu possa escolher qual devo comprar
		
#  Cenario: Adicionar produto ao carrinho
 # 	Dado que um usuario acessa o site "http://automationpractice.com"
  #	E pesquisa pelo produto "Blouse"
  	#Quando adiciona o produto "Blouse" ao carrinho
  #	Entao o produto "Blouse" deve estar presente no carrinho
	#	E acessa o checkout
		
@test
	Funcionalidade: Realizar Compra no E-commerce
		
	  Cenario: Realizar Compra
		Dado que um usuario acessa o site "http://automationpractice.com"
  	E pesquisa pelo produto "Blouse"
  	E adiciona o produto "Blouse" ao carrinho
  	E acessa o checkout
  	E realiza login "admin@hotmail.com" "/Ox34Vh90"
  	E confirma o endereço de entrega
  	E escolhe a forma de transporte
  	E quando o pagamento for confirmado
  	Entao deve ser apresentado a mensagem "Your order on My Store is complete."

