package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.BaseTest;
import org.fasttrackit.steps.serenity.AddToCartSteps;
import org.fasttrackit.steps.serenity.ShopSteps;
import org.junit.After;
import org.junit.Test;

public class AddToCartTest extends BaseTest {

    @Steps
    private AddToCartSteps addToCartSteps;
    @Steps
    private ShopSteps shopSteps;

    @After
    public void deleteAllProducts() {
        addToCartSteps.deleteAllProducts();
    }

    @Test
    public void productIsInTheCart(){
        addToCartSteps.openShopCategory();
        shopSteps.clickAddToCartButton();
        shopSteps.openCartPage();

        //assert
        addToCartSteps.verifyCartTotals();

    }
    @Test
    public void deleteProductFromCart(){
        addToCartSteps.openShopCategory();
        shopSteps.clickAddToCartButton();
        shopSteps.openCartPage();
        addToCartSteps.deleteFirstProductFromCart();
        //assert
        addToCartSteps.verifyEmptyCartMsg();

    }
    @Test
    public void deleteAllProductFromCart(){
        addToCartSteps.openShopCategory();
        shopSteps.clickAddToCartButton();
        shopSteps.clickSecondAddToCartButton();
        shopSteps.openCartPage();
        addToCartSteps.deleteAllProducts();
        //assert
        addToCartSteps.verifyEmptyCartMsg();

    }
}
