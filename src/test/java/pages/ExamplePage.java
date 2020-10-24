package pages;

import org.openqa.selenium.WebDriver;

import utilities.PageBase;


public class ExamplePage extends PageBase {
    public ExamplePage(WebDriver driver) {
        super(driver);
    }

    public void caseExample(){
        System.out.println("hello");
    }

}
