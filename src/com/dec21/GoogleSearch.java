package com.dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

// Automating the Google Search Engine search

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","_Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String xpath_location = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea";
        WebElement search = driver.findElement(By.xpath(xpath_location));
        search.sendKeys("How to make coffee");

        // Sometimes its getting an Exception
        // Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
        // Find the solution to it
        driver.findElement(By.name("btnK")).click();

    }
}
