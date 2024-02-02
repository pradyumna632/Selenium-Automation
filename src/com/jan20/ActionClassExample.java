package com.jan20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ActionClassExample {
    WebDriver driver;
    Actions act;


    public void login(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        act = new Actions(driver);
    }

    public void clickitem(){

        WebElement clickme =  driver.findElement(By.xpath("//button[text()='Click Me']"));
        act.click(clickme).perform();
    }

    public void doubleclick(){

        WebElement doubleclickme = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(doubleclickme).perform();
    }

    public void rightclick(){

        WebElement rightclickme = driver.findElement(By.id("rightClickBtn"));
        act.contextClick(rightclickme).perform();
    }

    public void drganddrp(){
        driver.get("https://letcode.in/dropable");
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        act.dragAndDrop(drag,drop).perform();

    }

    public void drgndrpbyoffset(){

        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(0);
        WebElement ele = driver.findElement(By.xpath("//div[@id='draggable']"));
        int x = ele.getLocation().getX();
        int y = ele.getLocation().getY();
        act.dragAndDropBy(ele, x+50, y+50).perform();
    }

    public void mousehover(){
        driver.get("https://letcode.in/test");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement course = driver.findElement(By.xpath("//a[text()='Courses']"));
        act.moveToElement(course).perform();
        System.out.println("Done Mouse hover on 'course' from Menu");
        WebElement java = driver.findElement(By.xpath("//a[text()=' Selenium-Java ']"));
        act.moveToElement(java).click().perform();
        System.out.println("Done click on 'Selenium java' on Menu");

    }

    public void moveCursorOffset(){
        driver.get("https://letcode.in/slider");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement slider = driver.findElement(By.id("generate"));
        act.moveToElement(slider, 190, 0).click().perform();
        WebElement getCountries = driver.findElement(By.xpath("//button[@class='button is-primary']"));
        act.click(getCountries).perform();

    }

    public void moveByOffset(){
        driver.get("https://jqueryui.com/resizable/");

        act.moveByOffset(100,100).contextClick().perform();
    }

    public void clickandHold(){
        driver.get("https://letcode.in/sortable");

        WebElement todo = driver.findElement(By.xpath("//div[text()=' Get to work']"));
        WebElement done = driver.findElement(By.xpath("//div[text()=' Get up']"));
        int x = done.getLocation().getX();
        int y = done.getLocation().getY();

        act.clickAndHold(todo).moveByOffset(x,y).release().perform();


    }

    public void release(){


    }

    public void tooltip(){
        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(0);
        WebElement tt = driver.findElement(By.id("age"));
        System.out.println(tt.getAttribute("title"));
    }

    

    public void quitBrowser(){

        driver.quit();
    }
}
