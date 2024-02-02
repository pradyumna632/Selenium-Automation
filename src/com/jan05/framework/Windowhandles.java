package com.jan05.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Windowhandles {

        WebDriver driver;
        public void login(){
                System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");
                driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
                driver.findElement(By.id("password")).sendKeys("123456");
                driver.findElement(By.cssSelector("button[type='submit']")).click();


        }

        public void Dashboard(){

                // Dashboard > Selenium > More info
                driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();

                // Dashboard > Java > More info
                driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();

                // Dashboard > Python > More info
                driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();

                // Dashboard > php > More info
                driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();
        }

        public void winhandle(){

                // Interactions > Windows > Get window handle
                // WebDriver does not make the distinction between windows and tabs.
                // If your site opens a new tab or window,
                // Selenium will let you work with it using a window handle.
                // Each window has a unique identifier which remains persistent in a single session.

                // Store the window handles in ArrayList
                ArrayList<String> windowList = new ArrayList<String>(driver.getWindowHandles());
                // Count the size of opened window handles
                System.out.println("Size=> "+ windowList.size());

                // looping through the window TAB or handles to close it.
                for(int i=0; i < windowList.size(); i++) {

                        // We are not closing the 1st opened TAB or WindowHandle
                        // The 0th TAB is Java By Kiran Dashboard
                        if(i!=0) {
                                driver.switchTo().window(windowList.get(i));
                                driver.close();

                        }

                }

                // Switching windows or tabs
                // Clicking a link which opens in a new window will focus the new window or tab on screen,
                // but WebDriver will not know which window the Operating System considers active.
                // To work with the new window you will need to switch to it.
                // If you have only two tabs or windows open, and you know which window you start with,
                // by the process of elimination you can loop over both windows or tabs that WebDriver can see,
                // and switch to the one which is not the original.
                //However, Selenium 4 provides a new api NewWindow which creates a new tab (or) new window and automatically switches to it.
                driver.switchTo().window(windowList.get(0));

                //Clicking on the Users
                driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();

        }


        }

