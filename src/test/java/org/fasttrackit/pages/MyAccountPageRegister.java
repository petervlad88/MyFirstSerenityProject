package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPageRegister extends PageObject {

    //reg
    @FindBy(css = "#reg_email")
    private WebElementFacade regEmailField;

    @FindBy(css = "#reg_password")
    private WebElementFacade regPasswordField;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p.woocommerce-FormRow.form-row > button")
    private WebElementFacade regButton;

    //Assert
    @FindBy(css = ".woocommerce-error li:first-child")
    private WebElementFacade errorMessage;

    //reg metode
    public void setRegEmailField(String userName) {
        typeInto(regEmailField, userName);
    }
    public void setRegPasswordField(String password){
        typeInto(regPasswordField, password);
    }
    public void clickRegButton() {
        clickOn(regButton);
    }
    //assert
    public void verifyErrorMessage(String error){
        errorMessage.shouldContainText(error);
    }

}
