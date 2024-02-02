package com.dec29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1day4 {

	// Automate "Make My Trip" Web Application Login page
	// Code Not Working

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");

		WebElement labelElement = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]"));
		String strData = labelElement.getText();
		System.out.println("GetText():\n" + strData);

//		Enter Email or Mobile number
		WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/section/form/div[1]/div/input"));
		username.sendKeys("kiran@gmail.com");

//		Click on continue button
		driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[2]/div[2]/div/section/form/div[2]/button")).click();

		driver.close();
	}

}
