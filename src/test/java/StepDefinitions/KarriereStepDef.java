package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KarriereStepDef  {
    DialogContent dc = new DialogContent();
    @When("Click Mehr and Karriere")
    public void clickMehrAndKarriere() {
        dc.clickFunction(dc.AlleAkzeptieren);
        dc.clickFunction(dc.karrierMoglichen);
    }

    @And("Go to the Software Engineering Page")
    public void goToTheSoftwareEngineeringPage() {
        dc.clickFunction(dc.softwareEngineer);


    }

    @And("Click Software Tester \\(QA)")
    public void clickSoftwareTesterQA() {
        dc.clickFunction(dc.softWareTester);
    }

    @Then("Verify the authenticity of the page")
    public void verifyTheAuthenticityOfThePage() {
    }
}
