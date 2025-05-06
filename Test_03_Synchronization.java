
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AliExpressSynchronizationDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Implicit Wait - applied globally
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.aliexpress.com");
        driver.manage().window().maximize();

        // Explicit Wait - applied to specific element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement searchBar = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='search']"))
        );
        searchBar.sendKeys("smart watch");

        WebElement searchButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("button.search-button"))
        );
        searchButton.click();

        // Static wait (Thread.sleep) - generally discouraged but sometimes used for demo
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
