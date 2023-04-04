package com.fw.POMPagefactoryDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass1 
{
	@Test
	public void browserlaunch() throws InterruptedException, EncryptedDocumentException, IOException
	{
	String key="webdriver.chrome.driver";
	String value="C:\\New folder\\June2022Batch_Selenium\\driver\\chromedriver.exe";
	String url="https://admin-demo.nopcommerce.com/login";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
	Pom1_Loginwebpage p1 = new Pom1_Loginwebpage(driver);
	p1.titleValidation(driver.getTitle());
	p1.checkBoxValidation();
	p1.enterUn();
	Thread.sleep(2000);
	p1.enterPassword();
	Thread.sleep(2000);
	p1.clickSigninBtn();
	Thread.sleep(2000);
	
	Pom2_DashBoard p2 = new Pom2_DashBoard(driver);
	p2.logoValidation();
	driver.close();
	}
}
