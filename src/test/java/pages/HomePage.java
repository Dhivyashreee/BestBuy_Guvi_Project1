package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg']")
    public WebElement usaflag;



}
