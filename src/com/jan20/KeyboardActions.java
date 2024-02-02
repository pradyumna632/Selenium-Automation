package com.jan20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
    WebDriver driver;
    Actions act;

    public void login(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        driver.manage().window().maximize();
        act = new Actions(driver);
    }

    public void keyboardAct(){

        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("John Doe");

        act.sendKeys(Keys.TAB).build().perform();

        WebElement appendtext = driver.findElement(By.id("join"));
        act.keyDown(appendtext,Keys.SPACE).perform();
        appendtext.sendKeys("Text Append");

        act.sendKeys(Keys.TAB).build().perform();
        // get the value form textbox
        WebElement insideTextBox = driver.findElement(By.id("getMe"));
        String textbox = insideTextBox.getAttribute("value");
        System.out.println(textbox);
        // Select all text ctrl+a
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        // copy text ctrl+c
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        // scroll down page using keyboard
        act.sendKeys(Keys.PAGE_DOWN).build().perform();

       WebElement clt = driver.findElement(By.id("clearMe"));
       clt.clear();
       // paste the copied text ctrl+v
       act.keyDown(clt, Keys.CONTROL).sendKeys(clt, "v").keyUp(clt, Keys.CONTROL).perform();

       // page scroll down using arrow keys
        act.keyDown(Keys.ARROW_DOWN).perform();

        //Confirm edit field is disabled
        WebElement editField = driver.findElement(By.id("noEdit"));
        boolean answer = editField.isEnabled();
        if (answer == false){
            System.out.println("Confirm edit field is disabled");
        }else {
            System.out.println("Confirm edit field is not disabled");
        }

        //Confirm text is readonly
        String readonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
        System.out.println("Confirm text is readonly: " + readonly);


    }

}
