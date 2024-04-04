package Eklipse.FE.Web.Buyer.controllers;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;


@Resource.Classpath("ApplicationConfig.properties")
public class BuyerApplicationConfigReader
{
	
	public BuyerApplicationConfigReader()
	{
		PropertyLoader.newInstance().populate(this);
	}
	
	@Property(value = "BrowserFirefox")
	private String BrowserBuyer;
	
	@Property(value="UrlTraveloka")
	private String WebsiteUrlTraveloka;
	
	@Property(value="MaxPageLoadTime")
	private int MaxPageLoadTime;
	
	@Property(value="ImplicitlyWait")
	private int ImplicitlyWait;
	
	@Property(value="VideoFeature")
	private String VideoFeature;
	@Property(value = "UsrEklipse")
	private String usrEklipse;
  
	@Property(value = "Password")
	private String passwordAccount;


	public String getPasswordAccount() {return passwordAccount;}
	public String getUsrEklipse(){return usrEklipse;}
	//

	public String getBrowserBuyer() {

		return BrowserBuyer;
	}

	public String getWebsiteUrlTraveloka() {
		return WebsiteUrlTraveloka;
	}



	public int getMaxPageLoadTime() {
		return MaxPageLoadTime;
	}

	public int getImplicitlyWait() {
		return ImplicitlyWait;
	}

	public String getVideoFeature() {
		return VideoFeature;
	}




}
