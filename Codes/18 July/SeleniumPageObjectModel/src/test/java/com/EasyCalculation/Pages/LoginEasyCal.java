package com.EasyCalculation.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginEasyCal {
	 WebDriver driver;

	    //Create Constructor
	    public LoginEasyCal(WebDriver driver) {
	        this.driver = driver;
	    }

	    @FindBy(id = "log_email")
	    WebElement email;

	    @FindBy(name = "log_password")
	    WebElement password;

	    @FindBy(name = "log_submit")
	    WebElement loginbtn;

	    //Create Method
	    public void login_EasyCal(String uname, String pass) throws InterruptedException {
	        email.sendKeys(uname);
	        password.sendKeys(pass);
	        Thread.sleep(3000);
	        loginbtn.click();
	    }
}
