package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PageBase {

    protected WebDriver driver;
    WebDriverWait wait;


    public PageBase(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,60);
    }

        //Find metot
        protected WebElement findElementById(String id) {
        return driver.findElement(By.id(id));
        }
        //click methot
         protected void clickElementById(String id)  {
            findElementById(id).click();
        }
    //fill methot
    protected void fillInputFieldById(String id, String charSequence) {
        findElementById(id).sendKeys(charSequence);
    }

}
