package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Chaitanya
 */
//sign up page class extends utility class to use properties of utility class
public class SignUpPage extends Utility {
    //locators for each elements on login page
    By getSignUpMessage = By.xpath("//h1[contains(text(),\"Sign Up to Let's Kode It\")]");

    //below methods for each elements and doing actions on that each elements
    public String getSignUpText() {
    return getTextFromElement(getSignUpMessage);
    }
}