package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.devtools.v122.fedcm.FedCm.openUrl;


public class DisplayBookListInDifferentViews extends PageObject {
    @Steps
    BooksPage booksPage;


    // Metode untuk mencari elemen web menggunakan XPath
    private WebElement findElement(String xpath) {
        return booksPage.getDriver().findElement(By.xpath(xpath));
    }

    @Step
    public boolean validateOnCardView() {
        WebElement cardViewElement = findElement("//*[@id=\"root\"]/div/div[3]");
        return cardViewElement.isDisplayed();
    }

    @Step
    public boolean validateOnListView() {
        WebElement listViewElement = findElement("/html/body/div/div/table/thead/tr/th[1]");
        return listViewElement.isDisplayed();
    }


}
