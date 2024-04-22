package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealOfTheDay_MenuPage {
    ChromeDriver driver;

    public DealOfTheDay_MenuPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Deal of the Day")
    public WebElement dealOftheDayMenu;

}
