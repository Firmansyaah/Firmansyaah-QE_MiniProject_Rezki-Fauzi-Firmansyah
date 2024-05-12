package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import starter.pages.BooksPage;
import starter.pages.DisplayBookListInDifferentViews;

public class DisplayBookListInDifferentViewsSteps extends ScenarioSteps {

   @Steps
   BooksPage booksPage;
    @Steps
    DisplayBookListInDifferentViews displayBookListInDifferentViews;


    @Given("I open the homepage")
    public void openHomePage(){
        booksPage.enteredMiniBookstoreWebsite();
    }

    @When("I click on the Card button in the website header")
    public void clickOnTheCardButtonInTheWebsite(){
        booksPage.clickOnTheCardButtonInTheWebsiteHeader();
    }
    @When("I click on the Table button in the website header")
    public void clickOnTheTableButtonInTheWebsite(){
        booksPage.clickOnTheTableButtonInTheWebsiteHeader();
    }
    @Then("I see the book list displayed in table format arranged vertically downwards")
    public void bookListDisplayedInTable(){
        displayBookListInDifferentViews.validateOnListView();
    }
    @Then("I see the book list displayed in card format arranged in a 4x4 grid on a single page")
    public void bookListDisplayedInCard(){
        displayBookListInDifferentViews.validateOnCardView();
    }




}
