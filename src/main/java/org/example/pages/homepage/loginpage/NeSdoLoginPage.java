package org.example.pages.homepage.loginpage;

import org.example.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeSdoLoginPage extends BasePage {

    public NeSdoLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@name='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button")
    private WebElement loginButton;

    public NeSdoLoginPage enterCredentials(){
        username.sendKeys("21010056");
        password.sendKeys("qweasdzxc");
        return this;
    }

    public NeSdoLoginPage clickLoginButton(){
        loginButton.click();
        return this;
    }



}

