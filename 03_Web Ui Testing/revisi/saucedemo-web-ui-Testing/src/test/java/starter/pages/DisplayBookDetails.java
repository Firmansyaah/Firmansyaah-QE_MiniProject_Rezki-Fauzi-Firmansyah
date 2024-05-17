package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class DisplayBookDetails extends PageObject {

    @FindBy(xpath = "/html/body/div/div/h1")
    private WebElement titleDetails;

    @Step
    public boolean validatedetailsBooks(){
       return titleDetails.isDisplayed();
    }



}
