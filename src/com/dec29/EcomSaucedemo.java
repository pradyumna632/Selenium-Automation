package com.dec29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcomSaucedemo {

	// Automating Login Module of saucedemo- swag Labs Ecommerce Application
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// Get the Heading of the web Page (Java By Kiran)
		WebElement labelElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
		String strData = labelElement.getText();
		System.out.println("GetText():" + strData);
		
		// Send the data to the email field on login Page
		WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.sendKeys("standard_user");
		
		// Send the data to the Password field on login Page
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
		
		// Click on the button to for logged in the webpage
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		
	}

}
