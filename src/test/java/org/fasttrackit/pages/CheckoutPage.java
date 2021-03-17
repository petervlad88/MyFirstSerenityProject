package org.fasttrackit.pages;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;


@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=6")

public class CheckoutPage extends PageObject {

    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(css = "p #billing_address_1")
    private WebElementFacade addressField;

    @FindBy(css = "p #billing_city")
    private WebElementFacade cityNameField;

    @FindBy(css = "p #billing_postcode")
    private WebElementFacade postCodeField;

    @FindBy(css = "#billing_phone")
    private WebElementFacade phoneNumberField;

    @FindBy(css = "#billing_email")
    private WebElementFacade emailField;

    @FindBy(css = "#place_order")
    private WebElementFacade placeOrderButton;

    //assert
    @FindBy(css = ".post-title")
    private WebElementFacade verifyReceivedOrderMessage;



    public void setFirstNameField(String firstName){
        typeInto(firstNameField,firstName);
    }
    public void setLastNameField(String lastName){
        typeInto(lastNameField,lastName);
    }
    public void setAddressField(String address){
        typeInto(addressField,address);
    }
    public void setCityNameField(String cityName){
        typeInto(cityNameField,cityName);
    }
    public void setPostCodeField(String postCode){
        typeInto(postCodeField,postCode);
    }
    public void setPhoneNumberField(String phoneNumber){
        typeInto(phoneNumberField,phoneNumber);
    }
    public void setEmailField(String email){
        typeInto(emailField,email);
    }
    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }
    //assert
    public void receivedOrderMsg(){
        Assert.assertTrue(verifyReceivedOrderMessage.isDisplayed());
    }



}
