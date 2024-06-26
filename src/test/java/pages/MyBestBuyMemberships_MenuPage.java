package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBestBuyMemberships_MenuPage {
    ChromeDriver driver;

    public MyBestBuyMemberships_MenuPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "My Best Buy Memberships")
    public WebElement myBestBuyMenu;

}
