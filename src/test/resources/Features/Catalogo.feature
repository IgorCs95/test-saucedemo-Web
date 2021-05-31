#language: pt
#enconding: UTF-8

@Catalogo @End2End
Funcionalidade: Catalogo

  Contexto: 
    Dado que o usuario esteja na pagina de login do swaglabs
    E que o usuario ja esteja logado

  @AdicionandoProdutoCarrinho
  Cenario: Adicionar produto ao carrinho de compras
    Quando clicar no produto Sauce Labs Backpack
    E entrar no carrinho
    Entao verificar se o produto "Sauce Labs Backpack" esta no carrinho 

  @RemoverProdutoCarrinho
  Cenario: Remover produto do carrinho de compras
    Quando clicar no produto Sauce Labs Backpack
    E entrar no carrinho
    E remover o produto do carrinho
    Entao verificar se o produto foi removido esta no carrinho