package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayBrandOutlineSteps {
	
	EbayHomepageActions EbayHomepageActionsobj = new EbayHomepageActions();
	EbaySearchResultActions EbaySearchResultActionobj = new EbaySearchResultActions();
	
	@When("^Search for \"([^\"]*)\"$")
	public void search_for(String item) throws Throwable {
		 EbayHomepageActionsobj.searchItem(item);
	    
	}

	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResultActionobj.filterBrand(brand);
	}

	@Then("^Item list should have product of \"([^\"]*)\"$")
	public void item_list_should_have_product_of(String brand) throws Throwable {
		//System.out.println("Test Validattion not impliment yet");
		EbaySearchResultActionobj.validateBrand(brand);
	    
	}



}
