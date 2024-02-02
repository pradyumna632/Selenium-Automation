package com.jan10.allmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesUsers {

    WebDriver driver;

    public void login(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("file:///D:/Automation%20Testing%20JBK%20Resources/Testing%20Softwares/Offline%20Website/index.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
        driver.findElement(By.linkText("Users")).click();

    }

    public void handleWebTables(){

        //  Get the total no. of rows
        List<WebElement> rowElements =
                driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));

        int rowSize = rowElements.size();
        System.out.println(" No. of rows:" + rowSize);


        //  Get the total no. of rows heading
        List<WebElement> headingElements =
                driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr[1]/th"));

//        int headSize = headingElements.size();
//        System.out.println(" No. of rows:" + headSize);



        //  Get the total no. of columns
        List<WebElement> columnElements =
                driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/td"));
        int columnSize = columnElements.size();
        System.out.println(" No. of columns:" + columnSize);

        //iterate through rows
        for (int i =1; i<=rowSize; i++){
                for (int j = 1; j<8; j++){
                    System.out.print(
                            driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr[" + i + "]/td[" + j + "]")).getText() + "\t"
                    );
                }
            }

            System.out.println();
        }

    public void quitAll(){
        driver.quit();
    }
}