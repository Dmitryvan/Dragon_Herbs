package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Settings.Base;
import org.junit.Test;

public class Login extends Base {

    //Field titles checking
    @Test
    public void assertTitles() throws InterruptedException{
        HomePage homepage = new HomePage(driver);
        homepage.clickSignIn();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.assertEmailTitle();
        loginpage.assertPasswordTitle();
    }

    //login
    @Test
    public void login() throws InterruptedException{
        HomePage homepage = new HomePage(driver);
        homepage.clickSignIn();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.login(userEmail, userPassword);
        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.clickSignOut();
        System.out.println("*LOGIN_OK*");
    }
}
