package Eklipse.FE.Web.Buyer.controllers;

import Eklipse.FE.Web.Buyer.utils.BuyerEnvironmentSetup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import static Eklipse.FE.Web.Buyer.utils.BuyerExplicitWaiting.explicitWaitVisibilityOfElement;


public class BuyerBaseMethod extends BuyerWebDriverFactory
{
	@AfterTest
	public void beforeSuite() throws Exception
	{
		BuyerEnvironmentSetup.environmentSetup();
	}
	
	/* To get the Website Name */
	public String getUrlTitle() throws Exception 
	{
		URL aURL = new URL(WebsiteURLTraveloka);
		String WebName = aURL.getHost();
		return WebName.toUpperCase();
	}



	/* To Press ENTER Key using Robot */
	public void hitEnter() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);
	}


	/* To Press BACKSPACE Key using Robot */
	public void hitBackspace() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_BACK_SPACE);
		re.keyRelease(KeyEvent.VK_BACK_SPACE);
	}


	/* To Press DELETE Key using Robot */
	public void hitDelete() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_DELETE);
		re.keyRelease(KeyEvent.VK_DELETE);
	}


	/* To Select all the Text/Web Elements using ROBOT */
	public void selectAll() throws Exception
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_A);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyRelease(KeyEvent.VK_A);
	}


	/* To Copy all the Selected Text/Web Elements using ROBOT */
	public void copyAll() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_C);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyRelease(KeyEvent.VK_C);
	}


	/* To Paste all the Selected Text/Web Elements using ROBOT */
	public void pasteAll() throws Exception
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_V);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyRelease(KeyEvent.VK_V);
	}


	/* To Capture Screenshot(Replaces if already exists) */
	/*
	 * Also, Make sure that the automation in running in the foreground to
	 * capture the Image of the Browser. Else, It'll capture the open Window
	 */
	public void robotScreenCapture(String robotImageName) throws Exception
	{
		re = new Robot();
		Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage bufferedImage = re.createScreenCapture(area);
		// Save as PNG
		File file = new File(robotImageName);
		if (file.exists())
		{
			file.delete();
		}
		ImageIO.write(bufferedImage, "png", file);
	}



	/* To ZoomOut */
	public void robotZoomOut() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_SUBTRACT);
		re.keyRelease(KeyEvent.VK_SUBTRACT);
		re.keyRelease(KeyEvent.VK_CONTROL);
	}


	/* To ZoomIn */
	public void robotZoomIn() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_ADD);
		re.keyRelease(KeyEvent.VK_ADD);
		re.keyRelease(KeyEvent.VK_CONTROL);
	}


	/* To ScrollUp using ROBOT */
	public void robotScrollUp() throws Exception 
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_PAGE_UP);
		re.keyRelease(KeyEvent.VK_PAGE_UP);
	}


	/* To ScrollDown using ROBOT */
	public void robotScrollDown() throws Exception
	{
		re = new Robot();
		re.keyPress(KeyEvent.VK_PAGE_DOWN);
		re.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	public void highlightElement(WebElement element){
	JavascriptExecutor js = (JavascriptExecutor)driver ;
	js.executeScript("arguments[0].setAttribute('style',' border: 2px solid red;');", element);
	}


	/* To ScrollUp using JavaScript Executor */
	public void scrollUp() {
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0, -100);");
	}

