package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.BaseTest;
import org.fasttrackit.steps.serenity.ShopSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



public class ShopTest extends BaseTest {


    @Steps
    private ShopSteps shopSteps;

    @Test
    public void openProduct(){
      shopSteps.openShopCategory();
      shopSteps.openProduct();
//      shopSteps.openProductDescription();

        //assert
        shopSteps.verifyProductDescription();
    }
    @Test
    public void sortByDate(){
        shopSteps.openShopCategory();
        shopSteps.clickOnSortingByDate();

        //assert
        shopSteps.verifyFirstProductNameWasChanged();
    }

}
