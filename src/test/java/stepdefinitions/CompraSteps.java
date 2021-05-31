package stepdefinitions;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.ComprarPage;

public class CompraSteps {

	@Quando("^preecher os dados de fist name com \"([^\"]*)\"$")
	public void preecher_os_dados_de_fist_name_com(String primeiroNome) throws Throwable {
		ComprarPage cp = new ComprarPage(Hooks.getDriver());
		cp.preencherPrimeiroNome(primeiroNome);
	}

	@Quando("^preecher os dados de last name com \"([^\"]*)\"$")
	public void preecher_os_dados_de_last_name_com(String ultimoNome) throws Throwable {
		ComprarPage cp = new ComprarPage(Hooks.getDriver());
		cp.preencherUltimoNome(ultimoNome);
	}

	@Quando("^preecher os dados de postal code com \"([^\"]*)\"$")
	public void preecher_os_dados_de_postal_code_com(String caixaPostal) throws Throwable {
		ComprarPage cp = new ComprarPage(Hooks.getDriver());
		cp.preencherCaixaPostal(caixaPostal);
	}

	@Entao("^verificar se o pedido foi realizado$")
	public void verificar_se_o_pedido_foi_realizado() throws Throwable {
		ComprarPage cp = new ComprarPage(Hooks.getDriver());
		cp.confirmacaoCompra();
	}
	
	@Quando("^clicar em checkout para preecher finalizar o pedido$")
	public void clicar_em_checkout_para_preecher_finalizar_o_pedido() throws Throwable {
		ComprarPage cp = new ComprarPage(Hooks.getDriver());
		cp.clkBtnCheckout();
	}
	
	@Quando("^clicar em continue para ir para a tela de finalizar o pedido$")
	public void clicar_em_continue_para_ir_para_a_tela_de_finalizar_o_pedido() throws Throwable {
		ComprarPage cp = new ComprarPage(Hooks.getDriver());
		cp.clkBtnContinue();
	}

	@Quando("^clicar em finish para finalizar o pedido$")
	public void clicar_em_finish_para_finalizar_o_pedido() throws Throwable {
		ComprarPage cp = new ComprarPage(Hooks.getDriver());
		cp.clkBtnFinish();
	}
	
	@Entao("^verificar mensagen de erro na compra$")
	public void verificar_mensagen_de_erro_na_compra() throws Throwable {
		ComprarPage cp = new ComprarPage(Hooks.getDriver());
		cp.mensagenDeErro();
	}
	
	
	
	
}
