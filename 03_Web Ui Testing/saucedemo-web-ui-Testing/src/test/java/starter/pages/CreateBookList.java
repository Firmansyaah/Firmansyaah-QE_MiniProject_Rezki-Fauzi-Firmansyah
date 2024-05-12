package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CreateBookList extends PageObject{
    @Steps
    BooksPage booksPage;

    @FindBy(xpath = "/html/body/div/div/div[2]/a")
    private WebElement createBookButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/input")
    private WebElement titleInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/input")
    private WebElement authorInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[3]/input")
    private WebElement publishYearInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/button")
    private WebElement saveBook;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div")
    private WebElement successMessage;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/div/div")
    private WebElement unsuccessMessage;


    public void inputBookDetails(String title, String author, String publishYear) {
        titleInput.clear();
        titleInput.sendKeys(title);
        authorInput.clear();
        authorInput.sendKeys(author);
        publishYearInput.sendKeys(publishYear);
        publishYearInput.clear();
    }

    public boolean isSuccessMessageDisplayed() {

        return successMessage.isDisplayed();
    }
    public boolean verifyFailureMessageDisplayed() {

        return unsuccessMessage.isDisplayed();
    }
    @Step
    public void clickAddBookButton() {
        $(createBookButton).click(); }
    @Step
    public void clicksaveBookButton() {
        $(saveBook).click(); }
}
