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
public class WithConfigurationTest {

    private BrowserGetter browserGetter = new BrowserGetter();
    //private WebDriver driver;
    WebDriver driver = new ChromeDriver();

    @BeforeAll
    public void beforeAll(){
        driver = browserGetter.getDriver(); //open browser
    }

    @AfterAll
    public void afterAll(){
        driver.quit();
    }

    @Test
    public void justATest(){
        driver.get("https://www.example.com");
        assertEquals("Example Domain", driver.getTitle());

    }
}
