package com.jan30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTray {
    WebDriver driver;

    public void login(String url){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public void mailAccess(){

        //access the mail tray
        driver.findElement(By.xpath("//div[@id='gbwa']//a")).click();
        //switch to iframe
        WebElement iframeOfTray = driver.findElement(By.xpath("//iframe[@role='presentation' and @name='app' ]"));
        driver.switchTo().frame(iframeOfTray);
        // access the photos
        // driver.findElement(By.xpath("//span[text()='Photos']//parent::a[@class='tX9u1b']")).click();
        // access the Travel
        driver.findElement(By.xpath("//span[text()='Travel']//parent::a[@class='tX9u1b']")).click();
        // switch the iframe to default content
        driver.switchTo().defaultContent();

    }
}
