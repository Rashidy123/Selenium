package SeleniumHWs;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAssignment {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Birthday Reminder:
   - Click on the "Birthday Reminder" button.
   - When the alert appears, accept the alert.

2. Delete Confirmation:
   - Click on the **"Delete File"** button.
   - When the confirmation alert appears, **dismiss** the alert.
   - Print the status of the action (e.g., "File deletion canceled") that appears on the screen, to the console.

3. Name Collection:
   - Click on the **"Enter Your Name"** button.
   - Accept the alert and provide a name.
   - Retrieve the name that appears on the screen UI and print it on the console, verifying that the correct name is displayed.

         */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");
        WebElement birthday=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        birthday.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement delete=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        delete.click();
        Thread.sleep(2000);
        alert.dismiss();
        WebElement print=delete.findElement(By.xpath("//p[@id='confirm-demo']"));
        System.out.println(print.getText());
        WebElement enter=delete.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        enter.click();
        Thread.sleep(2000);
        alert.sendKeys("Ehsan");
        Thread.sleep(2000);
        alert.accept();
        WebElement print1=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        System.out.println(print1.getText());



    }
}
