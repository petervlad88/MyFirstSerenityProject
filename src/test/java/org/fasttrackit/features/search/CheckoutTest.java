package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.BaseTest;
import org.fasttrackit.Utils.EnvironmentConstats;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Steps
    private CheckoutSteps checkoutSteps;


    @Test
    public void checkoutProduct(){
        checkoutSteps.openShopCategory();
        checkoutSteps.clickAddToCartBtn();
        checkoutSteps.clickShopCartLink();
        checkoutSteps.clickProceedToCheckoutBtn();
        checkoutSteps.setFirstName("Cucu");
        checkoutSteps.setLastName("Bau");
        checkoutSteps.setAddress("Cluj,strada Avram Iancu nr,12");
        checkoutSteps.setCityName("Cluj-Napoca");
        checkoutSteps.setPostCode("400000");
        checkoutSteps.setPhoneNumber("052 5446");
        checkoutSteps.setEmail(EnvironmentConstats.USER_EMAIL);
        checkoutSteps.clickPlaceOrderBtn();
        //assert
        checkoutSteps.verifyReceivedOrderMsg();

    }
}
