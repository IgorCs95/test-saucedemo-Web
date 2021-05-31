package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class CatalogoPage extends MetodosUteis {

	protected WebDriver driver;

	public CatalogoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	private WebElement btnAddSauceLabsBackpack;

	@FindBy(how = How.ID, using = "remove-sauce-labs-backpack")
	private WebElement btnRemoverSauceLabsBackpack;

	@FindBy(how = How.CLASS_NAME, using = "shopping_cart_link")
	private WebElement btnCarrinho;
	
	/*Sauce Labs Backpack*/
	@FindBy(how = How.ID, using = "item_4_title_link")
	private WebElement lblItemNoCarrinho;
	
	/*Sauce Labs Backpack*/
	@FindBy(how = How.CLASS_NAME, using = "removed_cart_item")
	private WebElement itemsNoCarrinho;

	
	
	/* Clicks em botoes */

	public void clkBtnAddSauceLabsBackpack() {
		esperarElemento(btnAddSauceLabsBackpack);
		btnAddSauceLabsBackpack.click();
	}

	public void clkBtnRemoverSauceLabsBackpack() {
		esperarElemento(btnRemoverSauceLabsBackpack);
		btnRemoverSauceLabsBackpack.click();
	}

	public void entrarNoCarrinho() {
		esperarElemento(btnCarrinho);
		btnCarrinho.click();

	}

	/* Validacoes */

	public void isProdutoNoCarrinho(String produtoBusca) {
		WebElement produto = driver.findElement(By.linkText(produtoBusca));
		esperarElemento(produto);
		assertTrue(produto.isDisplayed());
	}
	
	public void isProdutoFoiRemovidoDoCarrinho() {
		WebElement removido = driver.findElement(By.className("removed_cart_item"));
		assertTrue(removido.isEnabled());
	}
	
	

}
