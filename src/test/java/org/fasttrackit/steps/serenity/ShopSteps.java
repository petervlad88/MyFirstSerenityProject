package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.ShopPage;

public class ShopSteps {

    private HomePage homePage;
    private ShopPage shopPage;
    private ProductPage productPage;

    @Step
    public void openShopCategory() {
        homePage.open();
        homePage.clickShopButton();
    }

    @Step
    public void openProduct() {
        shopPage.clickProduct();
    }

    //assert
    @Step
    public void verifyProductDescription() {
        productPage.productDescriptionIsDisplayed();

    }

    @Step
    public void openProductDescription() {
        openShopCategory();
        openProduct();
    }

    @Step
    public void clickAddToCartButton() {
        shopPage.clickAddToCart();
    }

    @Step
    public void clickSecondAddToCartButton() {
        shopPage.clickSecondProductToCart();
    }

    @Step
    public void openCartPage() {
        shopPage.clickShopingCartLink();
    }

    @Step
    public void clickOnSortingByDate(){
        shopPage.sortingByDate();
    }
    //assert
    @Step
    public void verifyFirstProductNameWasChanged(){
        shopPage.verifyTheFirstProductWasChanged();
    }

}