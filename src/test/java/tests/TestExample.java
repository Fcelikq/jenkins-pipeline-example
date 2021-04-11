package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestExample {

    static WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com");
    }


    @AfterClass()
    public void AfterClass() {
        driver.quit();
    }

    @Test
    public void test1(){
        driver.findElement(By.name("q")).sendKeys("jenkins");
        driver.findElement(By.name("btnK")).click();
    }

}


