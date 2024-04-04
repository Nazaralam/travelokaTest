package Eklipse.FE.Web.Buyer.PageObjects;


import Eklipse.FE.Web.Buyer.controllers.BuyerInitMethod;
import Eklipse.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class SignUpPage extends BuyerPageLoginInitializerBuyer {

    //Xpath
    @FindBy(id = "name")
    private  WebElement txtNewUsrname;
    @FindBy(id = "email")
    private  WebElement txtNewEmail;
    @FindBy(id = "password")
    private  WebElement txtNewPass;
    @FindBy(id = "password_confirmation")
    private WebElement txtNewPassConfirm;
    @FindBy(xpath = "//button[contains(text(),'Sign Up')]")
    private WebElement btnSignUp;


        String decryptData(String decrptData)
        {
            byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
            return(new String(decodeBytes));
        }

    //Step
    @Step("As a user Input new username")
    public SignUpPage InputNewUsrname() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(txtNewUsrname);
        sendKeys(txtNewUsrname,"testing Automation 2");
        return this;
    }

    @Step("As a user input new email")
    public SignUpPage inputNewEmail() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(txtNewEmail);
        sendKeys(txtNewEmail,"pustoragecompany6@gmail.com");
        return this;
    }
        @Step("As a user input new password")
            public SignUpPage inputNewPass() throws InterruptedException {
            Thread.sleep(1000);
            highlightElement(txtNewPass);
            sendKeys(txtNewPass,"123456789!");
            return this;
        }

        @Step("As a user re input new password")
        public SignUpPage inputNewPassConfirm(){
            highlightElement(txtNewPassConfirm);
            sendKeys(txtNewPassConfirm,"123456789!");
            return this;
        }

        @Step("As a user click sign up new user")
        public SignUpPage clickbtnSignUp(){
            highlightElement(btnSignUp);
            click(btnSignUp);
            return this;
        }

}
