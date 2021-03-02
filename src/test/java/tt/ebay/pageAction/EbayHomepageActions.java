package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tt.ebay.pageElements.EbayHomepageLocators;
import tt.utilities.SetupDrivers;

public class EbayHomepageActions {

	EbayHomepageLocators EbayHomepageLocatorsobj;                   //Initializing The object
	
	public EbayHomepageActions (){                                //Constractor Method                               
	  EbayHomepageLocatorsobj = new EbayHomepageLocators();         //Creating the object by calling
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsobj); //Using Page object Model
	}
	public void loadEbayHomepage(){
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.ebay.com");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 }
	
	public void searchShirt() throws Exception{
		Thread.sleep(3000);
		EbayHomepageLocatorsobj.txtboxSearchForAnything.clear();             //.clear,.sendkeys.click all coming from Sellinium
		EbayHomepageLocatorsobj.txtboxSearchForAnything.sendKeys("Shirt");
	    EbayHomepageLocatorsobj.btnSerch.click();
		
	}
	public void searchVacuum() throws Exception{
		Thread.sleep(3000);
		EbayHomepageLocatorsobj.txtboxSearchForAnything.clear();            
		EbayHomepageLocatorsobj.txtboxSearchForAnything.sendKeys("vacuum");
	    EbayHomepageLocatorsobj.btnSerch.click();
	}
	
	
	public void searchItem(String item) throws Exception {
		
		EbayHomepageLocatorsobj.txtboxSearchForAnything.clear();          //.clear,.sendkeys.click all coming from Sellinium
		EbayHomepageLocatorsobj.txtboxSearchForAnything.sendKeys(item);
	    EbayHomepageLocatorsobj.btnSerch.click();
	    Thread.sleep(3000);
	}

}
