package com.dec22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lectureday2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		
		
	}

}
