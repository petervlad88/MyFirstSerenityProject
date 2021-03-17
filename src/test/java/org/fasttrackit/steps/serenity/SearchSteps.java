package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultPage;
import org.yecht.Data;

public class SearchSteps {

    private HomePage homePage;
    private SearchResultPage searchResultPage;


    @Step
    public void setSearchProductName(String productName){
        homePage.open();
        homePage.setSearchField(productName);
    }
    @Step
    public void clickSearch(){
        homePage.clickSearchButton();
    }
    @Step
    public void search (String product){
        setSearchProductName(product);
        clickSearch();

    }
    //assert
    @Step
    public void verifySearchResults (String productName){
        searchResultPage.verifySearchResultsMsg(productName);

    }
}
