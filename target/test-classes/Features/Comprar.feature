#language: pt
@Compra @End2End
Funcionalidade: Compra produto

  Contexto: 
    Dado que o usuario esteja na pagina de login do swaglabs
    E que o usuario ja esteja logado

  @RealizarCompra
  Cenario: Realizar compra
    Quando clicar no produto Sauce Labs Backpack
    E entrar no carrinho
    E verificar se o produto "Sauce Labs Backpack" esta no carrinho
    E clicar em checkout para preecher finalizar o pedido
    E preecher os dados de fist name com "Igor"
    E preecher os dados de last name com "Soares"
    E preecher os dados de postal code com "55555555"
    E clicar em continue para ir para a tela de finalizar o pedido
    E clicar em finish para finalizar o pedido
    Entao verificar se o pedido foi realizado
    
	@ErroRealizarCompraComCamposEmBranco
  Cenario: Realizar compra
    Quando clicar no produto Sauce Labs Backpack
    E entrar no carrinho
    E verificar se o produto "Sauce Labs Backpack" esta no carrinho
    E clicar em checkout para preecher finalizar o pedido
    E preecher os dados de last name com "Soares"
    E preecher os dados de postal code com "55555555"
    E clicar em continue para ir para a tela de finalizar o pedido
    Entao verificar mensagen de erro na compra
  