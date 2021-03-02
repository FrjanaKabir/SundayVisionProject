package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbaySearchResultLocators;
import tt.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	 public EbaySearchResultActions(){
		 EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		 PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	 }
	 
    public  void veryfyShirtRelatedProducts(){
    	//Option:1
    	EbaySearchResultLocatorsObj.txtSleeveLength.isDisplayed();
    	
    	//Option:2
    	System.out.println(EbaySearchResultLocatorsObj.txtSleeveLength.getText());
	 
	 
 }
    public void filterLongSleeve() throws InterruptedException{
    	Thread.sleep(3000);
    	EbaySearchResultLocatorsObj.cbxLongSleeve.click();	
    	Thread.sleep(3000);
    }
    public void validateLongSleeveShirts(){
    	EbaySearchResultLocatorsObj.txtLongSleeve.isDisplayed();
    }
    
    
    public void checkBoxRobotic(){
    	EbaySearchResultLocatorsObj.checkBox.click();
    }
    public void clickImage(){
    	EbaySearchResultLocatorsObj.image.click();
	}
    public void viewCartbutton(){
    	EbaySearchResultLocatorsObj.textBtn.click();
    }
    
    
    public void filterBrand(String Brand) throws Exception{
    	Thread.sleep(3000);
    	if(Brand.equals("Adidas")){
    	EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
    }  else if (Brand.equals("Nike")){
    	EbaySearchResultLocatorsObj.cbxBrandNike.click();
    }  else if (Brand.equals("Unbranded")){
    	EbaySearchResultLocatorsObj.cbxUnbranded.click();
    }
    	Thread.sleep(3000);
  }

	public void validateBrand(String Brand) throws Throwable {
		Thread.sleep(3000);
    	if(Brand.equals("Adidas")){
    	EbaySearchResultLocatorsObj.txtAdidas.isDisplayed();
    }  else if (Brand.equals("Nike")){
    	EbaySearchResultLocatorsObj.txtNike.isDisplayed();
    }  else if (Brand.equals("Unbranded")){
    	EbaySearchResultLocatorsObj.txtUnbranded.isDisplayed();
    }
    	Thread.sleep(3000);
		
	}
	
	public void selectItem() throws Exception{
		Thread.sleep(2000);
		EbaySearchResultLocatorsObj.linkFirstItem.click();
		
	
	}

	
		
	}


