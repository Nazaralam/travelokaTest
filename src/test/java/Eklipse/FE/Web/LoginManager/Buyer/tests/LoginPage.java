package Eklipse.FE.Web.LoginManager.Buyer.tests;

import Eklipse.FE.Web.Buyer.controllers.BuyerBrowserFactory;
import Eklipse.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage extends BuyerPageLoginInitializerBuyer {





    @Description("Login Traveloka")
    @Test
    public void login_Web()throws Exception{
        Homepage().
                btnSignInHomepage();
        LoginTraveloka().
                InputEmail()
                .InputPassword()
                .btnLoginAcc();
    }



}
