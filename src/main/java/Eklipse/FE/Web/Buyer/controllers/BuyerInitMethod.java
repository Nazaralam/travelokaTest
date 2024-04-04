package Eklipse.FE.Web.Buyer.controllers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.io.File;
import java.net.URI;


public class BuyerInitMethod {
    public static BuyerApplicationConfigReader appConfig = new BuyerApplicationConfigReader();


    public static String PasswordAccount =appConfig.getPasswordAccount();
    public static String WebsiteURLTraveloka = appConfig.getWebsiteUrlTraveloka();
    public static String BrowserBuyer = appConfig.getBrowserBuyer();
    public static int MaxPageLoadTime = appConfig.getMaxPageLoadTime();
    public static int ImplicitlyWait = appConfig.getImplicitlyWait();
    public static String VideoFeature = appConfig.getVideoFeature();
    //
    //Alam

    public static String FS = File.separator;

    public static String OSName = System.getProperty("os.name");
    public static String OSArchitecture = System.getProperty("os.arch");
    public static String OSVersion = System.getProperty("os.version");
    public static String OSBit = System.getProperty("sun.arch.data.model");

    public static String ProjectWorkingDirectory = System.getProperty("user.dir");


    public static Robot re;
    public static Alert al;
    public static String robotImageName;
    public static Select se;
    public static String FileToUpload;
    public static Actions ac;
    public static ITestResult testResult;
    public static SoftAssert softAssert;
    public static ITestResult result;
    public static URI uri;

}
