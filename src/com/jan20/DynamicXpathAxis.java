package com.jan20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathAxis {

    WebDriver driver;

    public void login(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }
/*
        ancestor ~
        ancestor-or-self  ~
        attribute   ~pending
        child   ~
        descendant ~
        descendant-or-self ~
        following ~
        following-sibling ~
        namespace   ~pending
        parent ~
        preceding  ~
        preceding-sibling ~
        self  ~
*/
    public void childAxis(){
        WebElement makeAppointment = driver.findElement(By.xpath("//header[@id='top']//child::a"));
        makeAppointment.click();
    }

    public void parentAxis(){
       driver.findElement(By.xpath("//input[@name='username']//parent::div"));
    }

    public void selfAxis(){
        driver.findElement(By.xpath("//input[@placeholder='Username']//self::input"));
    }

    public void descendantAxis(){
        driver.findElement(By.xpath("//div[@class='form-group']//descendant::div"));
    }

    public void descendantOrSelfAxis(){
        driver.findElement(By.xpath("//div[@class='form-group']//descendant-or-self::div"));

    }

    public void ancestorAxis(){
        driver.findElement(By.xpath("//*[@class='col-lg-10 col-lg-offset-1 text-center']//ancestor::div"));

    }

    public void ancestorOrSelfAxis(){
        driver.findElement(By.xpath("//*[@class='col-lg-10 col-lg-offset-1 text-center']//ancestor-or-self::div"));

    }

    public void followingAxis(){
        driver.findElement(By.xpath("//*[@class='list-unstyled']//following::li"));

    }

    public void followingSiblingAxis(){
        driver.findElement(By.xpath("//*[@class='list-unstyled']//following-sibling::li"));

    }

    public void precedingAxis(){
        driver.findElement(By.xpath("//*[@class='list-inline']//preceding::li"));

    }

    public void precedingSiblingAxis(){
        driver.findElement(By.xpath("//*[@class='list-inline']//preceding-sibling::li"));

    }



}

