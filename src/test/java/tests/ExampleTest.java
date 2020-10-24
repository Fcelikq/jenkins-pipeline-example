package tests;

import org.testng.annotations.*;
import pages.ExamplePage;
import utilities.TestBase;

public class ExampleTest extends TestBase {



    @Test
    public void TestExample()  {
        ExamplePage examplePage = new ExamplePage(driver);
        examplePage.caseExample();
    }

}
