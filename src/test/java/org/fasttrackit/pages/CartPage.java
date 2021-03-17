package org.fasttrackit.pages;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.util.List;

public class CartPage extends PageObject {

    //assert
    @FindBy (css = ".cart_totals h2")
    private WebElementFacade cartTotalsText;

    @FindBy(css = ".product-remove :first-child")
    private List<WebElementFacade> deleteButton;

    @FindBy(css = ".cart-empty")
    private WebElementFacade verifyEmptyCartMessage;

    @FindBy(css = ".checkout-button")
    private WebElementFacade proceedToCheckoutButton;

    //assert
    public void cardTotalsIsDisplayed(){
        Assert.assertTrue(cartTotalsText.isDisplayed());

    }
    public void deleteFirstProduct(){
        clickOn(deleteButton.get(0));
    }
    //assert
    public void VerifyEmptyCartMessage(){
        Assert.assertEquals("Your cart is currently empty.",verifyEmptyCartMessage.getText());
    }

    public void deleteAllProductsFromCart() {
        while (deleteButton.size() > 0) {
            waitABit(500);
            clickOn(deleteButton.get(0));
            waitABit(500);

        }
    }
    public void clickproceedToCheckout(){
        clickOn(proceedToCheckoutButton);
    }



}
