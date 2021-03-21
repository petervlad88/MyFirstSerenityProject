package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;

import java.util.List;

public class ShopPage extends PageObject {

    @FindBy (css = ".products li:first-child")
    private WebElementFacade product;
    @FindBy(css="[aria-label=\"Add “Album” to your cart\"]")
    private WebElementFacade addToCart;
    @FindBy(css = ".cart-contents ")
    private WebElementFacade shoppingLink;
    @FindBy(css = "[aria-label=\"Add “Beanie” to your cart\"]")
    private WebElementFacade addSecondProductToCart;
    @FindBy(css = ".orderby [value=\"date\"]")
    private WebElementFacade sortingProductsByDate;
    //assert
    @FindBy(css = ".collection_title h3")
    private List<WebElementFacade> productsTitle;


    public void clickProduct(){
        clickOn(product);
    }
    public void clickAddToCart(){
        clickOn(addToCart);
    }
    public void clickSecondProductToCart(){
        clickOn(addSecondProductToCart);
    }
    public void clickShopingCartLink(){
        clickOn(shoppingLink);
    }
    public void sortingByDate(){
        clickOn(sortingProductsByDate);
    }
    //assert
    public void verifyTheFirstProductWasChanged(){
        Assert.assertEquals("Sunglasses MK",productsTitle.get(0).getText());
    }



}
