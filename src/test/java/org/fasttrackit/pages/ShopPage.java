package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShopPage extends PageObject {

    @FindBy (css = ".products li:first-child")
    private WebElementFacade product;
    @FindBy(css="[aria-label=\"Add “Album” to your cart\"]")
    private WebElementFacade addToCart;
    @FindBy(css = ".cart-contents ")
    private WebElementFacade shoppingLink;
    @FindBy(css = "[aria-label=\"Add “Beanie” to your cart\"]")
    private WebElementFacade addSecondProductToCart;

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

}
