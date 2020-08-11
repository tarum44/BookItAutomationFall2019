package com.bookit.pages;

import com.bookit.utilities.BrowserUtilities;
import com.bookit.utilities.Driver;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class should be used as a parent class for every page class
 */

public abstract class BasePage {

    @FindBy(linkText = "my")
    protected WebElement my;

    @FindBy(linkText = "self")
    protected WebElement self;

    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goToSelfPage(){
        BrowserUtilities.wait(5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("my")));
        wait.until(ExpectedConditions.elementToBeClickable(my)).click();
        self.click();
    }

}
