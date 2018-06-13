package Pages;

import Settings.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends Base {
    private WebDriver driver;
    public MyAccountPage (WebDriver driver){this.driver = driver; }

    By myAccountLocator = By.xpath("/html/body/div[1]/div[1]/div[1]/div/ul/li[1]/span/span");
    By signOutLocator = By.xpath("/html/body/div[1]/div[1]/div[1]/div/ul/li[1]/div/ul/li[4]/a");

    public void clickMyAccount (){
        driver.findElement(myAccountLocator).click();
    }

    public void clickSignOut (){
        driver.findElement(myAccountLocator).click();
        driver.findElement(signOutLocator).click();
    }
}
