import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AliExpressXPathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com");
        driver.manage().window().maximize();

        WebElement searchBar = driver.findElement(By.xpath("//input[@type='search']"));
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@class,'search-button')]"));
        WebElement categoryLink = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
        WebElement bannerImage = driver.findElement(By.xpath("//img[@alt='Main Banner']"));
        WebElement footer = driver.findElement(By.xpath("//footer"));

        searchBar.sendKeys("smart watch");
        searchButton.click();

        Thread.sleep(5000);

        driver.quit();
    }
}
