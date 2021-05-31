package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {

	WebDriver driver;

	@Dado("^que o usuario esteja na pagina de login do swaglabs$")
	public void que_o_usuario_esteja_na_pagina_de_login_do_swaglabs() throws Throwable {
		Hooks.abrirUrl("https://www.saucedemo.com/");
		driver = Hooks.getDriver();
	}

	@Quando("^informar o campo Username como \"([^\"]*)\"$")
	public void informar_o_campo_Username_como(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherUsuario(arg1);
	}

	@Quando("^informar o campo Password como \"([^\"]*)\"$")
	public void informar_o_campo_Password_como(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherSenha(arg1);
	}

	@Quando("^clicar no botao Login$")
	public void clicar_no_botao_Login() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.clicarBotaoLogin();
	}

	@Entao("^o sistema devera autorizar o login e mostrar o catalogo\\.$")
	public void o_sistema_devera_autorizar_o_login_e_mostrar_o_catalogo() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.validarCatalogo();
	}

	@Entao("^o sistema devera mostrar mensagen de erro\\.$")
	public void o_sistema_devera_mostrar_mensagen_de_erro() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.ErroLoginInvalido();
	}

	@Dado("^que o usuario ja esteja logado$")
	public void que_o_usuario_ja_esteja_logado() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherUsuario("standard_user");
		lp.preencherSenha("secret_sauce");
		lp.clicarBotaoLogin();
	}

	@Quando("^clicar no menu$")
	public void clicar_no_menu() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.clicarMenu();
	}

	@Quando("^clicar em logout$")
	public void clicar_em_logout() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.clicarBotaoLogout();
	}

	@Entao("^o sistema devera mostrar a pagina de login do sistema\\.$")
	public void o_sistema_devera_mostrar_a_pagina_de_login_do_sistema() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.validarPaginaLogin();
	}

}
