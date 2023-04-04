package com.fw.POMPagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//flipkart/amazon/zomato/zerodha/angelone/
public class Convetional 
{
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="CC:\\Users\\Shree\\eclipse-workspace\\SeleniumNitin\\driver\\chromedriver.exe";
		String url="https://admin-demo.nopcommerce.com/login";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
//title
		String expTitle="Your store. Login"; //> excel parametrize
		String actTitle = driver.getTitle();
		if(expTitle.equals(actTitle))
		{
			System.out.println("Title TC002 is pass");
		}
		else
		{
			System.out.println("Title TC001 is fail");
		}
//checkbox--> default non selected
		boolean expChkResult = false;
		boolean actChkResult = driver.findElement(By.xpath("//input[@id='RememberMe']")).isSelected();
		if(expChkResult==actChkResult)
		{
			System.out.println("Default checkbox status TC002 is pass");
		}
		else
		{
			System.out.println("Default checkbox status TC002 is fail");
		}
//Enter UN
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
//Enter pwd
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");    
//click Signin button	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//logo display
		boolean expLogoResult = true;
		boolean actLogoResult = driver.findElement(By.xpath("(//img[@alt='logo.png'])[2]")).isDisplayed();
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
