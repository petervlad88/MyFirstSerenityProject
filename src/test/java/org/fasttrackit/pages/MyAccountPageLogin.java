package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7")

public class MyAccountPageLogin extends PageObject {


    @FindBy (css = "#username")
    private WebElementFacade emailField;

    @FindBy(css = "#password")
    private WebElementFacade passwordField;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-LostPassword a")
    private WebElementFacade lostYourPassword;

    //assert
    @FindBy(css = ".woocommerce li:first-child")
    private WebElementFacade errorMessage;

    //assert
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessageUsernameRequired;



    public void setEmailField(String user){
        typeInto(emailField,user);
    }
    public void setPasswordField(String password){
        typeInto(passwordField,password);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }

//    public void login(String userName ,String password) {
//        setEmailField(userName);
//        setPasswordField(password);
//        clickLoginButton();
//    }


    //assert
    public void verifyErrorMessage(String invalidPassword){
        errorMessage.shouldContainText(invalidPassword);

    }
    //assert
    public void verifyErrorMessageEmptyFields(){
        Assert.assertTrue(errorMessageUsernameRequired.isDisplayed());
    }
    public void clickLostYourPassword(){
        clickOn(lostYourPassword);
    }




}
