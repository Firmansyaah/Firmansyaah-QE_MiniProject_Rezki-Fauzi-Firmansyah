package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import starter.pages.BooksPage;
public class booksPageSteps extends ScenarioSteps {
    BooksPage booksPage;

    @Given("I entered the Mini Bookstore website in my web browser")
    public void enteredMiniBookstoreWebsite() {
        booksPage.enteredMiniBookstoreWebsite();
    }

    @Then("I am successfully accesses the Mini Book Store brand page")
    public void validateOnBooksPage() {
        booksPage.validateOnBooksPage();
    }

    @Given("I am input the invalid Mini Book Store website")
    public void inputInvalidMiniBookStoreWebsite() {
        booksPage.inputInvalidMiniBookStoreWebsite();
    }

    @Then("I am receives an error or invalid page message")
    public void validateInvalidPageMessage() {
        booksPage.validateInvalidPageMessage();
    }
}
