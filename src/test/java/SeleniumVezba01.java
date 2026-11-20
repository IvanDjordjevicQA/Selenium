import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumVezba01 {

    public static void main(String[] args) throws InterruptedException {

        //Postavljamo driver - Chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.bing.com");

        //Pretraga u Browser-u
        Thread.sleep(3000);


        //otvaramo browher BING u search -> desni klik inspect
        // u navodnicima stavljamo xPath koji smo kopirali sa Bing-a
        // U send keys -> stavljamo sta pretrazujemo u search BAR-u

        driver.findElement(By.xpath("")).sendKeys("ITbootcamp");
        //Ovako otvaramo pretragu otvaramo klikcemo ENTER
        driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        // LOKATORI
        //LOCIRAMO preko Inspect A tag
        driver.findElement(By.xpath("iz inspecta")).click();




    }
}
