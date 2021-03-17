package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LostPasswordPage;
import org.fasttrackit.pages.MyAccountPageLogin;

public class LostPasswordSteps {

    private HomePage homepage;
    private MyAccountPageLogin myAccountPageLogin;
    private LostPasswordPage lostPasswordPage;

    @Step
    public void navigateToMyAccountPageLogin(){
        homepage.open();
        homepage.clickMyAccountLink();
    }
    @Step
    public void clickLostYourPasswordLink(){
        myAccountPageLogin.clickLostYourPassword();
    }
    @Step
    public void setUserNameEmail(String username){
        lostPasswordPage.setUsernameOrEmailField(username);
    }
    @Step
    public void clickResetPassButton(){
        lostPasswordPage.clickResetButton();
    }
    //assert
    @Step
    public void resetMsgIsDisplayed(){
        lostPasswordPage.resetMessage();
    }


}
