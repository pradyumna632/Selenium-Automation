package com.jan10.allmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesOperators {

    WebDriver driver;

    public void login(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("file:///D:/Automation%20Testing%20JBK%20Resources/Testing%20Softwares/Offline%20Website/pages/examples/operators.html");
        driver.manage().window().maximize();
    }

    // Step 1 : Get the no. of rows.
    // Step 2 : Get the no. of columns.
    // Step 3 : Iterate over rows and columns and get the text and print it.
    // first iterate through rows and then columns

    public void handleWebTables(){

        //  Get the total no. of rows
        //  //table[@class='table table-hover']/tbody/tr/td
        List<WebElement> rowElements =
        driver.findElements(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr"));
        int rowSize = rowElements.size();
        System.out.println(" No. of rows:" + rowSize);

        //  Get the total no. of columns
        List<WebElement> columnElements =
                driver.findElements(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td"));
        int columnSize = columnElements.size();
        System.out.println(" No. of columns:" + columnSize);

        // Iterate over rows and columns and get the text and print it.

        //iterate through the rows
        for (int i = 2; i < rowSize; i++){
            //iterate through the columns
            for (int j = 1; j<= columnSize; j++ ){
                System.out.print(
                driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+ i +"]/td["+ j +"]"))
                           .getText()+ "\t");
            }
            System.out.println();
        }


    }
}
