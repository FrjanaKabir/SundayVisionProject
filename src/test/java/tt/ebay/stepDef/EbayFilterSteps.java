package tt.ebay.stepDef;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayFilterSteps {
	EbayHomepageActions EbayHomepageActionsobj = new EbayHomepageActions();
	EbaySearchResultActions EbaySearchResultActionsobj = new EbaySearchResultActions();
	
	
	@When("^Select Long Sleeve Shirt$")
	public void select_Long_Sleeve_Shirt() throws Throwable {
	   
		EbaySearchResultActionsobj.filterLongSleeve();
		
	}

	@Then("^Validate by displaying only Long Sleev Shirts$")
	public void validate_by_displaying_only_Long_Sleev_Shirts() throws Throwable {
	    
	    EbaySearchResultActionsobj.validateLongSleeveShirts();
	}



}
