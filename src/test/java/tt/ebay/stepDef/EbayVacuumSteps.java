package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayVacuumResultActions;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayVacuumSteps {
	EbayHomepageActions EbayHomepageActionsobj = new EbayHomepageActions();
	EbaySearchResultActions EbaySearchResultActionsobj = new EbaySearchResultActions();
	EbayVacuumResultActions EbayCartResultActionsobj = new EbayVacuumResultActions();
	
	
	@When("^Serch for Vacuum$")
	public void serch_for_Vacuum() throws Throwable {
		
		EbayHomepageActionsobj.searchVacuum();
	    }

	@When("^Select Robotic from Type$")
	public void select_Robotic_from_Type() throws Throwable {
		EbaySearchResultActionsobj.checkBoxRobotic();
	      
	}

	@When("^Select Robotic Vacuum$")
	public void select_Robotic_Vacuum() throws Throwable {
		
		EbaySearchResultActionsobj.clickImage();
	    
	}

	@When("^clic View Cart button$")
	public void clic_View_Cart_button() throws Throwable {
		
		EbaySearchResultActionsobj.viewCartbutton(); 
	}

	@Then("^Robotic Vacuum should be in the Cart$")
	public void robotic_Vacuum_should_be_in_the_Cart() throws Throwable {
		
		EbayCartResultActionsobj.vacuumInCart();
	    
	}



}
