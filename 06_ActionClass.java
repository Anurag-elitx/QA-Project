
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class AliExpressAdvancedActions {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.aliexpress.com/");

        Actions actions = new Actions(driver);

        WebElement searchBox = driver.findElement(By.name("SearchText"));

        actions.moveToElement(searchBox).click().perform();
        actions.sendKeys("laptop").perform();
        actions.sendKeys(Keys.ENTER).perform();

        Thread.sleep(5000);

        WebElement logo = driver.findElement(By.cssSelector("a[title='AliExpress']"));
        actions.contextClick(logo).perform(); // right-click on logo

        Thread.sleep(2000);

        actions.doubleClick(searchBox).perform(); // double-click in search

        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); // Ctrl + A

        Thread.sleep(3000);
        driver.quit();
    }
}
