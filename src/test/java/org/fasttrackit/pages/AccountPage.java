package org.fasttrackit.pages;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;


//assert

public class AccountPage extends PageObject {

    @FindBy(css = "#post-7 > div > div > div > div > div > p:nth-child(1) > strong:nth-child(1)")
    private WebElementFacade helloMsg;

    @FindBy(css = "p:nth-child(1)")
    private WebElementFacade helloMessageRegister;

    @FindBy(css = ".woocommerce li:nth-child(2) a")
    private WebElementFacade ordersButton;

    @FindBy(css = ".woocommerce-button")
    private WebElementFacade viewButton;

    //assert
    @FindBy(css = ".woocommerce-MyAccount-content p:first-child")
    private WebElementFacade confirmOrderMessage;


    public void verifyHelloMsg(String userName) {
        helloMsg.shouldContainText(userName);

    }

        public void verifyHelloMessage(){
            Assert.assertTrue(helloMessageRegister.isDisplayed());
    }

    public void clickOrderButton(){
        clickOn(ordersButton);

    }
    public void clickViewButton(){
        clickOn(viewButton);
    }
    //assert
    public void verifyOrderMessage(){
        Assert.assertEquals("Order #652 was placed on March 17, 2021 and is currently On hold.",confirmOrderMessage.getText());
    }
}
