import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class Herokuapp {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement startDugme = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("#start button")));
        startDugme.click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));

        WebElement rezultat = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));

        assertTrue(rezultat.isDisplayed(), "Tekst treba da bude vidljiv");
        assertEquals("Hello World!", rezultat.getText(), "Tekst nije očekivani");
    }
}
