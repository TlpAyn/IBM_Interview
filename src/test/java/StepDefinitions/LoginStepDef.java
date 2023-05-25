package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDef {
DialogContent dc = new DialogContent();
    @Given("Navigate to IBM HomePages")
    public void navigateToIBMHomePages() {
        GWD.getDriver().get("https://www.ibm.com/de-de");
        GWD.getDriver().manage().window().maximize();
    }

    @And("Click members button")
    public void clickMembersButton() {
        dc.clickFunction(dc.userBtn);

    }

    @And("Click MyIBM Button")
    public void clickMyIBMButton() {
        dc.clickFunction(dc.meineIbm);
    }

    @And("put IBMid and click Box")
    public void putIBMidAndClickBox() {
        dc.sendKeysFunction(dc.username,"talipayan6035@gmail.com");

    }

    @And("click continue btn")
    public void clickContinueBtn() {
        dc.clickFunction(dc.continueBtn);
    }

    @And("Put Password")
    public void putPassword() {
        dc.sendKeysFunction(dc.password,"Talipx424...");
    }

    @And("click Sign in")
    public void clickSignIn() {
        dc.clickFunction(dc.signinbutton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

    }
}
