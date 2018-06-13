package Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Base {

    protected WebDriver driver;

    protected String userEmail = "van777dim@gmail.com";
    protected String userPassword = "0679982026Dfyby";

    protected String firstName = "Autotest";
    protected String lastName = "Bot";
    protected String emailField = "bulurut@larjem.com";
    protected String passwordField = "12345Qwerty";
    protected String passwordConfField = "12345Qwerty";



    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://staging.dragonherbs.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    @After
//    public void tearDown(){
//        driver.close();
//    }
}
