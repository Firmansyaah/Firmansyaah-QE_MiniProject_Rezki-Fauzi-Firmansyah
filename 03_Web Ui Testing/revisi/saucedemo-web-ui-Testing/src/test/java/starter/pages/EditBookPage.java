package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class EditBookPage extends PageObject {

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/input")
    private WebElement titleInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/input")
    private WebElement authorInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[3]/input")
    private WebElement publishYearInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/button")
    private WebElement editBookButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div")
    private WebElement successMessage;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/div/div")
    private WebElement unsuccessMessage;

    @FindBy(xpath = "/html/body/div/div/table/tbody/tr[1]/td[5]/div/a[2]")
    private WebElement editButton;

    public void clickEditButton() {
        editButton.click();
    }

    public void inputBookDetails(String title, String author, String publishYear) {
        titleInput.clear();
        titleInput.sendKeys(title);
        authorInput.clear();
        authorInput.sendKeys(author);
        publishYearInput.clear();
        publishYearInput.sendKeys(publishYear);
    }
    public void clearBookDetails() {
        titleInput.clear();
        authorInput.clear();
        publishYearInput.clear();
    }

    public void clickEditBookButton() {
        editBookButton.click();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }
    public boolean isFailureMessageDisplayed() {
        return unsuccessMessage.isDisplayed();
    }
}
