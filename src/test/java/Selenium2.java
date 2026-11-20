import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Selenium2 {

    public static void main(String[] args) {

        //ovo uvek otkucaj i proveri pre ostalog koda
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");

        //javascript executor
        //koristimo za otvaranje tabova i scrol na neki element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // za scriptu open() ne prijavljuje gresku ali ne otvara tab
        js.executeScript("window.open()");
        //visestruko otvaranje tabova
        js.executeScript("window.open()");
        js.executeScript("window.open()");

        driver.navigate().to("https://youtube.com");

        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());

        //otvaranje taova u drugom tabu
        driver.switchTo().window(listaTabova.get(1));

        driver.navigate().to("https://www.linkedin.com");

        driver.switchTo().window(listaTabova.get(2));

        driver.navigate().to("https://joberty.com");

        driver.switchTo().window(listaTabova.get(3));

        driver.navigate().to("https://www.google.com");

        //zatvarimo neki (jedan poslednji tab - trenutni tab) tab
        driver.close();








    }
}
