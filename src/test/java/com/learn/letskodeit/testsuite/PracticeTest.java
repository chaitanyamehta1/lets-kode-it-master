package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.PracticePage;
import com.learn.letskodeit.testbase.TestBase;
import com.learn.letskodeit.utility.Utility;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by Chaitanya
 */
//practice test extends with test base class
public class PracticeTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    PracticePage practicePage = new PracticePage();

    @Test(groups = {"sanity","regression"})
    public void verifyUserCanNavigateToPracticePage(){
        //below methods calling from pages package
        homePage.clickOnPracticeLink();
        //compare expected with actual result
        String expectedResult = "Practice Page";
        String actualResult = practicePage.getPracticePageMessage();
        Assert.assertEquals(expectedResult,actualResult);

    }
}
