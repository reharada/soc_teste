package pageobjects.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.pages.BuscaPage;

public class NovoBuscaPOM {

	public static WebDriver driver;
	String url = "http://ww2.soc.com.br/";
	BuscaPage buscaPage;

	@Before("@searchInMain")
	public void initialize() throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chrome\\85\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		driver.get(url);
		this.buscaPage = new BuscaPage(this.driver);
	}

	@After
	public void terminate() {
		driver.quit();
	}

	@Given("^I see the aceitar cookies button$")
	public void i_see_the_aceitar_cookies_button() {
		assertEquals(buscaPage.getBtnAceitarCookiesEsperado(), buscaPage.getBarraCookieText());
	}

	@When("^I click on it$")
	public void i_click_on_it() {
		assertEquals(true, buscaPage.getBtnAceitarBool());
		buscaPage.btnAceitarClick();
	}

	@Then("^the button hidden$")
	public void the_button_hidden() {
		assertEquals(false, buscaPage.getBtnAceitarhiddenBool());
	}

	@Given("^I am in the main page$")
	public void i_am_in_the_main_page() {
		assertEquals(buscaPage.getTitlePageEsperada(), buscaPage.getTitleBuscaPage());
		System.out.println("Step 1 - Visit SOC's page");

	}

	@Given("^Solucoes e Recursos is visible$")
	public void solucoes_e_Recursos_is_visible() {
		assertEquals(true, buscaPage.getSolucoesRecursosMenuBool());
		System.out.println("Step 2 - Solucoes is visible");
	}

	@When("^I put the cursor on it$")
	public void i_put_the_cursor_on_it() {
		assertEquals(false, buscaPage.getPopoverSubmenuBool());
		buscaPage.popoverSubmenuMoveTo();
		assertEquals(true, buscaPage.getMenuSolucoesAppearBool());
	}

	@When("^I click on FAP$")
	public void i_click_on_FAP() {
		assertEquals(buscaPage.getTextFAP(),buscaPage.cssFAPText());
		buscaPage.cssFAPClick();
	}
	
	
	@Then("^I go to FAP page$")
	public void i_go_to_FAP_page() {
		assertEquals(buscaPage.getFapPageURL(),buscaPage.getCurrencyPageTextext());
	}
}