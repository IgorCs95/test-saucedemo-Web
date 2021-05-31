package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class LoginPage extends MetodosUteis {

	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "user-name")
	private WebElement usuario;

	@FindBy(how = How.ID, using = "password")
	private WebElement senha;

	@FindBy(how = How.ID, using = "login-button")
	private WebElement btnLogin;

	@FindBy(how = How.ID, using = "inventory_container")
	private WebElement catalogo;

	@FindBy(how = How.CLASS_NAME, using = "error-message-container")
	private WebElement msgErroLogin;

	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	private WebElement btnMenu;

	@FindBy(how = How.ID, using = "logout_sidebar_link")
	private WebElement btnLogout;

	@FindBy(how = How.CLASS_NAME, using = "login_credentials_wrap")
	private WebElement divCredenciaisPaginaLogin;

	/* Preechimentos de campos */

	public void preencherUsuario(String nomeUsuario) {
		esperarElemento(usuario);
		usuario.sendKeys(nomeUsuario);
	}

	public void preencherSenha(String senhaUsuario) {
		esperarElemento(senha);
		senha.sendKeys(senhaUsuario);
	}

	/* Clicks em Botoes */

	public void clicarBotaoLogin() {
		esperarElemento(btnLogin);
		btnLogin.click();
	}

	public void clicarMenu() {
		esperarElemento(btnMenu);
		btnMenu.click();
	}

	public void clicarBotaoLogout() {
		esperarElemento(btnLogout);
		btnLogout.click();
	}

	/* Validacoes */

	public void validarCatalogo() {
		esperarElemento(catalogo);
		assertTrue(catalogo.isEnabled());
	}

	public void validarPaginaLogin() {
		esperarElemento(divCredenciaisPaginaLogin);
		assertTrue(divCredenciaisPaginaLogin.isEnabled());
	}

	public void ErroLoginInvalido() {
		esperarElemento(msgErroLogin);
		assertTrue(msgErroLogin.isEnabled());
	}
}
