package com.fw.POMPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1_Loginwebpage 
{
	@FindBy (xpath="//input[@id='RememberMe']") private WebElement chkBox;
	//	WebElement chkbox=driver.findElement(By.xpath("//input[@id='RememberMe']"));
	@FindBy (xpath="//input[@id='Email']") private WebElement un;
	//	WebElement un=driver.findElement(By.xpath("//input[@id='Email']"))
	@FindBy (xpath="//input[@id='Password']") private WebElement pwd;
	//	WebElement pwd= driver.findElement(By.xpath("//input[@id='Password']"))
	@FindBy (xpath="//button[@type='submit']") private WebElement signinButton;
//	driver.findElement(By.xpath("//button[@type='submit']"))
	
	public Pom1_Loginwebpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//title
		String expTitle="Your store. Login"; //> excel parametrize
	public void titleValidation(String actTitle)
	{
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("Title TC002 is pass");
		}
		else
		{
			System.out.println("Title TC001 is fail");
		}
	}
	public void checkBoxValidation()
	{
	//checkbox--> default non selected
		boolean expChkResult = false;
		boolean actChkResult = chkBox.isSelected();
		if(expChkResult==actChkResult)
		{
			System.out.println("Default checkbox status TC002 is pass");
		}
		else
		{
			System.out.println("Default checkbox status TC002 is fail");
		}
	}
	
	//Enter UN
	public void enterUn()
	{
		un.sendKeys("admin@yourstore.com");
	}
	//Enter pwd
	public void enterPassword()
	{
		pwd.sendKeys("admin");  
	}
	//click Signin button
	public void clickSigninBtn()
	{
		signinButton.click();
	}
		
}
