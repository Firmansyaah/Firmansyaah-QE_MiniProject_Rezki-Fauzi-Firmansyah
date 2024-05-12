package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteBook extends PageObject {
    @FindBy(xpath = "/html/body/div/div/table/tbody/tr[1]/td[5]/div/a[3]")
    private WebElement deleteBookButton;
    @FindBy(xpath = "/html/body/div/div/div[2]/button")
    private WebElement yesDeleteButton;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/div/div")
    private WebElement successMessage;

    @Step
    public boolean verifySuccessMessageDisplayed() {

        return successMessage.isDisplayed();
    }

    @Step
    public void clickDeleteBookButton() {
        deleteBookButton.click(); }

    public WebElementFacade $(WebElement deleteBookButton) {
        return null;
    }

    @Step
    public void clickYesDeleteButton() {
        yesDeleteButton.click(); }

}
