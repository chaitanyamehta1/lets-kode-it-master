package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Chaitanya
 */
//practice page class extends utility class to use properties of utility class
public class PracticePage extends Utility {
    //locators for each elements on login page
    By getPracticePageText = By.xpath("//h1[contains(text(),'Practice Page')]");

    //below methods for each elements and doing actions on that each elements
    public String getPracticePageMessage() {
        return getTextFromElement(getPracticePageText);
    }
}