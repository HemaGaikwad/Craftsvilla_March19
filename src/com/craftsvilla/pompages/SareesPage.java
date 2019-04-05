package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SareesPage extends BasePage
{
	@FindBy(linkText ="Embroidered Sarees")
	private WebElement embroidedSareesLink;
	
	@FindBy(linkText ="Printed Sarees")
	private WebElement printedSareesLink;
	
	public SareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnEmbroidedSareesLink()
	{
		verifyElementPresent(embroidedSareesLink);
		embroidedSareesLink.click();
		
	}
	
	public void clickOnPrintedSareesLink()
	{
		verifyElementPresent(printedSareesLink);
		printedSareesLink.click();
		
	}

}