//	public void pointerAlam(WebElement ele) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, " + ele.getLocation().y + ")");
//	}
//	public void pointerAlam() {
//		((JavascriptExecutor) getWebDriver()).executeScript("scroll(1700, 900);");
//	}


	/* To ScrollDown using JavaScript Executor */
	public void scrollDown100() {
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0, 100);");
	}
	//500
	public void scrollDown500() {
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0, 500);");
	}
	//700
	public void scrollDown700() {
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0, 700);");
	}
	//1000
	public void scrollDown1000() {
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0, 1000);");
	}

	public void scrollToCenter(WebElement e) {
		explicitWaitVisibilityOfElement(e,5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", e);
	}

	/* To Move cursor to the Desired Location */
	public void moveCursor(int X_Position, int Y_Position) {
		re.mouseMove(X_Position, Y_Position);
	}


	/* To Accept the Alert Dialog Message */
	public void alertAccept() {
		al = getWebDriver().switchTo().alert();
		al.accept();
	}
 	public void refreshPage(){
		getWebDriver().navigate().refresh();
	}

	/* To Dismiss the Alert Dialog Message */
	public void alertDismiss() {
		al = getWebDriver().switchTo().alert();
		al.dismiss();
	}


	/* To Get the Alert Messages */
	public String getAlertText() throws Exception 
	{
		al = getWebDriver().switchTo().alert();
		String text = al.getText();
		Thread.sleep(2000);
		alertAccept();
		return text;
	}

	//Upload File src local New
	public void UploadFile(String Location, WebElement element) throws Exception
	{
		Thread.sleep(3000);
		element.sendKeys(System.getProperty("user.dir") + "/" + Location);
	}


	/* To Upload a File using JAVA AWT ROBOT */
	public void fileUpload(String FileToUpload) throws Exception
	{
		Thread.sleep(5000);
		StringSelection filetocopy = new StringSelection(FileToUpload);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filetocopy, null);
		Thread.sleep(1000);
		re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_V);
		re.keyRelease(KeyEvent.VK_V);
		re.keyRelease(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_ENTER);
		re.keyRelease(KeyEvent.VK_ENTER);
	}


	/* To Perform a WebAction of Mouse Over */
	public void mousehover(WebElement element) 
	{
		ac = new Actions(getWebDriver());
		ac.moveToElement(element).build().perform();
	}


	/* To Perform Select Option by Visible Text */
	public void selectByVisibleText(WebElement element, String value)
	{
		se = new Select(element);
		se.selectByVisibleText(value);
	}


	/* To Perform Select Option by Index */
	public void selectByIndex(WebElement element, int value)
	{
		se = new Select(element);
		se.selectByIndex(value);
	}


	/* To Perform Select Option by Value */
	public void selectByValue(WebElement element, String value) 
	{
		se = new Select(element);
		se.selectByValue(value);
	}


	/* To click a certain Web Element */
	public void click(WebElement element) 
	{
		element.click();
	}


	/* To click a certain Web Element using DOM/ JavaScript Executor */
	public void JSclick(WebElement element) 
	{
		((JavascriptExecutor) getWebDriver()).executeScript("return arguments[0].click();", element);
	}


	/* To Type at the specified location */
	public void sendKeys(WebElement element, String value) 
	{
		element.sendKeys(value);
	}



	/* To Clear the content in the input location */
	public void clear(WebElement element) 
	{
		element.clear();
	}


	/* To Drag and Drop from Source Locator to Destination Locator */
	public void dragandDrop(WebElement Source, WebElement Destination)
	{
		ac = new Actions(getWebDriver());
		ac.dragAndDrop(Source, Destination);
	}


	/*To Drag from the given WebElement Location and Drop at the given WebElement location */
	public void dragandDropTo(WebElement Source, int XOffset, int YOffset) {
		ac = new Actions(getWebDriver());
		ac.dragAndDropBy(Source, XOffset, YOffset);
	}


	/*To Open a Page in New Tab */
	public void rightClick(WebElement element) 
	{
		ac = new Actions(getWebDriver());
		ac.contextClick(element);
		ac.build().perform();	
	}


	/*To Close Current Tab */
	public void closeCurrentTab() 
	{
		getWebDriver().close();		
	}


	/*To Perform Click and Hold Action */
	public void clickAndHold(WebElement element)
	{
		ac = new Actions(getWebDriver());
		ac.clickAndHold(element);
		ac.build().perform();
	}


	/*To Perform Click and Hold Action */
	public void doubleClick(WebElement element)
	{
		ac = new Actions(getWebDriver());
		ac.doubleClick(element);
		ac.build().perform();
	}


	/*To Switch To Frame By Index */
	public void switchToFrameByIndex(int index) {
		getWebDriver().switchTo().frame(index);
	}


	/*To Switch To Frame By Frame Name */
	public void switchToFrameByFrameName(String frameName) {
		getWebDriver().switchTo().frame(frameName);
	}


	/*To Switch To Frame By Web Element */
	public void switchToFrameByWebElement(WebElement element) {
		getWebDriver().switchTo().frame(element);
	}


	/*To Switch out of a Frame */
	public void switchOutOfFrame() {
		getWebDriver().switchTo().defaultContent();
	}


	/*To Get Tooltip Text */
	public String getTooltipText(WebElement element)
	{
		return element.getAttribute("title").trim();
	}


	/*To Close all Tabs/Windows except the First Tab */
	public void closeAllTabsExceptFirst() 
	{
		ArrayList<String> tabs = new ArrayList<>(getWebDriver().getWindowHandles());
		for(int i=1;i<tabs.size();i++)
		{	
			getWebDriver().switchTo().window(tabs.get(i));
			getWebDriver().close();
		}
		getWebDriver().switchTo().window(tabs.get(0));
	}
	
	
	/*To Print all the Windows */
	public void printAllTheWindows() 
	{
		ArrayList<String> al = new ArrayList<>(getWebDriver().getWindowHandles());
		for(String window : al)
		{
			System.out.println(window);
		}
	}

	/*continue after open a new tab ALAM Method*/
	public void continueOnNewTab() {
		String currentTab = driver.getWindowHandle();
		for (String tab : driver.getWindowHandles()) {
			if (!tab.equals(currentTab)) {
				driver.switchTo().window(tab);
			}
		}
	}
}
