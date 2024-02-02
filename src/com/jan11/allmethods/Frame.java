package com.jan11.allmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

    WebDriver driver;

    public void login(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        driver.manage().window().maximize();

    }

    public void handleFrame(){

        driver.switchTo().frame("firstFr");

        WebElement fname = driver.findElement(By.name("fname"));
        fname.sendKeys("BabuRao");

        WebElement lname = driver.findElement(By.name("lname"));
        lname.sendKeys("Apte");

        WebElement iframe = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
        driver.switchTo().frame(iframe);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("baburaoganpatraoapte@herapheri.in");

        driver.switchTo().defaultContent();



    }

}
