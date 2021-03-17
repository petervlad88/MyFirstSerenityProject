package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ShopPage;

public class CheckoutSteps {

    private HomePage homePage;
    private ShopPage shopPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Step
    public void openShopCategory() {

        homePage.open();
        homePage.clickShopButton();

    }
    @Step
    public void clickAddToCartBtn(){
        shopPage.clickAddToCart();

    }
    @Step
    public void clickShopCartLink(){
        shopPage.clickShopingCartLink();
    }
    @Step
    public void clickProceedToCheckoutBtn(){
        cartPage.clickproceedToCheckout();
    }

    @Step
    public void setFirstName(String firstName){
        checkoutPage.setFirstNameField(firstName);
    }
    @Step
    public void setLastName(String lastName){
        checkoutPage.setLastNameField(lastName);
    }
    @Step
    public void setAddress(String address){
        checkoutPage.setAddressField(address);
    }
    @Step
    public void setCityName(String cityName){
        checkoutPage.setCityNameField(cityName);
    }
    @Step
    public void setPostCode(String postCode){
        checkoutPage.setPostCodeField(postCode);
    }
    @Step
    public void setPhoneNumber(String phoneNumber){
        checkoutPage.setPhoneNumberField(phoneNumber);
    }
    @Step
    public void setEmail(String email){
        checkoutPage.setEmailField(email);
    }
    @Step
    public void clickPlaceOrderBtn(){
        checkoutPage.clickPlaceOrderButton();
    }
    //assert
    @Step
    public void verifyReceivedOrderMsg(){
        checkoutPage.receivedOrderMsg();
    }
}

