package com.jan10.allmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesDownloads {

WebDriver driver;

    public void login(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("file:///D:/Automation%20Testing%20JBK%20Resources/Testing%20Softwares/Offline%20Website/pages/examples/downloads.html");
        driver.manage().window().maximize();
    }

    public void UsefulLinksTab() {

        // Get the Row elements and size
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        int rowSize = rows.size();
        System.out.println("Rows in table: " + rowSize);

        // Get the column elements and size
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/td"));
        int columnSize = columns.size();
        System.out.println("columns in table: " + columnSize);

        //Get the Table Data from the Web table
        for (int i = 2; i <= rowSize; i++) {
            for (int j = 1; j <= 8; j++) {

//                if (j == 1) {
//                    System.out.println(
//                            driver.findElement(By.tagName("img")).getCssValue("alt"));
//                } else {

                    System.out.print(
                            driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr[" + i + "]/td[" + j + "]")).getText() + "\t\t");
                }
                System.out.println();
            }

//        }

//        public void getHead() {
//            List<WebElement> heading = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/th"));
//            int headsize = heading.size();
//            System.out.println("Heading Size: " + headsize);
//
//            //Get the headings of table
//            for (int h = 1; h <= headsize; h++) {
//                System.out.print(
//                        driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr/th[" + h + "]")).getText() + "\t");
//            }
//
//        }

    }
    }

