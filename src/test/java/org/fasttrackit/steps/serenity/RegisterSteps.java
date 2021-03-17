package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPageLogin;
import org.fasttrackit.pages.MyAccountPageRegister;

public class RegisterSteps {

    private HomePage homePage;
    private MyAccountPageRegister myAccountPageRegister;
    private AccountPage accountPage;


    @Step
    public void navigateToMyAccountPage() {

        homePage.open();
        homePage.clickMyAccountLink();

    }

    @Step
    public void setRegEmail(String email) {
        myAccountPageRegister.setRegEmailField(email);
    }

    @Step
    public void setRegPassword(String password) {
        myAccountPageRegister.setRegPasswordField(password);
    }

    @Step
    public void clickRegister() {
        myAccountPageRegister.clickRegButton();
    }

    @Step
    public void register(String user, String password) {
        setRegEmail(user);
        setRegPassword(password);
        clickRegister();
    }

    //assert
    @Step
    public void verifyInvalidEmailAddress(String invalidEmail) {
        myAccountPageRegister.verifyErrorMessage(invalidEmail);

    }
    //assert
    @Step("Verify if Hello message is displayed after register")
    public void verifiyHello(){
        accountPage.verifyHelloMessage();

    }
}
