package Pages;

import Settings.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {

    private WebDriver driver;
    public LoginPage(WebDriver driver){this.driver = driver; }

    By signInButtonLocator = By.id("send2");
    By inputEmailLocator = By.id("email");
    By inputPasswordLocator = By.id("pass");
    By emailTitleLocator = By.cssSelector("#login-form > fieldset > div.field.email.required > label");
    By passwordTitleLocator = By.cssSelector("#login-form > fieldset > div.field.password.required > label");

    public void inputEmail(String email){
        WebElement login = driver.findElement(inputEmailLocator);
        login.click();
        login.sendKeys(email);
    }

    public void inputPassword(String password){
        WebElement login = driver.findElement(inputPasswordLocator);
        login.click();
        login.sendKeys(password);
    }

    public void clickSignInButton (){
        driver.findElement(signInButtonLocator).click();
    }

    //Login fields are filling and click SIGN IN button
    public void login (String userEmail, String userPassword) {
        inputEmail(userEmail);
        inputPassword(userPassword);
        clickSignInButton();
    }

    public  void assertEmailTitle(){
        Assert.assertEquals("Wrong EmailTitle", driver.findElement(emailTitleLocator).getText(), "Email");
        System.out.println("*Email field title_OK*");
    }
    public  void assertPasswordTitle(){
        Assert.assertEquals("Wrong PasswordTitle", driver.findElement(passwordTitleLocator).getText(), "Password");
        System.out.println("*Password field title_OK*");
    }

}
