import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wordpress {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.wordpress.com");

        WebElement practiceButton = driver.findElement(By.cssSelector(".lohpx-btn.is-cta.lp-record-click.lp-cta-hero-get-started"));
        practiceButton.click();



        WebElement usernameField = driver.findElement(By.id("signup-email"));
        //WebElement passwordField = driver.findElement(By.id("password"));
        //WebElement submitButton = driver.findElement(By.id("submit"));

        String validUsername = "offersaved@gmail.com";
        //String validPassword = "Password123";

        usernameField.clear();
        usernameField.sendKeys(validUsername);
        usernameField.click();

        /*passwordField.clear();
        passwordField.sendKeys(validPassword);

        submitButton.click();

         */

    }
}
