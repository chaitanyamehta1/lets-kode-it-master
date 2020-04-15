package com.learn.letskodeit.testbase;

import com.learn.letskodeit.basepage.BasePage;
import com.learn.letskodeit.browserselector.BrowserSelector;
import com.learn.letskodeit.loadproperty.LoadProperty;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chaitanya
 */
//test base class extends with base page class
public class TestBase extends BasePage {
    //object created for browser selector
    BrowserSelector browserSelector = new BrowserSelector();


    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");



    //before method of testNG
    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void openBrowser() {
        //browser opening
        browserSelector.selectBrowser(browser);
        // driver.manage().window().setPosition(new Point(2000, 0));//display into second screen
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    //after method of testNG
    @AfterMethod(groups = {"sanity","smoke","regression"})
    //browser closing
    public void tearDown() {
        driver.quit();


    }
}
