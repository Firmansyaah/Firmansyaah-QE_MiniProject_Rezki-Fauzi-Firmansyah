package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import starter.pages.BooksPage;
import starter.pages.EditBookPage;

public class EditBookPageSteps extends ScenarioSteps {

    BooksPage booksPage;
    EditBookPage editBookPage ;


    @When("I click the Edit button for a book")
    public void iClickTheEditButtonForABook() {
        editBookPage.clickEditButton();
    }

    @When("I input the details of the book to be edited")
    public void iInputTheBookDetailsAs() {
        editBookPage.inputBookDetails("Java for Beginning", "Tohn Tohir", "1990");
    }

    @When("I click the Edit Book button")
    public void iClickTheEditBookButton() {
        editBookPage.clickEditBookButton();
    }

    @Then("I see a success message Book edited successfully")
    public void iShouldSeeASuccessMessageIndicatingTheBookHasBeenEditedSuccessfully() {
        assert(editBookPage.isSuccessMessageDisplayed());
    }
    @When("I input invalid book details with 5-digit publish year")
    public void inputInvalidBookDetailsWith5DigitYear() {
        editBookPage.inputBookDetails("Java for Beginning", "Tohn Tohir", "19999");
    }

    @When("I input invalid book details with numeric author")
    public void inputInvalidBookDetailsWithNumericAuthor() {
        editBookPage.inputBookDetails("Java for Beginning", "123", "2022");
    }
    @When("I input empty book details")
    public void inputEmptyBookDetailsWithNumericAuthor() {
        editBookPage.clearBookDetails();
    }

    @Then("I see a failure message The book failed to be edited")
    public void verifyFailureMessageDisplayed() {
        editBookPage.verifyFailureMessageDisplayed();
    }
}
