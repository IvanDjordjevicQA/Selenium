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

    @Test(priority = 1)
    public void addBookToCart() {
        WebElement itemName = driver.findElement(By.id("productTitle"));
        String itemNameText = itemName.getText();

        WebElement cartNumber = driver.findElement(By.id("nav-cart-count"));
        Assert.assertEquals(cartNumber.getText(), "0");

        cartNumber.click();

        WebElement emptyCart = driver.findElement(By.id("sc-empty-cart"));
        Assert.assertTrue(emptyCart.isDisplayed());

        driver.navigate().back();

        // Dodajem knjigu u korpu
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        // Proveravam da li je dodato nesto u korpu i da li se broj promenio sa 0 na 1
        WebElement addedToCartMessage = driver.findElement(By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS"));
        Assert.assertTrue(addedToCartMessage.isDisplayed());
        cartNumber = driver.findElement(By.id("nav-cart-count"));
        Assert.assertEquals(cartNumber.getText(), "1");
        cartNumber.click();

        // Sad proveravam da li sam dodao bas tu knjigu u korpu
        WebElement itemNameInCart = driver.findElement(By.className("a-truncate-cut"));
        Assert.assertEquals(itemNameInCart.getText(), itemNameText);
    }

    @Test(priority = 2)

    @AfterMethod
    public void afterMethod() {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}