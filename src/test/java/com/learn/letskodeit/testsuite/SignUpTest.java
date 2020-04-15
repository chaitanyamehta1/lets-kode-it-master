package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.SignUpPage;
import com.learn.letskodeit.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Chaitanya
 */
//sign up test class extends with test base class
public class SignUpTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToSignUpPage(){
        //below methods calling from pages package
        homePage.clickOnSignUpLink();
        //compare expected with actual result
        String expectedResult = "Sign Up to Let's Kode It";
        String actualResult = signUpPage.getSignUpText();
        Assert.assertEquals(expectedResult,actualResult);

//        SoftAssert sa = new SoftAssert();
//        sa.assertTrue(signUpPage.getSignUpText().contains("Sign Up to Let's Kode It"));
//
//        Assert.assertTrue(signUpPage.getSignUpText().contains("Sign Up to Let's Kode It"));


    }
}
