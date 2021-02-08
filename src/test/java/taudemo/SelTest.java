package taudemo;

import browser.BrowserGetter;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class SelTest {

//    public static class invokegoogle {
//
//        public static void main(String[] args) {
//            // TODO Auto-generated method stub
//
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ilona.Haradzetskaya\\Downloads\\chromedriver.exe");
//            WebDriver driver=new ChromeDriver();
//            driver.get("https://www.example.com");
//
//        }
//
//    }
    private BrowserGetter browserGetter = new BrowserGetter();
    //private WebDriver driver;
    WebDriver driver = new ChromeDriver();

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void openTheComPageAndCheckTheTitle() {
        String ExpectedComTitle = "Example Domain";  //create var holding an expected value
        driver.get("https://www.example.com"); // open page where i need to read this properties
        assertEquals(ExpectedComTitle, driver.getTitle()); //use assert-s to compare an expected and actual value

    }

    @Test
    public void openTheOrgPageAndCheckTheTitle() {
        String expectedOrgTitle = "Example Domain";  //create var holding an expected value
        driver.get("https://www.example.org"); // open page where i need to read this propertie
        assertEquals(expectedOrgTitle, driver.getTitle()); //use assert-s to compare an expected and actual value

    }
}
