package com.jan18;
// Date 18 + 19 January 2024 ~ Day 16 and 17
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DynamicXpath {

    WebDriver driver;

    public void openWebPage(){
        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
    }

    public void rediffLogin(){

        // Absolute XPath
        WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div[2]/input"));
        username.sendKeys("demo_username");

        // Relative XPath
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("123456");

    }

    public void createNewAccount(){
        driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");

        // starts-with() and ends-with() function
        WebElement fullName = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        fullName.sendKeys("Demo User");

        // contains() function
        WebElement rediffmailID = driver.findElement(By.xpath("//td/input[contains(@name,'login')]"));
        rediffmailID.sendKeys("demouser123smailbox");


        WebElement checkAvailabilityBtn  = driver.findElement(By.xpath("//td/input[2][contains(@value, 'Check availability')]"));
        checkAvailabilityBtn.click();

        driver.findElement(By.id("newpasswd")).sendKeys("Password@123");
        driver.findElement(By.id("newpasswd1")).sendKeys("Password@123");

        WebElement alteMail = driver.findElement(By.xpath("//input[contains(@name, 'altemail')]"));
        alteMail.sendKeys("carepid865@giratex.com");

        driver.findElement(By.id("mobno")).sendKeys("1234567890");

        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
        dayDropdown.selectByValue("06");

        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
        monthDropdown.selectByVisibleText("MAR");

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
        yearDropdown.selectByValue("2002");

        driver.findElement(By.xpath("//input[contains(@value, 'f')]"));
        driver.findElement(By.xpath("//input[contains(@value, 'm')]"));

        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("India");

        Select city = new Select(driver.findElement(By.xpath("//select[contains(@name, 'city')]")));
        city.selectByValue("Pune");

        try {
            Thread.sleep(Duration.ofSeconds(15));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.id("Register")).click();


    }

    public void quitBrowser(){
        driver.quit();
    }
}
