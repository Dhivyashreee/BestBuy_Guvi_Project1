package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static utils.UrlConstants.HOMEPAGE_URL;

public class BestBuyTests extends BaseTest{

@Test
    public void homePageTest(){

    driver.get(url);

    homePage.usaflag.click();

}

@Test

    public void newAccountTest(){

    driver.get(HOMEPAGE_URL);
    newAccountPage.account.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Actions actions = new Actions(driver);
    actions.moveToElement(newAccountPage.createaccount).build().perform();
    newAccountPage.createaccount.click();
    newAccountPage.firstname.sendKeys("test", Keys.ENTER);
    newAccountPage.lastname.sendKeys("user", Keys.ENTER);
    newAccountPage.emailid.sendKeys("dhivyashree10.91@gmail.com", Keys.ENTER);
    newAccountPage.password.sendKeys("<Testing24>", Keys.ENTER);
    newAccountPage.repassword.sendKeys("<Testing24>", Keys.ENTER);
    newAccountPage.phonenumber.sendKeys("9940010724", Keys.ENTER);
}

@Test
public void topDealMenu(){

    driver.get(HOMEPAGE_URL);
    topdeal_menuPage.topDealMenu.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "Top Deals and Featured Offers on Electronics - Best Buy");
}

@Test

public void dealOfTheDay(){
    driver.get(HOMEPAGE_URL);
    dealOfTheDay_menuPage.dealOftheDayMenu.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "Deal of the Day: Electronics Deals - Best Buy");

}

@Test
    public void yesBestBuySellsThatMenu(){
    driver.get(HOMEPAGE_URL);
    yesBestBuySellsThatMenuPage.bestBuyMenu.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "Yes, Best Buy Sells That – Best Buy");
}

@Test
    public void myBestBuyMembershipsMenu(){

    driver.get(HOMEPAGE_URL);
    myBestBuyMemberships_menuPage.myBestBuyMenu.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "My Best Buy Memberships");

}

@Test
    public void accessibilityBottomLink(){
    driver.get(HOMEPAGE_URL);
    accessibility_bottomLinksPage.accesslink.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "Accessibility - Best Buy");

}

@Test

    public void termsAndConditions(){
    driver.get(HOMEPAGE_URL);
    termsandConditions_bottomLinkPage.termsAndConditionsLink.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "BestBuy.com Terms and Conditions");
}

@Test

    public void privacy(){
    driver.get(HOMEPAGE_URL);
    privacy_bottomLinkPage.privacy.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "Privacy Policy Hub - Best Buy");
}

@Test

    public void statePrivacyRights(){
    driver.get(HOMEPAGE_URL);
    statePrivacyRights_bottomLinkPage.statePrivacyLink.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "State Privacy Rights - Best Buy");

}


@Test

    public void interestBasedAds(){

    driver.get(HOMEPAGE_URL);
    interestBasedAds_bottomLinkPage.interestBasedAds.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title, "Interest-Based Ads - Best Buy");

}

@Test

    public void addingItemToCart(){

    driver.get(HOMEPAGE_URL);
    addingItemtoCartPage.searchbar.sendKeys("Logitech - Extreme 3D Pro Gaming Joystick - Silver/Black", Keys.ENTER);
    waitUtils.waitForVisible(driver, addingItemtoCartPage.itemname);

    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("arguments[0].scrollIntoView(true);", addingItemtoCartPage.itemname);
    jse.executeScript("arguments[0].click();", addingItemtoCartPage.itemname);

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.bestbuy.com/site/logitech-extreme-3d-pro-gaming-joystick-silver-black/5796515.p?skuId=5796515");

    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true);", addingItemtoCartPage.scrollelement);

    addingItemtoCartPage.addtocart.click();

}

}
