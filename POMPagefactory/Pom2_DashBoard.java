package com.fw.POMPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2_DashBoard 
{
	@FindBy (xpath="(//img[@alt='logo.png'])[2]") private WebElement logo;	
	
	Pom2_DashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//logo display
	public void logoValidation()
	{
		boolean expLogoResult = true;
		boolean actLogoResult = logo.isDisplayed();
		if(expLogoResult==actLogoResult)
		{
			System.out.println("Logo status TC002 is pass");
		}
		else
		{
			System.out.println("Logo status TC002 is fail");
		}
	}
}
