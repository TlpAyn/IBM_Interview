package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() { PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(xpath = "//*[@slot='profile'] ")
    public WebElement userBtn;
    @FindBy(xpath = "(//dds-masthead-profile-item[@role='listitem'])[1]")
    public WebElement meineIbm;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "continue-button")
    public WebElement continueBtn;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "signinbutton")
    public WebElement signinbutton;
    @FindBy(linkText = "IBMid: talipayan6035@gmail.com")
    public WebElement IbmText;




}
