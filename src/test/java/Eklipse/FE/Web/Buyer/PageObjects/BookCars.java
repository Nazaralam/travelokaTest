package Eklipse.FE.Web.Buyer.PageObjects;

import Eklipse.FE.Web.Buyer.utils.BuyerDateAndTime;
import Eklipse.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import com.github.javafaker.DateAndTime;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class BookCars extends BuyerPageLoginInitializerBuyer {


    //Homepage Rental Car
    @FindBy(xpath = "//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]")
    private  WebElement btnCarRental;
    @FindBy(xpath = "//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private  WebElement inputRentalLoc;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/h3")
    private  WebElement chooseRentalLoc;
    @FindBy(xpath = "//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
    private WebElement inputRentalStart; //+2 day
    @FindBy(xpath = "//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/input[1]")
    private WebElement inputRentalEnd; //+5 day
    @FindBy(xpath = "//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[1]/input[1]")
    private WebElement clickEndTime; // 11:00
    @FindBy(xpath = "//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[12]/div[1]")
    private WebElement inputEndTime; // 11:00
    @FindBy(xpath = "//div[contains(text(),'Done')]")
    private WebElement lblDone;
    @FindBy(xpath = "//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[11]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
    private  WebElement btnSearch;
    //

    //
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]")
    private  WebElement btnContinueChooseCar1stList;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[5]/div[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]")
    private  WebElement btnContinueChooseProvider2ndList;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[5]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]")
    private  WebElement btnContinueCar;

    //contact detail
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    private  WebElement inputFullName;
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
    private  WebElement inputNoHp;
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")
    private  WebElement inputEmail;

    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")
    private  WebElement TxtBoxTitle;
    @FindBy(xpath = "//option[contains(text(),'Mr.')]")
    private  WebElement lblMr;
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
    private  WebElement inputDriverName;
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
    private  WebElement inputTelpDriver;
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]")
    private  WebElement btnContinueStep2;


    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/div[1]/textarea[1]")
    private  WebElement txtBoxNotesRental;
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[11]/div[1]/div[1]/div[1]")
    private  WebElement lblRentalRequirment;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
    private  WebElement btnCheckAll;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]")
    private  WebElement btnSaveRequirements;
    @FindBy(xpath = "//body/div[@id='__next']/div[2]/div[2]/div[1]/div[14]/div[1]/div[1]/div[1]/div[1]")
    private  WebElement btnContinuePayments;



//    String decryptData(String decrptData)
//    {
//        byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
//        return(new String(decodeBytes));
//    }

//    @Step("As a user already input email")
//    public BookCars InputEmail() throws InterruptedException {
//        Thread.sleep(2000);
//        highlightElement(usrLogin);
//        usrLogin.sendKeys(decryptData(appConfig.getUsrEklipse()));
//        return this;
//    }
//
//    @Step("As a user already input password")
//    public BookCars InputPassword(){
//        highlightElement(pswdLogin);
//        pswdLogin.sendKeys(decryptData(appConfig.getPasswordAccount()));
//        return this;
//    }


    @Step("As a user click Car Rental button on navbar")
    public BookCars btnCLickCarRental() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(btnCarRental);
        btnCarRental.click();
        return this;
    }

    @Step("As a user input the location for rental the car")
    public BookCars inputLocationRental() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(inputRentalLoc);
        Thread.sleep(2000);
        sendKeys(inputRentalLoc,"cinere mall");
        click(chooseRentalLoc);
        Thread.sleep(5000);
        return this;
    }

    @Step("As a user choose the day started for rental +2 from today")
    public BookCars inputDateStartRent() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(inputRentalStart);
        sendKeys(inputRentalStart, BuyerDateAndTime.getFutureDate1(2));
        return this;
    }

    @Step("As a user choose the day end for rental +5 from today")
    public BookCars inputDateEndRent() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(inputRentalEnd);
        sendKeys(inputRentalEnd, BuyerDateAndTime.getFutureDate1(5));
        return this;
    }

    @Step("As a user choose the time end for rental at 11PM")
    public BookCars inputTimeEndRent() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(clickEndTime);
        click(clickEndTime);
        scrollToCenter(inputEndTime);
        highlightElement(inputEndTime);
        click(inputEndTime);
        click(lblDone);
        return this;
    }

    @Step("As a user click search button")
    public BookCars btnClickSearch() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(btnSearch);
        click(btnSearch);
        return this;
    }

    @Step("As a user choose the car and click continue")
    public BookCars btnContinueChooseCar1stList() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(btnContinueChooseCar1stList);
        click(btnContinueChooseCar1stList);
        return this;
    }

    @Step("As a user choose the rental provider and click continue")
    public BookCars btnContinueChooseProvider2ndList() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(btnContinueChooseProvider2ndList);
        click(btnContinueChooseProvider2ndList);
        return this;
    }

    @Step("As a user click continue")
    public BookCars btnContinueCar() throws InterruptedException {
        Thread.sleep(2000);
        scrollToCenter(btnContinueCar);
        highlightElement(btnContinueCar);
        click(btnContinueCar);
        return this;
    }

    @Step("As a user input biodata")
    public BookCars inputBiodata() throws InterruptedException {
        Thread.sleep(2000);
        scrollToCenter(inputFullName);
        highlightElement(inputFullName);
        sendKeys(inputFullName,"Testing automation");
        highlightElement(inputNoHp);
        sendKeys(inputNoHp,"0815771543");
        highlightElement(inputEmail);
        sendKeys(inputEmail,"testing1@mail.com");
        return this;
    }

    @Step("As a user input driver detail")
    public BookCars inputDriverDetail() throws InterruptedException {
        Thread.sleep(2000);
        scrollToCenter(TxtBoxTitle);
        highlightElement(TxtBoxTitle);
        click(TxtBoxTitle);
        highlightElement(lblMr);
        click(lblMr);
        highlightElement(inputDriverName);
        sendKeys(inputDriverName,"automation Testing");
        highlightElement(inputTelpDriver);
        sendKeys(inputTelpDriver,"08157715411");
        click(btnContinueStep2);
        return this;
    }

    @Step("As a user add notes detail")
    public BookCars inputNotes() throws InterruptedException {
        Thread.sleep(2000);
        scrollToCenter(txtBoxNotesRental);
        highlightElement(txtBoxNotesRental);
        sendKeys(txtBoxNotesRental,"testing automation sedang berjalan dengan menggunakan bahasa java selenium");
        return this;
    }

    @Step("As a user check the requirements")
    public BookCars lblRequirments() throws InterruptedException {
        Thread.sleep(2000);
        scrollToCenter(lblRentalRequirment);
        highlightElement(lblRentalRequirment);
        click(lblRentalRequirment);
        Thread.sleep(2000);
        highlightElement(btnCheckAll);
        click(btnCheckAll);
        highlightElement(btnSaveRequirements);
        click(btnSaveRequirements);
        return this;
    }

    @Step("As a user click button continue payments for next process")
    public BookCars btnNextPaymentProcess() throws InterruptedException {
        Thread.sleep(2000);
        scrollToCenter(btnContinuePayments);
        highlightElement(lblRentalRequirment);
        click(btnContinuePayments);
        Thread.sleep(5000);
        return this;
    }

}
