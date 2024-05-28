package smoke;

import org.example.common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.basetest.BaseTest;

public class FirstTest extends BaseTest {


    @Test
    public void firstTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void secondTest() {
        WebDriver driver = CommonAction.getDriver();
        driver.get("http://localhost:8080");
    }


    @Test
    public void newSdoTest() {
        loginPage.open("https://newsdo.vsu.by/login/index.php");

        loginPage.enterCredentials()
                .clickLoginButton();

    }




}
