import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Zadatak9 {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        WebElement popupButton = driver.findElement(By.cssSelector("button[type='submit']"));
        popupButton.click();

        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
    }

    @Test
    public void userCanLogIn() {
        WebElement itemName = driver.findElement(By.id("productTitle"));
        String itemNameText = itemName.getText();

        WebElement cartNumber = driver.findElement(By.id("nav-cart-count"));
        Assert.assertEquals(cartNumber.getText(), "0");




    }

    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}