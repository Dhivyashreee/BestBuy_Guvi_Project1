package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.QaProps;
import utils.WaitUtils;

public class BaseTest {
    ChromeDriver driver;

    ChromeOptions options;
    HomePage homePage;
            NewAccountPage newAccountPage;
            Topdeal_MenuPage topdeal_menuPage;
    YesBestBuySellsThat_MenuPage yesBestBuySellsThatMenuPage;
            MyBestBuyMemberships_MenuPage myBestBuyMemberships_menuPage;
    DealOfTheDay_MenuPage dealOfTheDay_menuPage;
            Accessibility_BottomLinksPage accessibility_bottomLinksPage;
    StatePrivacyRights_BottomLinkPage statePrivacyRights_bottomLinkPage;
            Privacy_BottomLinkPage privacy_bottomLinkPage;
    InterestBasedAds_BottomLinkPage interestBasedAds_bottomLinkPage;
            TermsandConditions_BottomLinkPage termsandConditions_bottomLinkPage;
    AddingItemtoCartPage addingItemtoCartPage;

    WaitUtils waitUtils;

            String url;

@BeforeMethod
public void setUp(){

    WebDriverManager.chromedriver().setup();
    options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    driver = new ChromeDriver();

    homePage = new HomePage(driver);
     newAccountPage = new NewAccountPage(driver);
     topdeal_menuPage = new Topdeal_MenuPage(driver);
     yesBestBuySellsThatMenuPage = new YesBestBuySellsThat_MenuPage(driver);
     myBestBuyMemberships_menuPage = new MyBestBuyMemberships_MenuPage(driver);
    dealOfTheDay_menuPage = new DealOfTheDay_MenuPage(driver);
    accessibility_bottomLinksPage = new Accessibility_BottomLinksPage(driver);
    statePrivacyRights_bottomLinkPage = new StatePrivacyRights_BottomLinkPage(driver);
    privacy_bottomLinkPage = new Privacy_BottomLinkPage(driver);
    interestBasedAds_bottomLinkPage = new InterestBasedAds_BottomLinkPage(driver);
    termsandConditions_bottomLinkPage = new TermsandConditions_BottomLinkPage(driver);
    addingItemtoCartPage = new AddingItemtoCartPage(driver);
    waitUtils = new WaitUtils();


    driver.get("https://www.bestbuy.com/");
    driver.manage().window().maximize();
    QaProps.init();
    url = QaProps.getProperty("url");

}

@AfterMethod

    public void tearDown(){
    driver.quit();
}
}
