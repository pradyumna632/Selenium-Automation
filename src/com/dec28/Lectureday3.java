package com.dec28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lectureday3 {

	public static void main(String[] args) {
		// Key : Selenium Chrome driver name which is by default which is listed on their website, It is base package of chrome driver.
		// Value: where the package is located ~ chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String urlpath = "D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html";
		driver.get(urlpath);
		
		// Get title of web page
		String strtitle = driver.getTitle();
		System.out.println("Title :\n" + strtitle);
		
		// Get current URL of web page
		String str_url = driver.getCurrentUrl();
		System.out.println("Url:\n" + str_url);
		
		// Get All Page Source of web page
		String str_page_src = driver.getPageSource();
		System.out.println("Page Source Code:\n\n" + str_page_src);
		
	}

}
