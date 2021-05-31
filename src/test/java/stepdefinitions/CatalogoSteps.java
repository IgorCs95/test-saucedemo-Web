package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.CatalogoPage;

public class CatalogoSteps {

	@Quando("^clicar no produto Sauce Labs Backpack$")
	public void clicar_no_produto_Sauce_Labs_Backpack() throws Throwable {
		CatalogoPage cp = new CatalogoPage(Hooks.getDriver());
		cp.clkBtnAddSauceLabsBackpack();
	}

	@Entao("^verificar se o produto \"([^\"]*)\" esta no carrinho$")
	public void entao_verificar_se_o_produto_esta_no_carrinho(String produto) throws Throwable {
		CatalogoPage cp = new CatalogoPage(Hooks.getDriver());
		cp.isProdutoNoCarrinho(produto);
	}
	
	@Entao("^verificar se o produto foi removido esta no carrinho$")
	public void verificar_se_o_produto_foi_removido_esta_no_carrinho() throws Throwable {
		CatalogoPage cp = new CatalogoPage(Hooks.getDriver());
		cp.isProdutoFoiRemovidoDoCarrinho();
	}

	@Quando("^entrar no carrinho$")
	public void entrar_no_carrinho() throws Throwable {
		CatalogoPage cp = new CatalogoPage(Hooks.getDriver());
		cp.entrarNoCarrinho();
		;
	}

	@Quando("^remover o produto do carrinho$")
	public void remover_o_produto_do_carrinho() throws Throwable {
		CatalogoPage cp = new CatalogoPage(Hooks.getDriver());
		cp.clkBtnRemoverSauceLabsBackpack();
	}
}
