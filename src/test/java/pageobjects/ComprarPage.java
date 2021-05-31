package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class ComprarPage extends MetodosUteis {

	protected WebDriver driver;

	public ComprarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(how = How.ID, using = "first-name")
	private WebElement txtFirstName;

	@FindBy(how = How.ID, using = "last-name")
	private WebElement txtLastName;

	@FindBy(how = How.ID, using = "postal-code")
	private WebElement txtPostalCode;
	
	@FindBy(how = How.ID, using = "checkout")
	private WebElement btnCheckout;

	@FindBy(how = How.ID, using = "continue")
	private WebElement btnContinue;
	
	@FindBy(how = How.ID, using = "finish")
	private WebElement btnFinish;

	@FindBy(how = How.CLASS_NAME, using = "error-message-container")
	private WebElement msgErro;
	
	
	
	/* Preechimento de campos */
	public void preencherPrimeiroNome(String primeiroNome) {
		esperarElemento(txtFirstName);
		txtFirstName.sendKeys(primeiroNome);
	}

	public void preencherUltimoNome(String ultimoNome) {
		esperarElemento(txtLastName);
		txtLastName.sendKeys(ultimoNome);
	}

	public void preencherCaixaPostal(String caixaPostal) {
		esperarElemento(txtPostalCode);
		txtPostalCode.sendKeys(caixaPostal);
	}

	/* Clicks em botoes */

		public void clkBtnContinue() {
		esperarElemento(btnContinue);
		btnContinue.click();
	}

	public void clkBtnCheckout() {
		esperarElemento(btnCheckout);
		btnCheckout.click();
	}
	
	public void clkBtnFinish() {
		esperarElemento(btnFinish);
		btnFinish.click();
	}

	/* Validacoes */

	public void confirmacaoCompra() {
		WebElement produto = driver.findElement(By.id("checkout_complete_container"));
		esperarElemento(produto);
		assertTrue(produto.isDisplayed());
	}
	
	public void mensagenDeErro() {
		esperarElemento(msgErro);
		assertTrue(msgErro.isDisplayed());
	}

}
