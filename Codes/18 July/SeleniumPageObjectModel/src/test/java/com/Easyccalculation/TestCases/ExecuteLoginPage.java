package com.Easyccalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EasyCalculation.Pages.LoginEasyCal;
import Helper.BrowserFactory;

public class ExecuteLoginPage {

	@Test
	public void CheckValidUser() throws InterruptedException {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.login.hiox.com/login");
		LoginEasyCal loginPageEasyCal = PageFactory.initElements(driver, LoginEasyCal.class);
		Thread.sleep(3000);
		loginPageEasyCal.login_EasyCal("9740673180", "raghubn@123"); 
	}

}
