package Eklipse.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects;

import Eklipse.FE.Web.Buyer.PageObjects.*;
import Eklipse.FE.Web.LoginManager.Buyer.pageObjects.pages.LoginPage;
import Eklipse.FE.Web.Buyer.controllers.BuyerBaseMethod;
import org.openqa.selenium.support.PageFactory;

public class BuyerPageLoginInitializerBuyer extends BuyerBaseMethod {



    //login
    public LoginPage LoginTraveloka() {

        return PageFactory.initElements(getWebDriver(), LoginPage.class);
    }
    public SignUpPage SignUpAccount() {

        return PageFactory.initElements(getWebDriver(), SignUpPage.class);
    }
    public Homepage Homepage() {

        return PageFactory.initElements(getWebDriver(), Homepage.class);
    }

    public BookCars BookCarsTrave() {

        return PageFactory.initElements(getWebDriver(), BookCars.class);
    }

    //================END===============//
}

