package tt.ebay.stepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbaySerchSteps {
	
	EbayHomepageActions EbayHomepageActionsobj = new EbayHomepageActions();
	EbaySearchResultActions EbaySearchResultActionobj = new EbaySearchResultActions();
	
	@Given("^Open Ebay Website$")
	public void open_Ebay_Website() throws Throwable {
	   
    EbayHomepageActionsobj.loadEbayHomepage();
	    
	}
	@When("^Search for Shirts$")
	public void in_searchbar_type_in_shirts() throws Throwable {
	    
	   
	    EbayHomepageActionsobj.searchShirt();
	    
	    }

	@Then("^Item list should have only shirt related products$")
	public void item_list_should_have_only_shirt_related_products() throws Throwable {
	   
		EbaySearchResultActionobj.veryfyShirtRelatedProducts();
		
		
	}
}
