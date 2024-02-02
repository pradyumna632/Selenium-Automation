package com.jan16.mainclass;

import com.jan16.allmethods.ReadPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPropertiesFile {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ReadPropertiesFile rpf = new ReadPropertiesFile();

        driver.get(rpf.getUrl());
        driver.findElement(By.id("user-name")).sendKeys(rpf.getUserName());
        driver.findElement(By.id("password")).sendKeys(rpf.getPassword());
        driver.findElement(By.id("login-button")).click();

    }
}
