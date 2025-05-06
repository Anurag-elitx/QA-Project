
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AliExpressCssSelectorDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com");
        driver.manage().window().maximize();

        WebElement searchBar = driver.findElement(By.cssSelector("input[type='search']"));
        WebElement searchButton = driver.findElement(By.cssSelector("button.search-button"));
        WebElement categoryLink = driver.findElement(By.cssSelector("a[href*='electronics']"));
        WebElement bannerImage = driver.findElement(By.cssSelector("img[alt='Main Banner']"));
        WebElement footer = driver.findElement(By.cssSelector("footer"));

        searchBar.sendKeys("smart watch");
        searchButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
