import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class S2Zadatak1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");


        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");

        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(listaTabova.get(1));

        driver.navigate().to("https://www.youtube.com");

        driver.switchTo().window(listaTabova.get(2));

        driver.navigate().to("https://www.facebook.com");

        driver.switchTo().window(listaTabova.get(3));

        driver.navigate().to("https://www.instagram.com");

        driver.switchTo().window(listaTabova.get(4));

        driver.navigate().to("https://www.linkedin.com");

        driver.switchTo().window(listaTabova.get(5));

        driver.navigate().to("https://www.joberty.com");

        driver.switchTo().window(listaTabova.get(0)).close();




    }
}
