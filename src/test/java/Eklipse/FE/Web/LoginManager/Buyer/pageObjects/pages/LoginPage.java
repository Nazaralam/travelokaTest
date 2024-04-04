package Eklipse.FE.Web.LoginManager.Buyer.pageObjects.pages;

import Eklipse.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class LoginPage extends BuyerPageLoginInitializerBuyer {


    @FindBy(id = "username")
    private  WebElement usrLogin;
    @FindBy(id = "password")
    private  WebElement pswdLogin;
    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
    private WebElement btnLogin;
    //Sign Up
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    private WebElement btnSignUp;

    String decryptData(String decrptData)
    {
        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
        return(new String(decodeBytes));
    }



    @Step("As a user already input email")
    public LoginPage InputEmail() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(usrLogin);
        usrLogin.sendKeys(decryptData(appConfig.getUsrEklipse()));
        return this;
    }

    @Step("As a user already input password")
    public LoginPage InputPassword(){
        highlightElement(pswdLogin);
        pswdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
        return this;
    }

    @Step("As a user click button submit")
    public LoginPage btnLogin() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(btnLogin);
        btnLogin.click();
        return this;
    }

    @Step("As a user click button submit")
    public LoginPage btnLoginAcc() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(btnLogin);
        btnLogin.click();
        Thread.sleep(5000);
        return this;
    }

    @Step("As a user click button Sign Up if user does not have account yet")
    public LoginPage btnSignUp() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(btnSignUp);
        btnSignUp.click();
        return this;
    }
}
