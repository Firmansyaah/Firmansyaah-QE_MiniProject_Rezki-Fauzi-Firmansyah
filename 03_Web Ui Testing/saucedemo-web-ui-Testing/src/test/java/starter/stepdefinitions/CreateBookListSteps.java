package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import starter.pages.CreateBookList;

public class CreateBookListSteps extends ScenarioSteps {

    @Steps
    CreateBookList createBookPage;

    @When("I click Add Book button")
    public void clickAddBookButton() {
        createBookPage.clickAddBookButton();
    }

    @And("I input the details of the book to be added")
    public void inputBookDetails() {
        createBookPage.inputBookDetails("Java for Beginning", "Tohn Tohir", "19999");
    }


    @And("I click the save book button")
    public void clickCreateBookButton() {
        createBookPage.clicksaveBookButton();
    }

    @Then("I see a success message Book added successfully")
    public boolean isSuccessMessageDisplayed() {
        return createBookPage.isSuccessMessageDisplayed();
    }
    @Then("I see a failure message The book failed to be added")
    public void verifyFailureMessageDisplayed() {
        createBookPage.verifyFailureMessageDisplayed();
    }
}
