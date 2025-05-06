import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class AliExpressDropdownAutomation {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.aliexpress.com/");

        WebElement languageBtn = driver.findElement(By.cssSelector("div[data-role='region-picker']"));
        languageBtn.click();

        Thread.sleep(2000);

        WebElement countryDropdown = driver.findElement(By.id("region-select"));
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText("United States");

        WebElement currencyDropdown = driver.findElement(By.id("currency-select"));
        Select currencySelect = new Select(currencyDropdown);
        currencySelect.selectByVisibleText("USD");

        WebElement saveBtn = driver.findElement(By.cssSelector("button[ae_button_type='primary']"));
        saveBtn.click();

        Thread.sleep(5000);
        driver.quit();
    }
}

