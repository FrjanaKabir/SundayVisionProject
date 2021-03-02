package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Text "Sleeve Length"
	 @FindBy(xpath="//h3[text()='Sleeve Length']")
	 public WebElement txtSleeveLength;
	 
	 //Long Sleeve 
	 @FindBy(xpath="//input[@aria-label='Long Sleeve']")
	 public WebElement cbxLongSleeve;
	 
	 //Validate Long Sleeve Shirts
	 @FindBy(xpath="//*[contains(text(),'Long Sleeve')]")
	 public WebElement txtLongSleeve;
	 
	//CheckBox for Robotic
		@FindBy(xpath="//input[@aria-label='Robotic']")
		public WebElement checkBox; 
	 
		//Image of Robot
		@FindBy(xpath="//*[contains(text(),'Alexa Robotic Vacuum Cleaner Robot Floor Carpet Pet Hair Dirt Automatic Sweeper')]")
		public WebElement image;
		
		  //View Cart Text
	     @FindBy(xpath="//a[contains(text(),'ViewCart')]")
	      public WebElement textBtn;
		
		
	 
	 //Brand Nike
	 @FindBy(xpath="//*[@aria-label='Nike']")
	 public WebElement cbxBrandNike;
	 
	 //Brand Adidas
	 @FindBy(xpath="//*[@aria-label='adidas']")
	 public WebElement cbxBrandAdidas;
	 
	//Unbranded
		 @FindBy(xpath="//*[@aria-label='Unbranded']")
		 public WebElement cbxUnbranded;
		 
          //Validate Nike
		 @FindBy(xpath="//*[contains(text(),'Nike')]")
		 public WebElement txtNike;
		 
		 
		   //Validate Adidas
				 @FindBy(xpath="//*[contains(text(),'Adidas')]")
				 public WebElement txtAdidas;
		 
		           
				 //Validate Unbranded
				 @FindBy(xpath="//*[contains(text(),'Unbranded')]")
				 public WebElement txtUnbranded;
		 
		         //Category Women
				 @FindBy(xpath="//span[contains(text(),'Women')]")
				 public WebElement txtWomen1;
				 
				 //Category Men
				 @FindBy(xpath="//a[contains(text(),'Men')]")
				 public WebElement txtMen1;
				 
				 //Category Kids
				 @FindBy(xpath="//span[contains(text(),'Kids')]")
				 public WebElement txtKids1;
				 //Validate Women
				 @FindBy(xpath="//*[contains(text(),'Women')]")
				 public WebElement txtWomen;
				 
				 //Select First Item
				 @FindBy(xpath="//h3[contains(text(),")
				 public WebElement linkFirstItem;
				
				 
				 
				 
				 
				 
		 
}
