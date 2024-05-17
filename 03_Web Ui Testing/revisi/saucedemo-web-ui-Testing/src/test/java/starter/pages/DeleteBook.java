package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;

public class DeleteBook extends PageObject {
    @FindBy(xpath = "/html/body/div/div/table/tbody/tr[1]/td[5]/div/a[3]")
    private WebElementFacade deleteBookButton;
    @FindBy(xpath = "/html/body/div/div/div[2]/button")
    private WebElementFacade yesDeleteButton;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/div/div")
    private WebElementFacade successMessage;

    public boolean verifySuccessMessageDisplayed() {
        return successMessage.isVisible();
    }

    public void clickDeleteBookButton() {
        deleteBookButton.click();
    }

    public void clickYesDeleteButton() {
        yesDeleteButton.click();
    }
}
