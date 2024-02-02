package com.jan04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_cssSelector {
// Having questions and errors look forward to solve it.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");

        //css selector:

        //CSS is the language used to style HTML pages.
        // We can use css selector locator strategy to identify the element on the page.
        // If the element has an id, we create the locator as css = #id.
        // Otherwise, the format we follow is css =[attribute=value] .

        driver.findElement(By.cssSelector("#email")).sendKeys("sumit@thekiranacademy"); //#id used

        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456"); //css=[attribute=value]


    }
}
