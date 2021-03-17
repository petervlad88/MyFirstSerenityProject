package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Before;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")

public class HomePage extends PageObject {

    
    @FindBy(css = "#menu-item-70 > a")
    private WebElementFacade myAccountLink;

    @FindBy(css = ".search-form .fa")
    private WebElementFacade searchButton;

    @FindBy(css = ".search-form .search-field")
    private  WebElementFacade searchField;

    @FindBy(css = "#menu-a li:nth-child(5)")
    private WebElementFacade shopButton;


    public void clickMyAccountLink(){
        clickOn(myAccountLink);
    }

    public void setSearchField(String productName){
        typeInto(searchField,productName);
    }
    public void clickSearchButton(){
        clickOn(searchButton);
    }
    public void clickShopButton(){
        clickOn(shopButton);
    }



}
