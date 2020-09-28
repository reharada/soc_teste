package screenplay.questions;

import screenplay.models.Actor;
import screenplay.models.Question;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

public class TheTitlePage implements Question {

	static WebDriver driver;
	String expectedName ="FAP - SOC - Software Integrado de Gestão Ocupacional" ;
	
	public TheTitlePage(String expectedName) {
		this.expectedName = expectedName;
	}
	
	public static String WhatPageNameIs(WebDriver driver2) {
		return driver2.getTitle();
	}
	
	@Override
	public void ask(final WebDriver driver, final Actor actor) {
		this.driver = driver;
		String whatPageNameIs = this.WhatPageNameIs(driver);
		assertEquals(expectedName, equalTo(whatPageNameIs));
		logger.info(() -> actor.name() + " the Page Name expected is " + whatPageNameIs);
	}

}
