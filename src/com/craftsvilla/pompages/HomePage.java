package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
	@FindBy(id="cartCount")
	private WebElement cartButton;

	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement signInButton;
	
	@FindBy(id="searchval")
	private WebElement searchBar;
	
	@FindBy(xpath ="//a[@href=\"/womens-clothing/sarees/?MID=megamenu_sarees_seeall\"]")
	private WebElement sareesLink;
	
	@FindBy(xpath="//a[@href=\"/womens-clothing/lehangas/?MID=megamenu_lehengas_seeall\"]")
	private WebElement lehengasAndGowns;
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCartButton()
	{
		try
		{
			verifyElementPresent(cartButton);
			cartButton.click();
			log.info("clicked on "+cartButton);
			
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+cartButton+" : "+e);
		}
		
	}
	
	public void clickOnSignInButton()
	{
		try
		{
			verifyElementPresent(signInButton);
			signInButton.click();
			log.info("Clicked on "+signInButton);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+signInButton+" : "+e);
		}
	}
	
	public void enterSearchValue(String searchString)
	{
		try
		{
			verifyElementPresent(searchBar);
			searchBar.sendKeys(searchString);
			log.info("Successfully sent the search string: "+searchString);
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void goToSareesLink()
	{
		try
		{
		verifyElementPresent(sareesLink);
		mouseHover(driver, sareesLink);
		log.info("");
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void goToLehengasAndGowns()
	{
		try
		{
		verifyElementPresent(lehengasAndGowns);
		mouseHover(driver, lehengasAndGowns);
		log.info("");
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
}
