package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingItemtoCartPage {

    ChromeDriver driver;

    public AddingItemtoCartPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "gh-search-input")
    public WebElement searchbar;

    @FindBy(tagName = "strong")
    public WebElement scrollelement;

    @FindBy(partialLinkText = "Logitech - Extreme 3D Pro Gaming Joystick - Silver/Black")
    public WebElement itemname;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    public WebElement  addtocart;

}
