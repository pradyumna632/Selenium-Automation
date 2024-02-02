package com.jan16.allmethods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ScreenshotExample {

    WebDriver driver;

    public void TakeScreenshot() throws IOException {
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("file:///D:/Automation%20Testing%20JBK%20Resources/Testing%20Softwares/Offline%20Website/pages/examples/links.html");
        driver.manage().window().setPosition(new Point(0,0));

        // Full Page Screenshot
        TakesScreenshot srcShot = ((TakesScreenshot) driver);
        File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".\\Screenshots\\img1.png");
        FileUtils.copyFile(srcFile,destFile);

        //Take Particular Section Screenshot
        WebElement section = driver.findElement(By.className("content"));
        File srcFile1 = section.getScreenshotAs(OutputType.FILE);
        File destFile1 = new File(".\\Screenshots\\img2.png");
        FileUtils.copyFile(srcFile1,destFile1);

        //Take Specific WebElement Screenshot
        WebElement ele = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]"));
        File srcFile2 = ele.getScreenshotAs(OutputType.FILE);
        File destFile2 = new File(".\\Screenshots\\img3.png");
        FileUtils.copyFile(srcFile2,destFile2);
//        driver.quit();





    }
}
