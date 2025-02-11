package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;


public class ReportFAPPage {
protected static WebDriver driver;
	
	public ReportFAPPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String empresa() {
		return driver.findElement(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(1)")).getAttribute("innerText");
	}
	
	public String massa() {
		return driver.findElement(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(2) > span")).getAttribute("innerText");
	}
	
	public String rat() {
		return driver.findElement(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(3) > span")).getAttribute("innerText");  
	}
	
	public String fap() {
		return driver.findElement(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(4) > span")).getAttribute("innerText");
	}
	
	
	

}
