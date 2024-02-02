package com.jan03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersUsed {
    // id, name, link text, Partial link text used here
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");

        // Locators are used to locate and access the web elements on the webpage
        // To get the object/ handle of particular web element
        // Here the object means the HTML DOM of webpage
        // Locators is defined as Ways to identify one or more specific elements in the DOM.
        // There are 8 types of locators is as followed ------->

        // id :
        // Locates elements whose ID attribute matches the search value
        // We can use the ID attribute of an element in a web page to locate it. Generally the
        // ID property should be unique for each element on the web page. We will identify the Email field using it.
        // We use the id attribute value to locate it

//        driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("123456");

        // Click on the submit button by using xpath method

//        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

        // name:
        // Locates elements whose NAME attribute matches the search value
        // We can use the NAME attribute of an element in a web page to locate it.
        // Generally the NAME property should be unique for each element on the web page.
        // We will not use it because name attribute is not used in our page
//        driver.findElement(By.name("")).click();


        //link text:
        // Locates anchor (anchor tag:<a>) elements whose visible text (Content of webpage) matches the search value
        // If the element we want to locate is a link, we can use the link text locator to identify it on the web page.
        // The link text is the text displayed of the link.
        // Return type of linktext is object of by class

//        driver.findElement(By.linkText("Register a new membership")).click();

        // partial link text:
        //If the element we want to locate is a link, we can use the partial link text locator to identify it on the web page.
        // The link text is the text displayed of the link. We can pass partial text as value.
        // We don't have to give the all the visible text, give only some text from the visible text
        // Locates anchor elements whose visible text contains the search value.
        // If multiple elements or partial text are matching, only the first one will be selected.

//        driver.findElement(By.partialLinkText("Register")).click();

    }
}
