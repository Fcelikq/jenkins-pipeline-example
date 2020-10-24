package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;


    @BeforeTest
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver","./chromeDriver/chromedriver.exe");
        driver = new ChromeDriver(chromeOptions());
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest()
    public void afterClass() {
        driver.quit(); }



    private ChromeOptions chromeOptions() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--test-type");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-translate");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-notifications");

        return chromeOptions;
    }

}
