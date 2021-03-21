package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultPage extends PageObject {

    @FindBy(css = ".button ")
    private List<WebElementFacade> addToCartSearchedProducts;

    public void AddToCart(int productIndex){
        clickOn(addToCartSearchedProducts.get(productIndex));
        waitABit(2000);
    }


    //assert
    @FindBy (css = ".entry-title")
    private WebElementFacade searchResultsMessage;

    public void verifySearchResultsMsg(String productName){
        searchResultsMessage.shouldContainText("SEARCH RESULTS: "+productName);
    }

}
