package screenplay.models;

import org.openqa.selenium.WebDriver;

import io.restassured.response.Response;

public class Actor {

    private String name;
    private WebDriver driver;
    private Response response;

    public Actor(String called, WebDriver driver) {
        name = called;
        this.driver = driver;
    }

    public String name() {
        return name;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(final Response response) {
        this.response = response;
    }

    public void setDriver(final WebDriver driver) {
        this.driver = driver;
    }

    public void wasAbleTo(Task task) {
        perform(task);
    }

    public void attemptsTo(Task task) {
        perform(task);
    }

    public void shouldSeeThat(Question question) {
        ask(question);
    }

    public void closesTheBrowser() {
        driver.quit();
    }


    private void ask(Question question) {
        question.ask(driver, this);
    }

    private void perform(Task task) {
        task.perform(driver, this);
    }

}
