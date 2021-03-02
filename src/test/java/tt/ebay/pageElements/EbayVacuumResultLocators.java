package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayVacuumResultLocators {
	
	
	       //CheckBox for Robotic
			@FindBy(xpath="//input[@aria-label='Robotic']")
			public WebElement checkBox;
			
			
	
	      //View Cart Text
	    // @FindBy(xpath="//a[@id='vi-viewInCartBtn']")
	     // public WebElement textBtn;
			
		
			
	
	    // Subtotal option
	    @FindBy(xpath="//span[contains(text(),'Subtotal')]")
	    public WebElement textSubtotal;

}
