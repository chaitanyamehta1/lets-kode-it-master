package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.LoginPage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
//login test class extends with test base class
public class LoginTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(groups = {"sanity","smoke"})
    public void verifyUserCanNavigateToLoginPage() {
        //below methods calling from pages package
        homePage.clickOnLogin();
        //compare expected with actual result
        String expectedResult = "Log In to Let's Kode It";
        String actualResult = loginPage.getLoginWelcomeMessage();
        Assert.assertEquals(expectedResult,actualResult);
    }

}
