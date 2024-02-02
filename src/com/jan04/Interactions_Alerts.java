package com.jan04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Interactions_Alerts {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "_Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        // clicking on alert button 1.
        // This will not work because,
        // if there are no buttons outside of the iframe, you might instead get a no such element error.
        // This happens because Selenium is only aware of the elements in the top level document.
        // To interact with the button, we will need to first switch to the frame,
        // in a similar way to how we switch windows. WebDriver offers three ways of switching to a frame.
        driver.findElement(By.id("alertButton")).click();

        // Interactions > Alerts:
        // The simplest of these is referred to as an alert, which shows a custom message,
        // and a single button which dismisses the alert, labelled in most browsers as OK.
        // It can also be dismissed in most browsers by pressing the close button,
        // but this will always do the same thing as the OK button.
        // WebDriver can get the text from the popup and accept or dismiss these alerts.

        //Store the alert text in a variable

        // Interactions > Frame :- Using a WebElement
        // Switching using a WebElement is the most flexible option.
        // You can find the frame using your preferred selector and switch to it.

        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();   //Press the OK button

        driver.findElement(By.id("confirmButton")).click();
        Alert alert2 = driver.switchTo().alert(); // why to always switch to alert box
        // Alerts > Confirm:
        //A confirm box is similar to an alert, except the user can also choose to cancel the message.
        //This example also shows a different approach to storing an alert:
        // having a question : why we store alerts??
        System.out.println(alert2.getText());
//        alert2.accept();  // Press the ok button
        alert2.dismiss();    //Press the cancel button


        // getting error on alert 3
        driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
        Alert alert3 = driver.switchTo().alert();
        // Alert > Prompt:
        //Prompts are similar to confirm boxes, except they also include a text input.
        // Similar to working with form elements, you can use WebDriver’s send keys to fill in a response.
        // This will completely replace the placeholder text. Pressing the cancel button will not submit any text.

        alert3.sendKeys("Selenium");         //Type your message
        alert3.accept();         //Press the OK button


        // Leaving a frame:
        //To leave an iframe or frameset, switch back to the default content like so:
        driver.switchTo().defaultContent();



    }
}
