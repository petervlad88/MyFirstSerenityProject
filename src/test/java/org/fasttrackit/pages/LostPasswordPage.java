package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;


@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7&lost-password")

public class LostPasswordPage extends PageObject {

    @FindBy(css = "#user_login")
    private WebElementFacade usernameOrEmailField;

    @FindBy(css = ".woocommerce-Button ")
    private WebElementFacade resetPasswordButton;

    //assert
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade resetPasswordMessage;

    public void setUsernameOrEmailField(String username){
        typeInto(usernameOrEmailField,username);
    }
    public void clickResetButton(){
        clickOn(resetPasswordButton);
    }
    //assert
    public void resetMessage(){
        Assert.assertTrue(resetPasswordMessage.isDisplayed());
    }


}
