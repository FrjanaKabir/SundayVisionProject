package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tt.ebay.pageElements.EbayCartLocators;

import tt.utilities.SetupDrivers;

public class EbayCartActions {
	
	EbayCartLocators EbayCartLocatorsObj;
	
	 public EbayCartActions(){ 
		 
		 EbayCartLocatorsObj = new EbayCartLocators();
		 PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	 }
	
	public void selectColor()throws Exception{ 
		Thread.sleep(2000);
		Select myDrpDwn = new Select(EbayCartLocatorsObj.ddColor);
		myDrpDwn.deselectByVisibleText("Read");		
		
		
	}
	public void selectSize()throws Exception{
		Thread.sleep(2000);
	  Select myDrpDwn = new Select(EbayCartLocatorsObj.ddSize);
	  myDrpDwn.deselectByVisibleText("Large");			
		
		
	}
	public void selectQuantity()throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorsObj.txtbxQuantity.clear();
		EbayCartLocatorsObj.txtbxQuantity.sendKeys("5");
		
	}
	
	
	public void addToCart()throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorsObj.btnAddCart.click();
		
	}

}
