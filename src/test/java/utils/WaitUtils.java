package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    public static WebDriverWait wait;

    public static void waitForVisible(ChromeDriver driver, WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForInVisible(ChromeDriver driver, WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

}
