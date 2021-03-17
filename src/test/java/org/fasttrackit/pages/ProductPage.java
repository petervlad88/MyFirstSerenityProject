package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
//assert
public class ProductPage extends PageObject {

    @FindBy (css = "#tab-description")
    private WebElementFacade productDescription;

    public void productDescriptionIsDisplayed(){
        productDescription.shouldContainText("Description");
    }
}
