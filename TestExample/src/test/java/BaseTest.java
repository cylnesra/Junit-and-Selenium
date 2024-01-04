import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","/home/samet/project/chromeDriver/chromedriver");
    }

    @BeforeEach
    public void beforMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

//    @AfterAll
//    public void tearDown(){
//        driver.quit();
//    }


}
