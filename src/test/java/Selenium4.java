import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.bing.com");

        Thread.sleep(3000);

        //driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[1]/textarea")).sendKeys("ITBootcamp");
        //driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[1]/textarea")).sendKeys(Keys.ENTER);


        //objekat web elementa
        //QA gleda da se kod ne ponavlja
        //Zato i pojednostavljamo pozivom elementa
        //Za svaki element NAPravi objekat u buduce
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[1]/textarea"));
        searchBox.sendKeys("ITBootcamp");
        searchBox.sendKeys(Keys.ENTER);

        // ------------------------

        // --- LOKATORI ILI SELEKTORI --- //
        // ID, Name, CLass, CSS, LInk text, Tag name, (Relative path, absolute path)-koristili smo gore

        //Mora prolazimo kroz HTML i da trazemio "elemente"
        //Svaki lokator se prosledjuje kao string



    }
}
