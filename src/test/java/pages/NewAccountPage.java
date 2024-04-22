package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
    ChromeDriver driver;

    public NewAccountPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")

    public WebElement account;

    @FindBy(linkText = "Create Account")
    public WebElement createaccount;

    @FindBy(name = "firstName")
            public WebElement firstname;

    @FindBy(name = "lastName")
    public WebElement lastname;

    @FindBy(name = "email")
    public WebElement emailid;

    @FindBy(name = "fld-p1")
    public WebElement password;

    @FindBy(name = "reenterPassword")
    public WebElement repassword;

    @FindBy(name = "phone")
    public WebElement phonenumber;


}

