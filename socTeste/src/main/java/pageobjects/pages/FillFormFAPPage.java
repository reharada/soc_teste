package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FillFormFAPPage {
protected static WebDriver driver;
	
	public FillFormFAPPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//@Given("^I am FAP Page$") 
	private String titleEsperado = "FAP - SOC - Software Integrado de Gestão Ocupacional";

	public String getTitleEsperado() {
		return titleEsperado;
	}
	public String getTitleFAPPage() {
		return driver.getTitle();
	}

	//@Given("^I accepted FAP cookies$")
	private By btnAceitar = By.id("barra-cookie");

	public By getBtnAceitar() {
		return btnAceitar;
	}
	public Boolean getBtnAceitarBool() {
		return driver.findElement(getBtnAceitar()).isDisplayed();
	}
	
	public void btnAceitarClick() {
		driver.findElement(getBtnAceitar()).click();
	}
	
	//@Given("^I fill the getCalc$") 
	private By empresaField = By.id("nomeEmpresa");
	private By fapField = By.id("fap");
	private By rapField = By.cssSelector("#frmcalculadora > div.col-sm-12 > div:nth-child(3) > span > div > div.selectric > b");
	private By rap_3 = By.cssSelector("#frmcalculadora > div.col-sm-12 > div:nth-child(3) > span > div > div.selectric-items > div > ul > li:nth-child(3)");
	private By projecaoField = By.id("projecao");
	public By getEmpresaField() {
		return empresaField;
	}
	public By getFapField() {
		return fapField;
	}
	public By getRapField() {
		return rapField;
	}
	public By getRap_3() {
		return rap_3;
	}
	public By getProjecaoField() {
		return projecaoField;
	}
	
	public void fillEmpresaField(String txt) {
		driver.findElement(getEmpresaField()).sendKeys(txt);
	}
	
	public void fillFapField(String txt) {
		driver.findElement(getFapField()).sendKeys(txt);
	}
	
	public void selectedRapField() {
		driver.findElement(getRapField()).click();
		driver.findElement(getRap_3()).click();
	}
	
	public void fillProjecaoField(String txt) {
		driver.findElement(getProjecaoField()).sendKeys(txt);
	}
	
	//@When("^I click to Estimar$")
	private By btnEstimar = By.id("estimar");
	public WebElement btnEstimarEl() {
		return driver.findElement(btnEstimar);
	}
	
	public void btnEstimarClick() {
		btnEstimarEl().click();
	}
	public String btnEstimarValue() {
		return btnEstimarEl().getAttribute("value");
	}
	

}
