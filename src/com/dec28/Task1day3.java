package com.dec28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1day3 {
	// Get Website Title without using getTitle() method (using java only : use string method).

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("D:\\Automation Testing JBK\\Testing Softwares\\Offline Website\\index.html");
		
		String getPageSource = driver.getPageSource();
		
		String getTitle = getPageSource.substring(0);
		
		
		
		
	}

}
