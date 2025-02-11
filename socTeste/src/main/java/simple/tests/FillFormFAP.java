//package simple.tests;
//
//
//import static org.junit.Assert.assertEquals;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class FillFormFAP {
//
//	public static WebDriver driver = null;
//	String urlFAP = "http://ww2.soc.com.br/fap/";
//
//	@Before
//	public void initializeFAP() throws IOException {
//		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chrome\\85\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
//		driver.get(urlFAP);
//	}
//
//	@After
//	public void terminateFAP() {
//		driver.quit();
//	}
//
//	@Given("^I am FAP Page$")
//	public void i_am_FAP_Page() {
//		String paginaFAP = driver.getTitle();
//		assertEquals("FAP - SOC - Software Integrado de Gestão Ocupacional", paginaFAP);
//		System.out.println("Step 1 - Visit FAP page");
//		
//		Boolean btnAceitar = driver.findElement(By.id("barra-cookie")).isDisplayed();
//		assertEquals(btnAceitar, true);
//		driver.findElement(By.id("barra-cookie")).click();
//
//	}
//
//	@Given("^I fill the getCalc$")
//	public void i_fill_the_getCalc() {
//		driver.findElement(By.id("nomeEmpresa")).sendKeys("Empresa");
//		driver.findElement(By.id("fap")).sendKeys("10");
//		driver.findElement(By.cssSelector("#frmcalculadora > div.col-sm-12 > div:nth-child(3) > span > div > div.selectric > b")).click();
//		driver.findElement(By.cssSelector("#frmcalculadora > div.col-sm-12 > div:nth-child(3) > span > div > div.selectric-items > div > ul > li:nth-child(3)")).click();
//		driver.findElement(By.id("projecao")).sendKeys("3");
//	}
//
//	@When("^I click to Estimular$")
//	public void i_click_to_Estimular() {
//		WebElement btnEstimar = driver.findElement(By.id("estimar"));
//		assertEquals(btnEstimar.getAttribute("value"), "Estimar FAP");
//		System.out.println("Setp 2 - " + btnEstimar.getAttribute("value"));
//		driver.findElement(By.id("estimar")).click();
//
//	}
//
//	@Then("^I see the report$")
//	public void i_see_the_report() throws Throwable {
//		String empresa = driver.findElement(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(1)")).getAttribute("innerText");
//		assertEquals(empresa, "Empresa");
//		
//		String massa = driver.findElement(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(2) > span")).getAttribute("innerText");
//		assertEquals(massa, "3");
//		
//		
//		String rat = driver.findElement(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(3) > span")).getAttribute("innerText");
//		assertEquals(rat, "2");
//		
//		String fap = driver.findElement(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(4) > span")).getAttribute("innerText");
//		assertEquals(fap, "10");
//
//	}
//
//}
