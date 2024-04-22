package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Topdeal_MenuPage {
    ChromeDriver driver;

    public Topdeal_MenuPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
@FindBy(linkText = "Top Deals")
    public WebElement topDealMenu;


}
