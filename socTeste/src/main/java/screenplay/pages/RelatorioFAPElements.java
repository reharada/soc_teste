package screenplay.pages;

import org.openqa.selenium.By;

public enum RelatorioFAPElements {
	NOMEDAEMPRESA_FORM(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(1)")),
	FAP_FORM(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(4) > span")),
	RAT_FORM(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(3) > span")),
	MASSA_FOM(By.cssSelector("#page > section > div > article:nth-child(2) > table > tbody > tr > td:nth-child(2) > span"));
    private By locator = null;

    RelatorioFAPElements(By locator) {
        this.locator = locator;
    }

    public By locator() {
        return locator;
    }
}
