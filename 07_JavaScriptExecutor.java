import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class AliExpressJavaScriptExecutor {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.aliexpress.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 500)");

        WebElement searchBox = driver.findElement(By.name("SearchText"));
        js.executeScript("arguments[0].value='smartphone'", searchBox);

        WebElement searchButton = driver.findElement(By.cssSelector("input[type='submit']"));
        js.executeScript("arguments[0].click();", searchButton);

        String title = (String) js.executeScript("return document.title;");
        System.out.println("Page Title: " + title);

        Thread.sleep(5000);
        driver.quit();
    }
}

