package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.BaseTest;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validCredentialsRegisterTest(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.register("fdattrrasssdf@sda3da.com","velar2ds1234d5789asaaaa");

        //assert
        registerSteps.verifiyHello();
    }
    @Test
    public void invalidCredentialsRegisterTest(){
        registerSteps.navigateToMyAccountPage();
        registerSteps.setRegEmail("petervlad@yahoocom");
        registerSteps.setRegPassword("Cucu123123123655123123");
        registerSteps.clickRegister();
        //assert
        registerSteps.verifyInvalidEmailAddress("Error: Please provide a valid email address.");
    }
}
