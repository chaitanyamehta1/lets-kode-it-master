package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Chaitanya
 */
//login page class extends utility class to use properties of utility class
public class LoginPage extends Utility {
    //locators for each elements on login page
    By emailField = By.id("user_email");
    By passwordField = By.id("user_password");
    By clickOnCommitButton = By.name("commit");
    By getLoginText = By.xpath("//h1[@class='text-center']");
    By allCourseText = By.xpath("//a[contains(text(),'All Courses')]");

    //below all methods for each elements and doing actions on that each elements

    public void setEmailField() {
        sendTextToElement(emailField, "dhanno1210@gmail.com");
    }

    public void setPasswordField() {
        sendTextToElement(passwordField, "123456");
    }

    public void setClickOnLoginButton() {

        clickOnElement(clickOnCommitButton);
    }

    public String getLoginWelcomeMessage() {
        return getTextFromElement(getLoginText);
    }
    public String getAllCourseMessage(){
        return getTextFromElement(allCourseText);
    }

}
