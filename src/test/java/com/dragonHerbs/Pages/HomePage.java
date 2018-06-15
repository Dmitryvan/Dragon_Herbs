package com.dragonHerbs.Pages;

import com.dragonHerbs.Settings.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {
    private WebDriver driver;
    public HomePage(WebDriver driver){this.driver = driver; }

    By signInLocator = By.xpath("/html/body/div[1]/div[1]/div[1]/div/ul/li[1]/a");

    public void clickSignIn (){
        driver.findElement(signInLocator).click();
    }

}
