import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://dfd.com");


        //scrola na element koji se u potpunosti ne pokazuje na stranici, zaglavljen footerom u primeru
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cards.get(i));

    }
}
