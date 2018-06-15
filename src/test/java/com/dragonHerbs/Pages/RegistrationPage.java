package com.dragonHerbs.Pages;

import com.dragonHerbs.Settings.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends Base {

    private WebDriver driver;

    public RegistrationPage(WebDriver driver){this.driver = driver; }

    By createAccountLocator = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div[2]/div/div/a");
    By firstNameFieldLocator = By.id("firstname");
    By lastNameFieldLocator = By.id("lastname");
    By emailFieldLocator = By.id("email_address");
    By passwordFieldLocator = By.id("password");
    By passwordConfFieldLocator = By.id("password-confirmation");
    By createAnAccountLocator = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");


    public void createAccountButton() {
        driver.findElement(createAccountLocator).click();
    }

    public void inputFirstName(String firstName){
        WebElement login = driver.findElement(firstNameFieldLocator);
        login.click();
        login.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        WebElement login = driver.findElement(lastNameFieldLocator);
        login.click();
        login.sendKeys(lastName);
    }

    public void inputEmailField(String emailField){
        WebElement login = driver.findElement(emailFieldLocator);
        login.click();
        login.sendKeys(emailField);
    }

    public void inputPasswordField(String passwordField){
        WebElement login = driver.findElement(passwordFieldLocator);
        login.click();
        login.sendKeys(passwordField);
    }

    public void inputPasswordConfField(String passwordConfField){
        WebElement login = driver.findElement(passwordConfFieldLocator);
        login.click();
        login.sendKeys(passwordConfField);
    }

    public void clickAnAccountButton(){
        driver.findElement(createAnAccountLocator).click();
    }
}