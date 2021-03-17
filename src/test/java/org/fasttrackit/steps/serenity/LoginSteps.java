package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPageLogin;

public class LoginSteps {

    private HomePage homePage;
    private MyAccountPageLogin myAccountPageLogin;
    private AccountPage accountPage;

    @Step
    public void navigateToMyAccountLink(){
        homePage.open();
        homePage.clickMyAccountLink();
    }
    @Step
    public void setEmail(String email){
        myAccountPageLogin.setEmailField(email);
    }

    @Step
    public void setPassword(String password){
        myAccountPageLogin.setPasswordField(password);
    }

    @Step
    public void clickLogin(){
        myAccountPageLogin.clickLoginButton();
    }

    @Step
    public void login(String userName ,String password){
        setEmail(userName);
        setPassword(password);
        clickLogin();
    }

    //assert
    @Step
    public void verifyHello(String userName){
        accountPage.verifyHelloMsg(userName);
    }
    //assert
    @Step
    public void verifyInvalidPasswordMessage(String invalidPass){
        myAccountPageLogin.verifyErrorMessage(invalidPass);
    }
    //assert
    @Step
    public void verifyErrorMessageForEmptyFields(){
        myAccountPageLogin.verifyErrorMessageEmptyFields();
    }
}
