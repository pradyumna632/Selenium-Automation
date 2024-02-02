package com.jan20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class JavascriptExecutorExample {
    WebDriver driver;

    JavascriptExecutor js;


    public void launch(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.att.com/");
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;

    }



    public void drawBorder(){
        WebElement ele = driver.findElement(By.xpath("//div[@id='__next']//a[text()='Wireless']"));
        js.executeScript("arguments[0].style.border = '3px solid red'", ele);
    }

    public void getTitle(){

        String title = js.executeScript("return document.title").toString();
        System.out.println(title);

    }

    public void clickElement(){

        WebElement ele = driver.findElement(By.xpath("//div[@id='__next']//a[text()='Wireless']"));
        js.executeScript("arguments[0].click()", ele);
    }

    public void generateAlert() throws InterruptedException {
        js.executeScript("alert('alert generated')");
        Thread.sleep(Duration.ofSeconds(10));
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
    }

    public void refreshPage(){
        js.executeScript("history.go(0)");
    }

    public void navigation(){
        js.executeScript("window.location=\"https://www.att.com/\"");
    }

    public void enterText(){
        js.executeScript("document.getElementById('z1-searchfield').value='Phones'");
    }

    public void domainName(){
        String domain = js.executeScript("return document.domain").toString();
        System.out.println(domain);
    }

    public void webpageUrl(){
        String url = js.executeScript("return document.URL").toString();
        System.out.println(url);
    }

    public void heightWidthOfWebpage(){
        String height = js.executeScript("return window.innerHeight").toString();
        String width = js.executeScript("return window.innerWidth").toString();
        System.out.println("Height:" + height);
        System.out.println("Width:" + width);
    }

    public void innerText(){
        //inner text of entire webpage
        WebElement ele = driver.findElement(By.xpath("//div[@id='__next']//a[text()='Wireless']"));
        String text = js.executeScript("return document.documentElement.innerText").toString();
        System.out.println("Innertext:\n" + text);
    }

    public void scrollBy(){
        // relative position
        js.executeScript("window.scrollBy(0,2000)");
    }

    public void scrollIntoview(){
        // scroll until the element is visible
        WebElement ele = driver.findElement(By.id("genericList-Shop-Galaxy-Phones-lnk-1834"));
        js.executeScript("arguments[0].scrollIntoView(true)", ele);
    }

    public void zoomPage(){
        js.executeScript("document.body.style.zoom='50%'");
    }



}
