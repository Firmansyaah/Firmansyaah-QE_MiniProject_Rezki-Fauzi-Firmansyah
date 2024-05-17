package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BooksPage extends PageObject {

    private By title() {
        return By.xpath("/html/body/div/div/div[2]/h1");
    }

    static By cardButton() {
        return By.xpath("/html/body/div/div/div[1]/button[2]");
    }

    static By tableButton() {
        return By.xpath("/html/body/div/div/div[1]/button[1]");
    }

    By createButton() {
        return By.xpath("/html/body/div/div/div[2]/a/svg");
    }

    private String validUrl() {
        return "https://mini-book-store-fe.vercel.app/";
    }

    private String invalidUrl() {
        return "https://mini-book-store-fe.vercel.app/invalid/";
    }

    private By invalidPage() {
        return By.xpath("/html/body/div/main/p/span[1]");
    }

    private By cardDetails() {
        return By.xpath("/html/body/div/div/div[3]/div[1]/div[3]/a[1]");
    }

    private By listDetails() {
        return By.xpath("/html/body/div/div/table/tbody/tr[1]/td[5]/div/a[1]");
    }

    @Step
    public boolean enteredMiniBookstoreWebsite() {
        openUrl(validUrl());
        return $(title()).isDisplayed(); // Return true if the title is displayed
    }

    @Step
    public boolean validateOnBooksPage() {
        return $(title()).isDisplayed();
    }

    @Step
    public boolean inputInvalidMiniBookStoreWebsite() {
        openUrl(invalidUrl());
        return $(invalidPage()).isDisplayed(); // Return true if the invalid page message is displayed
    }

    @Step
    public boolean validateInvalidPageMessage() {
        return $(invalidPage()).isDisplayed();
    }

    @Step
    public void clickOnTheCardButtonInTheWebsiteHeader() {
        $(cardButton()).click();
    }

    @Step
    public void clickOnTheTableButtonInTheWebsiteHeader() {
        $(tableButton()).click();
    }

    @Step
    public void clickOperationButtonInListDetails() {
        $(listDetails()).click();
    }

    @Step
    public void clickOperationButtonInCardDetails() {
        $(cardDetails()).click();
    }
}
