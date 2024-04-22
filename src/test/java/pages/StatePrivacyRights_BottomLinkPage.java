package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatePrivacyRights_BottomLinkPage {
    ChromeDriver driver;

    public StatePrivacyRights_BottomLinkPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "State Privacy Rights")
    public WebElement statePrivacyLink;
}
