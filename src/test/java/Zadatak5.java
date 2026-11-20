import org.testng.annotations.*;

public class Zadatak5 {

    // Zadatak 5
    // Napisati jednom na pocetku "Dobrodosli na kurs"
    // Napisati pre svakog testa "Ucim za test"
    // Napisati tri test metode - u prvoj odstampati "SQL"
    // u drugom odstampati "Java"
    // u trecem odstampati "Selenium"
    // Nakon svakog testa ispisati "Polozen test"
    // Na kraju ispisati "Polozen kurs"

    @BeforeTest
    public void samPocetak() {
        System.out.println("Dobrodosli na kurs");
    }

    @BeforeMethod
    public void beforeTest() {
        System.out.println("Ucim za test");
    }



    @Test(priority = 1)
    public void prviTest() {
        System.out.println("SQL");
    }

    @Test(priority = 2)
    public void drugiTest() {
        System.out.println("Java");
    }

    @Test(priority = 3)
    public void treciTest() {
        System.out.println("Selenium");
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("Polozen test");
    }

    @AfterTest // ovo je za sam kraj
    public void forTheEnd() {
        System.out.println("Polozen kurs");
    }




}
