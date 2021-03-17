package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.BaseTest;
import org.fasttrackit.Utils.EnvironmentConstats;
import org.fasttrackit.steps.serenity.OrderDetailsSteps;
import org.junit.Test;

public class OrdersStatusTest extends BaseTest {

    @Steps
    private OrderDetailsSteps orderDetailsSteps;

    @Test
    public void OrderDetails(){
        orderDetailsSteps.navigateToMyAccount();
        orderDetailsSteps.setEmailField(EnvironmentConstats.USER_EMAIL);
        orderDetailsSteps.setPasswordField(EnvironmentConstats.USER_PASSWORD);
        orderDetailsSteps.clickLogin();
//      orderDetailsSteps.setLoginFields(EnvironmentConstats.USER_EMAIL,EnvironmentConstats.USER_PASSWORD);
        orderDetailsSteps.clickOrdersButton();
        orderDetailsSteps.clickViewButton();

        //assert
        orderDetailsSteps.verifyOrderStatus();

    }
}
