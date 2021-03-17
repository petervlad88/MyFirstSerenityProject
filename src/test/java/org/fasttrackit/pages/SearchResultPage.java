package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultPage extends PageObject {
    //assert
    @FindBy (css = ".entry-title")
    private WebElementFacade searchResultsMessage;

    public void verifySearchResultsMsg(String productName){
        searchResultsMessage.shouldContainText("SEARCH RESULTS: "+productName);
    }
}
