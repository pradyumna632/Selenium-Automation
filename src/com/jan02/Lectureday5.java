package com.jan02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lectureday5 {

	// Automating JBK Login and DashBoard > Users > Adding a new user
	// Locating the WebElements using xpath
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");
		
		
		WebElement labelElement = driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));  
		String strData = labelElement.getText();
		System.out.println("GetText():\n" + strData);
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("kiran@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Demo user");

		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("1234567890");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("demo_user@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Testing");

		driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();

		// Handling dropdown button using 3 methods
		// We need to find the select tag present in HTML code,
		// below that there is dropdown list(option tag) present and we need to select it
		// We need to use Select class that is present in selenium

		//Store the select xpath in WebElement object
		WebElement DropdownElement = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));

		Select sel = new Select(DropdownElement);

		sel.selectByIndex(4); // Accessing by option by entering its index value
		// But if you have n number of options than we have to calculate/know the index position of option,
		// That's why it is not a great idea to use selectByIndex() method for larger options.

		sel.selectByValue("HP"); // Accessing by option by entering value attribute name present in HTML tag option value=""

		sel.selectByVisibleText("Delhi"); // Select the HTML content between the option tag

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");

		// using full Xpath
		//friend Mobile input field
		// Here we have used full Xpath instead of xpath,
		// because this field xpath is matching with Mobile xpath field
		// It is entering the friend mobile no. in user mobile no. field
		// If both the xpath is same it will send the value to the field that occurs first
		// To encounter this issue we have used full xpath - full xpath have path of full structure in HTML
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input"))
				.sendKeys("7894561230");

		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

		// handling the alert box
		//  After entering submit alert box popups
		// To handle this alert box we have to switch the alert window using switchTO() method
		// Because we are in different browser window now
		// it is called as content switch : To move to the different window,
		// so we have to use content switch
		driver.switchTo().alert().accept();

		// After this the window is pointing to the alert window
		// so, to the window switch to default window content we need to use defaultContent() method

		driver.switchTo().defaultContent();
// 		Getting Warning after using close() method
//		driver.close();



		
		
		
	}

}
