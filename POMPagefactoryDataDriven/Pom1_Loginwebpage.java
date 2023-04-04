package com.fw.POMPagefactoryDataDriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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
	public void titleValidation(String actTitle) throws EncryptedDocumentException, IOException
	{
		String expTitle=Utility.excelStringData("Sheet1", 2, 1);
		System.out.println(expTitle);
		if(expTitle.equals(actTitle))
		{
			System.out.println("Title TC001 is pass");
		}
		else
		{
			System.out.println("Title TC001 is fail");
		}
	}
	public void checkBoxValidation() throws EncryptedDocumentException, IOException
	{
	//checkbox--> default non selected
		boolean expChkResult = Utility.execlBooleanData("Sheet1", 2, 2);
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
	public void enterUn() throws EncryptedDocumentException, IOException
	{
		un.clear();
		un.sendKeys(Utility.excelStringData("Sheet1", 2, 3));
	}
	//Enter pwd
	public void enterPassword() throws EncryptedDocumentException, IOException
	{
		pwd.clear();
		pwd.sendKeys(Utility.excelStringData("Sheet1", 2, 4));  
	}
	//click Signin button
	public void clickSigninBtn()
	{
		signinButton.click();
	}
		
}
