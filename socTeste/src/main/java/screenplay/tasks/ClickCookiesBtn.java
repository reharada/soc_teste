package screenplay.tasks;

import static screenplay.pages.FAPPageElements.COOKIES_BTN;
import org.openqa.selenium.WebDriver;

import screenplay.models.Actor;
import screenplay.models.Task;

public class ClickCookiesBtn implements Task {
	
	String todoText;
	
    public ClickCookiesBtn(final String todoText) {
        this.todoText = todoText;
    }

    public static ClickCookiesBtn called(String todoText) {
        return null;
    }

	
	@Override
	public void perform(WebDriver driver, Actor actor) {
		driver.findElement(COOKIES_BTN).click();
	    logger.info(() -> actor.name() + " clicked on Cookies Button. ");
	    }

}
