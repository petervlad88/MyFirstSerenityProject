package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.BaseTest;
import org.fasttrackit.Utils.EnvironmentConstats;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



public class SearchTest extends BaseTest {


    @Steps
    private SearchSteps searchSteps;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void searchProductTestWithLogedinUser(){
        loginSteps.navigateToMyAccountLink();
        loginSteps.setEmail(EnvironmentConstats.USER_EMAIL);
        loginSteps.setPassword(EnvironmentConstats.USER_PASSWORD);
        loginSteps.clickLogin();
        searchSteps.setSearchProductName("Beanie");
        searchSteps.clickSearch();

    }
    @Test
    public void searchExistentProduct(){
        searchSteps.setSearchProductName("Beanie");
        searchSteps.clickSearch();
//        searchSteps.search("Beanie");

        //ASSERT
        searchSteps.verifySearchResults("“BEANIE”");
    }




}
