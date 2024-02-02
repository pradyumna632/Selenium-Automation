package com.jan04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locator_tagName {
    // Having questions and errors look forward to solve it.
    // not solved completely
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");


        //tagName() - tag name:
        // Locates elements whose tag name matches the search value
        // We can use the HTML TAG itself as a locator to identify the web element on the page

// TAB - Finding Web Element
// All matching elements :  There are several use cases for needing to get references to all elements that
// match a locator, rather than just the first one. The plural find elements methods return a
// collection of element references. If there are no matches, an empty list is returned.

        List<WebElement> input_tag = driver.findElements(By.tagName("input"));

        // size() Returns: the number of elements in this list
        System.out.println(input_tag.size()); // size() is List method

        for(int i=0;i<input_tag.size();i++) {

            // get() Returns the element at the specified position in this list
            WebElement element= input_tag.get(i); // get() is List method


            // Fetching Attributes or Properties (getAttribute()):
            // Fetches the run time value associated with a DOM attribute.
            // It returns the data associated with the DOM attribute or property of the element.


            if(element.getAttribute("placeholder").equalsIgnoreCase("Email")) {
                element.sendKeys("sumit@gmail.com");
            }
            else if(element.getAttribute("placeholder").equalsIgnoreCase("Password")) {
                element.sendKeys("12345");
            }

        }

        driver.findElement(By.className("btn")).click();

// getText() Text Content:
// Retrieves the rendered text of the specified element. It prints the text between the anchor <a></a> tag
        String text = driver.findElement(By.tagName("div")).getText();
        System.out.println(text);

    }
}
