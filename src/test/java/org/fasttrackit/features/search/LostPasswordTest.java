package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.BaseTest;
import org.fasttrackit.Utils.EnvironmentConstats;
import org.fasttrackit.steps.serenity.LostPasswordSteps;
import org.junit.Test;

public class LostPasswordTest extends BaseTest {

    @Steps
    private LostPasswordSteps lostPasswordSteps;

    @Test
    public void resetLostPassword(){
        lostPasswordSteps.navigateToMyAccountPageLogin();
        lostPasswordSteps.clickLostYourPasswordLink();
        lostPasswordSteps.setUserNameEmail(EnvironmentConstats.USER_EMAIL);
        lostPasswordSteps.clickResetPassButton();
        //assert
        lostPasswordSteps.resetMsgIsDisplayed();
    }
}
