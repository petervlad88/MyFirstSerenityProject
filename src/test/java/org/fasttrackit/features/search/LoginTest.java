package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.BaseTest;
import org.fasttrackit.Utils.EnvironmentConstats;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



public class LoginTest extends BaseTest {


    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToMyAccountLink();
        loginSteps.setEmail(EnvironmentConstats.USER_EMAIL);
        loginSteps.setPassword(EnvironmentConstats.USER_PASSWORD);
        loginSteps.clickLogin();

//        loginSteps.login(EnvironmentConstats.USER_EMAIL,EnvironmentConstats.USER_PASSWORD);

        //assert
        loginSteps.verifyHello("peter_vlad88");
    }
    @Test
    public void loginWitInvalidCredentials(){
        loginSteps.navigateToMyAccountLink();
        loginSteps.setEmail(EnvironmentConstats.USER_EMAIL);
        loginSteps.setPassword("vlad");
        loginSteps.clickLogin();
        //assert
        loginSteps.verifyInvalidPasswordMessage("ERROR: The password you entered for the email address peter_vlad88@yahoo.com is incorrect. Lost your password?");
    }
    @Test
    public void loginWithEmptyFields(){
        loginSteps.navigateToMyAccountLink();
        loginSteps.setEmail("");
        loginSteps.setPassword("");
        loginSteps.clickLogin();
        //assert
        loginSteps.verifyErrorMessageForEmptyFields();
    }


}
