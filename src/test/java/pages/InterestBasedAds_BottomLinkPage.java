package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterestBasedAds_BottomLinkPage {
    ChromeDriver driver;

    public InterestBasedAds_BottomLinkPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Interest-Based Ads")
    public WebElement interestBasedAds;

}
