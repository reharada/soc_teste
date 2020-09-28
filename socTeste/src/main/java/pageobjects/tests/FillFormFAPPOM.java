package pageobjects.tests;

import static org.junit.Assert.assertEquals;                                                                                                                                      
                                                                                                                                                                                  
import java.io.IOException;                                                                                                                                                       
import java.util.concurrent.TimeUnit;                                                                                                                                             
                                                                                                                                                                                  
                                                                                                                                                   
import org.openqa.selenium.WebDriver;                                                                                                                                                                                                                                                                                         
import org.openqa.selenium.chrome.ChromeDriver;                                                                                                                                   
                                                                                                                                                                                  
import cucumber.api.java.After;                                                                                                                                                   
import cucumber.api.java.Before;                                                                                                                                                  
import cucumber.api.java.en.Given;                                                                                                                                                
import cucumber.api.java.en.Then;                                                                                                                                                 
import cucumber.api.java.en.When;
import pageobjects.pages.FillFormFAPPage;
import pageobjects.pages.ReportFAPPage;


public class FillFormFAPPOM {
	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	public static WebDriver driver = null;                                                                                                                                        
	String urlFAP = "http://ww2.soc.com.br/fap/";
	FillFormFAPPage fillForm;
	ReportFAPPage report;
                                                                                                                                                                                  
	@Before("@scenarioFindFAP")                                                                                                                                                  
	public void initializeFAP() throws IOException {                                                                                                                              
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chrome\\85\\chromedriver.exe");                                                           
		driver = new ChromeDriver();                                                                                                                                              
		driver.manage().window().maximize();                                                                                                                                      
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);                                                                                                  
		driver.get(urlFAP);  
		this.fillForm = new FillFormFAPPage(this.driver);
		this.report = new ReportFAPPage(this.driver);
	}                                                                                                                                                                             
                                                                                                                                                                                  
	@After                                                                                                                                                                        
	public void terminateFAP() {                                                                                                                                                  
		driver.quit();                                                                                                                                                            
	}                                                                                                                                                                             
                                                                                                                                                                                  
	@Given("^I am FAP Page$")                                                                                                                                                     
	public void i_am_FAP_Page() {                                                                                                                                                 		                                                                                          
		assertEquals(fillForm.getTitleEsperado(), fillForm.getTitleFAPPage());
		System.out.println("Step 1 - Visit FAP page");                                                                                                                            		                                                                                                                                                                          	                                                                                                                                                                                                                                                                                                                                                                                                                                            
	}                
	
	@Given("^I accepted FAP cookies$")
	public void i_accepted_FAP_cookies() {
		assertEquals(fillForm.getBtnAceitarBool(), true);
		fillForm.btnAceitarClick();
	}
                                                                                                                                                                                  
	@Given("^I fill the getCalc$")                                                                                                                                                
	public void i_fill_the_getCalc() {                                                                                                                                                                                                                                                                  
	
		fillForm.fillEmpresaField("Empresa");
		fillForm.fillFapField("10");
		fillForm.selectedRapField();
		fillForm.fillProjecaoField("3");
	}                                                                                                                                                                             
                                                                                                                                                                                  
	@When("^I click to Estimar$")                                                                                                                                               
	public void i_click_to_Estimar() {                                                                                                                                                                                                                                                                                                                                                            
		assertEquals(fillForm.btnEstimarValue(), "Estimar FAP");
		fillForm.btnEstimarClick();
		System.out.println("Setp 2 - " + "Estimar FAP");                                                                                                                                                                        
	}                                                                                                                                                                             
                                                                                                                                                                                  
	@Then("^I see the report$") 
	
	public void i_see_the_report() throws Throwable {                                                                                                                                                                                                                                                                              
		assertEquals(report.empresa(),"Empresa");
		assertEquals(report.massa(),"3");
		assertEquals(report.rat(),"2");
		assertEquals(report.fap(),"10");
	}                                                                                                                                                                             
                                                                                                                                                                                  
}                                                                                                                                                                                 
                                                                                                                                                                                  