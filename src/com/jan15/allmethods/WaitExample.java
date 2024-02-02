package com.jan15.allmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitExample {
    WebDriver driver;

    public void implicitExplicitWaiting(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
//      driver.navigate().to("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");
        driver.manage().window().maximize();

        // Implicit Wait
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Send the data to the email field on login Page
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("kiran@gmail.com");

        // Send the data to the Password field on login Page
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("123456");

        // Explicit Wait
        WebElement button ;
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        button= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form\"]/div[3]/div/button")));


        // Click on the button to for logged in the webpage
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();


    }
}
