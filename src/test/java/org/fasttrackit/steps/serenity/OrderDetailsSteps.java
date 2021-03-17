package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPageLogin;

public class OrderDetailsSteps {

    private HomePage homePage;
    private MyAccountPageLogin myAccountPageLogin;
    private AccountPage accountPage;

    @Step
    public void navigateToMyAccount(){
        homePage.open();
        homePage.clickMyAccountLink();
    }
    @Step
    public void setEmailField(String user){
        myAccountPageLogin.setEmailField(user);
    }
    @Step
    public void setPasswordField(String password){
        myAccountPageLogin.setPasswordField(password);
    }
    @Step
    public void clickLogin(){
        myAccountPageLogin.clickLoginButton();
    }
//    @Step
//    public void setLoginFields(String user ,String password){
//        myAccountPageLogin.login(user,password);


    @Step
    public void clickOrdersButton(){
        accountPage.clickOrderButton();
    }
    @Step
    public void clickViewButton(){
        accountPage.clickViewButton();
    }
    //assert
    @Step
    public void verifyOrderStatus(){
        accountPage.verifyOrderMessage();
    }
}
