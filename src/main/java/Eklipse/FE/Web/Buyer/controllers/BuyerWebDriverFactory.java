package Eklipse.FE.Web.Buyer.controllers;

import com.automation.remarks.video.enums.RecorderType;
import com.automation.remarks.video.enums.RecordingMode;
import com.automation.remarks.video.enums.VideoSaveMode;
import com.automation.remarks.video.recorder.VideoRecorder;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class BuyerWebDriverFactory extends BuyerBrowserFactory {
    public static ThreadLocal<WebDriver> wd = new ThreadLocal<WebDriver>();
    public static String browser;
    public static String url;

//    @BeforeTest(alwaysRun = true)
//    public void suiteSetup() {
//        switch (BrowserBuyer.toLowerCase()) {
//            case "chrome":
//            case "chrome_headless":
//                WebDriverManager.chromedriver().setup();
//
////            case "opera":
////                WebDriverManager.operadriver().setup();
////                break;
//
//            case "firefox":
//            case "firefox_headless":
//                WebDriverManager.firefoxdriver().arch64().setup();
//                break;
//
//            case "ie":
//            case "internet explorer":
//                WebDriverManager.iedriver().setup();
//                break;
//
//            case "edge":
//                WebDriverManager.edgedriver().setup();
//                break;
//
//            case "safari":
//                WebDriverManager.safaridriver();
//                break;
//
//            default:
//                throw new NotFoundException("Browser Not Found. Please Provide a Valid Browser");
//        }
//    }


    @BeforeMethod
    public void beforeMethod() throws Exception {
        System.out.println("Browser: " + BrowserBuyer);
        System.out.println("WebsiteURL: " + WebsiteURLTraveloka);
//        new BuyerWebDriverFactory();
        WebDriver driver = createDriver();
        setWebDriver(driver);

        if (VideoFeature.toLowerCase().contains("enabledfailed")) {
            setupVideoRecordingFailedOnly();
        } else if (VideoFeature.toLowerCase().contains("enabledall")) {
            setupVideoRecordingAll();
        }
    }

    public void setupVideoRecordingFailedOnly() {
        VideoRecorder.conf()
                .withVideoFolder("./src/test/resources/Videos")                         // Default is ${user.dir}/video.
                .videoEnabled(true)                                                     // Disabled video globally
                .withVideoSaveMode(VideoSaveMode.FAILED_ONLY)                           // Save videos ONLY FAILED tests
                .withRecorderType(RecorderType.MONTE)                                   // Monte is Default recorder
                .withRecordMode(RecordingMode.ALL);                                     // Record video only for tests with @Video
    }

    public void setupVideoRecordingAll() {
        VideoRecorder.conf()
                .withVideoFolder("./src/test/resources/Videos")                         // Default is ${user.dir}/video.
                .videoEnabled(true)                                                     // Disabled video globally
                .withVideoSaveMode(VideoSaveMode.ALL)                                   // Save videos All tests
                .withRecorderType(RecorderType.MONTE)                                   // Monte is Default recorder
                .withRecordMode(RecordingMode.ALL);                                     // Record video only for tests with @Video
    }

    public void setWebDriver(WebDriver driver) {
        wd.set(driver);
    }

    public static WebDriver getWebDriver() {
        return wd.get();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() throws Exception {
        Thread.sleep(2000);
        getWebDriver().quit();
    }
}
