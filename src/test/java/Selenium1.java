import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        // u ovoj komandi postavljam driver

        //kreiramo objekat kom cu davati komande
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com"); // malo sigurnije od ispd tj get("..."); , radi u 100%
        //driver.get("https://www.google.com"); // radice u 99% slucajeva

        driver.manage().window().maximize();

        //stampanje u konzoli trenutnu stranicu
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://www.youtube.com");

        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        //zatvaramo browaer
        driver.quit();

    }
}
