import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YouTubePesma {

    public static void main(String[] args) {

        String pesma = "Queen Bohemian Rhapsody"; // pesmu po izboru

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.youtube.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement search = wait.until(
                ExpectedConditions.elementToBeClickable(By.name("search_query")));
        search.sendKeys(pesma);
        search.sendKeys(Keys.ENTER);

        WebElement prviVideo = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("ytd-video-renderer a#video-title")));
        prviVideo.click();

    }
}
