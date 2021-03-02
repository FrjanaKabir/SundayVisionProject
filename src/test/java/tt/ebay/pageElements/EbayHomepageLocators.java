package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.By;
//import tt.utilities.SetupDrivers;

public class EbayHomepageLocators {

	//Search for anything
	@FindBy(xpath="//input[@id='gh-ac']")
	public WebElement txtboxSearchForAnything;

	//Search
	@FindBy(xpath="//input[@id='gh-btn']")
	public WebElement btnSerch;

	
	//Search-Locators without Page Factory
	//WebElement btnSearch2 = SetupDrivers.driver.findElement(By.xpath("//input[@id='gh-btn']"));
}
