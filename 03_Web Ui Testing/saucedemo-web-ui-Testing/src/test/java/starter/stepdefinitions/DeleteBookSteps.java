package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.pages.DeleteBook;

public class DeleteBookSteps {

    @Steps
    DeleteBook deleteBook;

    @When("I click the Delete button for a book")
    public void clickDeleteBookButton() {
        deleteBook.clickDeleteBookButton();
    }
    @And("I confirm the deletion by clicking Yes")
    public void clickYesDeleteButton() {
        deleteBook.clickYesDeleteButton();
    }


    @Then("I see a success message Book deleted successfully")
    public boolean verifySuccessMessageDisplayed() {
       return deleteBook.verifySuccessMessageDisplayed(); }

}
