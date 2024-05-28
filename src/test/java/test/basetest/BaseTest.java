package test.basetest;

import org.example.common.CommonAction;
import org.example.pages.homepage.loginpage.NeSdoLoginPage;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver = CommonAction.getDriver();
    protected NeSdoLoginPage loginPage = new NeSdoLoginPage(driver);
}
