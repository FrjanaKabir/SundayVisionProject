package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbayVacuumResultLocators;
import tt.utilities.SetupDrivers;

public class EbayVacuumResultActions {
	
	EbayVacuumResultLocators EbayCartResultLocatorsobj;
	
	public EbayVacuumResultActions(){
		EbayCartResultLocatorsobj = new EbayVacuumResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartResultLocatorsobj);
		}

          
		public void vacuumInCart(){
		EbayCartResultLocatorsobj.textSubtotal.isDisplayed();
		System.out.println(EbayCartResultLocatorsobj.textSubtotal.getText());
	}
}
