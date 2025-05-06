
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class AlertHandlingExample {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Alert Text: " + alert1.getText());
        alert1.accept();

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("AliExpress Test");
        alert3.accept();

        Thread.sleep(3000);
        driver.quit();
    }
}
