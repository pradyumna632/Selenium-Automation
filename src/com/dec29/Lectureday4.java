package com.dec29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lectureday4 {

	// Automating Login Module of Java by kiran
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Automation%20Testing%20JBK%20Resources/Testing%20Softwares/Offline%20Website/index.html");
		
		// Get the Heading of the web Page (Java By Kiran)
		WebElement labelElement = driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));  
		String strData = labelElement.getText();
		System.out.println("GetText():\n" + strData);
		
		// Send the data to the email field on login Page
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("kiran@gmail.com");
		
		// Send the data to the Password field on login Page
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456");
		
		// Click on the button to for logged in the webpage
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		driver.close();
	}

}
