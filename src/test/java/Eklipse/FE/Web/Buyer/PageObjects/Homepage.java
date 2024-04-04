package Eklipse.FE.Web.Buyer.PageObjects;


import Eklipse.FE.Web.Buyer.controllers.BuyerInitMethod;
import Eklipse.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class Homepage extends BuyerPageLoginInitializerBuyer {

    //Xpath
    @FindBy(xpath = "//div[3]/a[contains(text(),'Sign In')]")
    private  WebElement btnSignIn;
    @FindBy(xpath = "//div[3]/a[2][contains(text(),'Sign Up For Free')]")
    private  WebElement btnSignUp;


    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    private WebElement inputClipURL;
    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[1]/button[1]")
    private WebElement btnConvertClip;
    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/button[1]")
    private WebElement btnUploadFile;
    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/button[2]")
    private WebElement btnSearchTwitch;


    //Homepage after login
    @FindBy(xpath = "//button[contains(text(),'Skip for now')]")
    private WebElement btnSkipForNow;

    //Icon
    @FindBy(xpath = "//span[contains(text(),'Home')]")
    private WebElement iconHome;
    @FindBy(xpath = "//span[contains(text(),'Stream/Video')]")
    private WebElement iconStream;
    @FindBy(xpath = "//span[contains(text(),'Edited Clips')]")
    private WebElement iconTikTokClip;

    @FindBy(xpath = "//header/div[1]/div[1]/ul[4]/li[1]/a[1]/i[1]")
    private WebElement iconProfile;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/header[1]/div[1]/div[1]/ul[4]/li[1]/div[1]/button[3]/span[1]")
    private WebElement iconSetting;

    //Convert to Tiktok
    @FindBy(xpath = "//button[contains(text(),'Convert to TikTok / Shorts / Reels')]")
    private WebElement btnConvertVideo;


    // Stream clip
    @FindBy(xpath = "//body/div[@id='app']/div[@id='dashboard']/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    private WebElement btnGetMyStreamClip;
    @FindBy(xpath = "//div[contains(text(),'Import a video by uploading from your local storage')]")
    private WebElement btnUploadVideo;

    @FindBy(xpath = "//input[@id='formStreamUrl']")
    private WebElement uploadStreamLocalURL;
    @FindBy(id = "formSelectGameId")
    private WebElement clickSelectGame;
    @FindBy(xpath = "//option[contains(text(),'American Truck Simulator')]")
    private WebElement chooseGame;
    @FindBy(id = "formStreamTitle")
    private WebElement titleVideo;
    @FindBy(xpath = "//input[@id='chkKickAgree']")
    private WebElement checklistAuthorized;
    @FindBy(xpath = "//button[contains(text(),'Import Now')]")
    private WebElement btnImportNow;
    @FindBy(xpath = "//button[contains(text(),'Understood')]")
    private WebElement btnUnderstood;

    // Convert to vertical
    @FindBy(xpath = "//body/div[@id='app']/div[@id='dashboard']/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[5]/button[2]")
    private WebElement btnConvertToVertical;


    //Step
    @Step("As a user click Sign In Button on Homepage")
    public Homepage btnSignInHomepage() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(btnSignIn);
        click(btnSignIn);
        return this;
    }

    @Step("As a user click Sign Up Button on Homepage")
    public Homepage btnSignUpHomepage() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(btnSignUp);
        click(btnSignUp);
        return this;
    }

    @Step("")
    public Homepage inputClipURLHomepage() throws InterruptedException {
        Thread.sleep(1000);
        highlightElement(inputClipURL);
        sendKeys(inputClipURL,"url");
        return this;
        }
    @Step("")
    public Homepage btnConvertClip(){
        highlightElement(btnConvertClip);
        click(btnConvertClip);
        return this;
        }

    // Homepage after login //
    @Step("")
    public Homepage btnSkipForNow() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(btnSkipForNow);
        click(btnSkipForNow);
        return this;
    }
    @Step("")
    public Homepage btnClickSetting() throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(iconProfile);
        click(iconProfile);
        highlightElement(iconSetting);
        click(iconSetting);
        return this;
    }
    @Step("")
    public Homepage iconHomeClick() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(iconHome);
        click(iconHome);
        Thread.sleep(4000);
        return this;
    }

    //convert to vertical video
    @Step("")
    public Homepage iconTikTokClip() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(iconTikTokClip);
        click(iconTikTokClip);
//        continueOnNewTab();
        return this;
    }
    @Step("")
    public Homepage btnConvertVideo() throws InterruptedException {
        Thread.sleep(2000);
        scrollDown500();
        highlightElement(btnConvertVideo);
        click(btnConvertVideo);
        return this;
    }




    //Stream step
    @Step("")
    public Homepage iconStreamClick() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(iconStream);
        click(iconStream);
        return this;
    }

    @Step("")
    public Homepage btnGetClipStream() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(btnGetMyStreamClip);
        click(btnGetMyStreamClip);
        return this;
    }

    @Step("")
    public Homepage btnUploadVideo() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(btnUploadVideo);
        click(btnUploadVideo);
        return this;
    }

    @Step("")
    public Homepage uploadStreamLocalURL() throws Exception {
        Thread.sleep(2000);
        UploadFile("src/test/resources/test.mp4",uploadStreamLocalURL);
        Thread.sleep(4000);
        return this;
    }

    @Step("")
    public Homepage chooseGameStream() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(clickSelectGame);
        click(clickSelectGame);
        highlightElement(chooseGame);
        click(chooseGame);
        return this;
    }

    @Step("")
    public Homepage inputTitleVideo() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(titleVideo);
        sendKeys(titleVideo,"Test Stream automation 1");
        return this;
    }

    @Step("")
    public Homepage btnImportStream() throws InterruptedException {
        Thread.sleep(2000);
        highlightElement(checklistAuthorized);
        click(checklistAuthorized);
        highlightElement(btnImportNow);
        click(btnImportNow);
//        Thread.sleep(100000);
//        click(btnUnderstood);
        Thread.sleep(5000);
        return this;
    }




}
