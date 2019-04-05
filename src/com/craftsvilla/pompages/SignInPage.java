package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SignInPage extends BasePage
{
	@FindBy(id="emailId")
	private WebElement email;
	
	@FindBy(id="continueBtn")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="loginCheck")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath="//img[@class='logout-icon mr-2']")
	private WebElement logoutButton;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterEmailAddress(String username)
	{
		try
		{
			verifyElementPresent(email);
			email.sendKeys(username);
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void clickOnContinue()
	{
		try
		{
			verifyElementPresent(continueButton);
			continueButton.click();
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void enterPassword(String pwd)
	{
		try
		{
			verifyElementPresent(password);
			password.sendKeys(pwd);
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void clickOnLoginButton()
	{
		try
		{
			verifyElementPresent(loginButton);
			loginButton.click();
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void goToMyAccount()
	{
		try
		{
			verifyElementPresent(myAccount);
			mouseHover(driver, myAccount);
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void clickOnLogout()
	{
		try
		{
			verifyElementPresent(logoutButton);
			logoutButton.click();
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	

}
