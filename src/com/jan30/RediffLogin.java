package com.jan30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogin {

    WebDriver driver;

    public void login(String url){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public void rediffAccess(){
        // find the username webelement and send the data to username
        driver.findElement(By.id("login1")).sendKeys("UsernameEntered");
        // find the password webelement and send the data to username
        driver.findElement(By.id("password")).sendKeys("Password123");
        //  click on sign in button
        driver.findElement(By.name("proceed")).click();
    }

}
