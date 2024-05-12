package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import starter.pages.BooksPage;
import starter.pages.DisplayBookDetails;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DisplayBookDetailsSteps extends ScenarioSteps {
    @Steps
    BooksPage  booksPage;
    @Steps
    DisplayBookDetails  displayBookDetails;

    @When("I click on the I button in the Operations column for a book in list view")
    public void clickOperationButtonInColumnForBookInListView() {
        booksPage.clickOperationButtonInListDetails();
    }

    @When("I click on the I button in the Operations column for a book in card view")
    public void clickOperationButtonInColumnForBookInCardView() {
        booksPage.clickOperationButtonInCardDetails();
    }

    @Then("I see the details of the book displayed")
    public void validateBookDetailsDisplayed() {
        displayBookDetails.validatedetailsBooks();
    }

}
