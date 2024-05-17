package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.jupiter.api.Assertions;
import starter.pages.BooksPage;

public class BooksPageSteps extends ScenarioSteps {

    BooksPage booksPage;

    @Given("I entered the Mini Bookstore website in my web browser")
    public void enteredMiniBookstoreWebsite() {
        Assertions.assertTrue(booksPage.enteredMiniBookstoreWebsite(), "Failed to enter the Mini Bookstore website");
    }

    @Then("I am successfully accesses the Mini Book Store brand page")
    public void validateOnBooksPage() {
        Assertions.assertTrue(booksPage.validateOnBooksPage(), "Failed to access the Mini Book Store brand page");
    }

    @Given("I am input the invalid Mini Book Store website")
    public void inputInvalidMiniBookStoreWebsite() {
        Assertions.assertTrue(booksPage.inputInvalidMiniBookStoreWebsite(), "Failed to input the invalid Mini Book Store website");
    }

    @Then("I am receives an error or invalid page message")
    public void validateInvalidPageMessage() {
        Assertions.assertTrue(booksPage.validateInvalidPageMessage(), "Error or invalid page message is not displayed");
    }
}
