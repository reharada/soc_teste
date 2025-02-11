package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class BuscaPage {
	protected static WebDriver driver;
	
	public BuscaPage(WebDriver driver) {
		this.driver = driver;
	}

	//@Given("^I see the aceitar cookies button$")
	private String btnAceitarCookiesEsperado = "Aceitar cookies";
	private By btnAceitar = By.id("barra-cookie");
	public By getBtnAceitar() {
		return btnAceitar;
	}
	public String getBtnAceitarCookiesEsperado() {
		return btnAceitarCookiesEsperado;
	}
	public String getBarraCookieText() {
		String txt = driver.findElement(getBtnAceitar()).getText();
		return txt;	
	}
	
	//@When("^I click on it$")
	public Boolean getBtnAceitarBool() {
		return driver.findElement(getBtnAceitar()).isDisplayed();
	}
	public void btnAceitarClick() {
		driver.findElement(getBtnAceitar()).click();
	}
	//@Then("^the button hidden$")
	public Boolean getBtnAceitarhiddenBool() {
		return driver.findElement(getBtnAceitar()).isDisplayed();
	}
	//@Given("^I am in the main page$")
	private String titlePageEsperada = "Software de Medicina do Trabalho - SOC";
	public String getTitlePageEsperada() {
		return titlePageEsperada;
	}
	public String getTitleBuscaPage() {
		return driver.getTitle();
	}
	//@Given("^Solucoes e Recursos is visible$")
	private By solucoesRecursosMenu = By.cssSelector("#navegacao-superior .mostra-submenu");
	public By getSolucoesRecursosMenu() {
		return solucoesRecursosMenu;
	}
	public Boolean getSolucoesRecursosMenuBool() {
		return driver.findElement(getSolucoesRecursosMenu()).isDisplayed();
	}
	//@When("^I put the cursor on it$")
	private By popoverSubmenu = By.cssSelector(".popover-submenu");
	public By getPopoverSubmenu() {
		return popoverSubmenu;
	}
	public Boolean getPopoverSubmenuBool() {
		return driver.findElement(getPopoverSubmenu()).isDisplayed();
	}
	public void popoverSubmenuMoveTo() {
		WebElement elementMove = driver.findElement(getSolucoesRecursosMenu());
		Actions builder = new Actions(driver);
		builder.moveToElement(elementMove).perform();
	}
	private By mostraSubMenu = By.cssSelector("#navegacao-superior .mostra-submenu");
	public By getMostraSubMenu() {
		return mostraSubMenu;
	}

	public Boolean getMenuSolucoesAppearBool() {
		return driver.findElement(getMostraSubMenu()).isDisplayed(); 
	}
	
	//@When("^I click on FAP$")
	private By cssFAP = By.cssSelector("ul:nth-child(2) > li:nth-child(4) abbr");
	public By getCssFAP() {
		return cssFAP;
	}
	
	public String cssFAPText() {
		return driver.findElement(getCssFAP()).getText();
	}
	public void cssFAPClick() {
		driver.findElement(getCssFAP()).click();
	}
	private String textFAP = "FAP";
	
	//@Then("^I go to FAP page$")
	private String fapPageURL = "https://ww2.soc.com.br/fap/";
	public String getFapPageURL() {
		return fapPageURL;
	}	
	public String getCurrencyPageTextext() {
		return driver.getCurrentUrl();
	}
	public String getTextFAP() {
		return textFAP;
	}

	
}


