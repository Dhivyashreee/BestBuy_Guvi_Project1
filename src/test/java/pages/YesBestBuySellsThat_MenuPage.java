package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YesBestBuySellsThat_MenuPage {
    ChromeDriver driver;

    public YesBestBuySellsThat_MenuPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Yes, Best Buy Sells That")
    public WebElement bestBuyMenu;

}
