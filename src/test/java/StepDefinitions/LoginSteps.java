package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
    @Given("Navigate to IBM HomePages")
    public void navigateToIBMHomePages() {
        GWD.getDriver().get("");
    }

    @And("Click members button")
    public void clickMembersButton() {
        
    }

    @And("Click MyIBM Button")
    public void clickMyIBMButton() {
        
    }

    @And("put IBMid and click Box")
    public void putIBMidAndClickBox() {
        
    }


    @And("click continue btn")
    public void clickContinueBtn() {
        
    }

    @And("Put Password")
    public void putPassword() {
        
    }

    @And("click Sign in")
    public void clickSignIn() {
        
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
    }
}
