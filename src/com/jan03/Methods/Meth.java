package com.jan03.Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meth {

    // Creating instance variable
    WebDriver driver;

    public void browserSetting(String url){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get(url);
    }

}
