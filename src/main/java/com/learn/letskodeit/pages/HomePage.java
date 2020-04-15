package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Chaitanya
 */
//home page class extends utility class to use properties of utility class
public class HomePage extends Utility {
    //locators for each elements on home page

    By practiceLink = By.partialLinkText("Practi");

    By loginLink = By.partialLinkText("Login");

    By signUpLink = By.id("header-sign-up-btn");

    //below all methods for each elements and doing actions on that each elements
    public void clickOnLogin() {
        clickOnElement(loginLink);
    }

    public void clickOnPracticeLink() {
        clickOnElement(practiceLink);
    }

    public void clickOnSignUpLink() {
        clickOnElement(signUpLink);
    }


}