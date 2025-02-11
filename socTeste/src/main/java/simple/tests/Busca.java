package simple.tests;
/*
 * package pageObjects;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * import java.io.IOException; import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * import cucumber.api.java.After; import cucumber.api.java.Before; import
 * cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When; import pageObjectsPage.BuscaPage; import
 * pageObjectsPage.HomePage;
 * 
 * public class Busca {
 * 
 * HomePage homePage; BuscaPage buscaPage;
 * 
 * 
 * public static WebDriver driver = null; String url = "http://ww2.soc.com.br/";
 * 
 * @Before public void initialize() throws IOException {
 * System.setProperty("webdriver.chrome.driver",
 * ".\\src\\test\\resources\\driver\\chrome\\85\\chromedriver.exe"); driver =
 * new ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
 * driver.get(url); }
 * 
 * @After public void terminate() {
 * 
 * driver.quit(); }
 * 
 * @Given("^I see the aceitar cookies button$") public void
 * i_see_the_aceitar_cookies_button() { String btnAceitarCookiesEsperado =
 * "Aceitar cookies"; String btnAceitarCookies =
 * driver.findElement(By.id("barra-cookie")).getText();
 * assertEquals(btnAceitarCookiesEsperado, btnAceitarCookies);
 * //assertEquals(buscaPage.getBtnAceitarCookiesEsperado(),
 * homePage.getBarraCookieText()); }
 * 
 * @When("^I click on it$") public void i_click_on_it() { Boolean btnAceitar =
 * driver.findElement(By.id("barra-cookie")).isDisplayed();
 * assertEquals(btnAceitar, true);
 * driver.findElement(By.id("barra-cookie")).click(); }
 * 
 * @Then("^the button hidden$") public void the_button_hidden() { Boolean
 * btnAceitarhidden = driver.findElement(By.id("barra-cookie")).isDisplayed();
 * assertEquals(btnAceitarhidden, false); }
 * 
 * @Given("^I am in the main page$") public void i_am_in_the_main_page() {
 * String paginaInicial = driver.getTitle();
 * assertEquals("Software de Medicina do Trabalho - SOC", paginaInicial);
 * System.out.println("Step 1 - Visit SOC's page");
 * 
 * }
 * 
 * @Given("^Solucoes e Recursos is visible$") public void
 * solucoes_e_Recursos_is_visible() { Boolean txtSolucoes =
 * driver.findElement(By.cssSelector("#navegacao-superior .mostra-submenu")).
 * isDisplayed(); assertEquals(txtSolucoes, true);
 * System.out.println("Step 2 - Solucoes is visible"); }
 * 
 * @When("^I put the cursor on it$") public void i_put_the_cursor_on_it() {
 * Boolean menuSolucoes =
 * driver.findElement(By.cssSelector(".popover-submenu")).isDisplayed();
 * assertEquals(menuSolucoes, false); //System.out.println(menuSolucoes +
 * "eh falso"); WebElement element =
 * driver.findElement(By.cssSelector("#navegacao-superior .mostra-submenu"));
 * Actions builder = new Actions(driver);
 * builder.moveToElement(element).perform(); Boolean menuSolucoesAppear =
 * driver.findElement(By.cssSelector(".popover-submenu")).isDisplayed();
 * assertEquals(menuSolucoesAppear, true); //System.out.println(menuSolucoes +
 * "eh true"); }
 * 
 * @When("^I click on FAP$") public void i_click_on_FAP() { WebElement btnFAP =
 * driver.findElement(By.cssSelector("ul:nth-child(2) > li:nth-child(4) abbr"));
 * assertEquals(btnFAP.getText(),"FAP"); //System.out.println(btnFAP.getText() +
 * " eh FAP"); btnFAP.click(); }
 * 
 * @Then("^I go to FAP page$") public void i_go_to_FAP_page() { String
 * redirectFAP = driver.getCurrentUrl();
 * assertEquals(redirectFAP,"https://ww2.soc.com.br/fap/"); }
 * 
 * @Given("^I want to go to another pages socnet$") public void
 * i_want_to_go_to_another_pages_socnet() { // Write code here that turns the
 * phrase above into concrete actions
 * 
 * }
 * 
 * @When("^I click on the link in page$") public void
 * i_click_on_the_link_in_page() { // Write code here that turns the phrase
 * above into concrete actions
 * 
 * }
 * 
 * @Then("^I verify the url changed$") public void i_verify_the_url_changed() {
 * // Write code here that turns the phrase above into concrete actions
 * 
 * }
 * 
 * @Given("^I want to go to another pages esocial$") public void
 * i_want_to_go_to_another_pages_esocial() { // Write code here that turns the
 * phrase above into concrete actions
 * 
 * }
 * 
 * }
 */