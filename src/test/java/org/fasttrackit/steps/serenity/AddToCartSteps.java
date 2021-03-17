package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ShopPage;

import java.net.CacheRequest;

public class AddToCartSteps {

    private HomePage homepage;
    private ShopPage shopPage;
    private CartPage cartPage;

    @Step
    public void openShopCategory() {
        homepage.open();
        homepage.clickShopButton();
    }


    //assert
    @Step("Verify if Cart totals is displayed on cart page")
    public void verifyCartTotals(){
        cartPage.cardTotalsIsDisplayed();

    }
    @Step("Delete first product from cart")
    public void deleteFirstProductFromCart(){
        cartPage.deleteFirstProduct();
    }
    //assert
    @Step("Verify empty cart msg")
    public void verifyEmptyCartMsg(){
        cartPage.VerifyEmptyCartMessage();
    }

    @Step("Delete all products from cart")
    public void deleteAllProducts(){
        cartPage.deleteAllProductsFromCart();
    }
    @Step(" Click on Proceed to Checkout button")
    public void proceedToCheckout(){
        cartPage.clickproceedToCheckout();
    }

}