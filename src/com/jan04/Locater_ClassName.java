package com.jan04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locater_ClassName {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");

// class name:
// Locates elements whose class name contains the search value (compound class names are not permitted)
        // We can find elements by multiple class names.
        // If there is an element having more than one value separated by spaces set for the class attributes,
        // it is called the compound class names. i.e. fa fa-user
// The HTML page web element can have attribute class.
// We can identify these elements using the class name locator available in Selenium.
        driver.findElement(By.className("form-control")).sendKeys("kiran@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.className("btn")).click();
        // By using (classname: fa fa-user) below exception occurs
        // And also by adding space at start of classname below exception occurs
        // Exception in thread "main" org.openqa.selenium.InvalidSelectorException: Compound class names not permitted

        driver.findElement(By.className("fa-user")).click(); // 1st occurrence of fa-user

        // I want to skip te 2nd occurrence of classname, how to do it???
        // Where can I store value of below method

        // Store it into list<webelement> --> not sure
//        driver.findElement(By.className("small-box-footer")); // Opens the automation testing Dashboard > more info > PDF




    }
}
