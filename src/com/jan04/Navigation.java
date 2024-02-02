package com.jan04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Convenient way to open the website
//        driver.get("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");

        //Longer way to open the website
        // Here we have used Navigation called Navigate to
        driver.navigate().to("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");
        driver.manage().window().maximize();

        // click on: Register a new membership
        driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();

        // Register a new membership > Name
        driver.findElement(By.id("name")).sendKeys("Admin");
        driver.navigate().back();

        driver.findElement(By.id("password")).sendKeys("123456");
        driver.navigate().forward();

        driver.findElement(By.id("mobile")).sendKeys("7894561230");
        driver.navigate().refresh();

    }
}
