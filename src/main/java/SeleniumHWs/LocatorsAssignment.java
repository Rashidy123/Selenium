package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/locator-homework.php");
        WebElement fName=driver.findElement(By.id("fullName"));
        fName.sendKeys("John jons");
        WebElement email=driver.findElement(By.id("yourEmail"));
        email.sendKeys("JohnJons!gmail.com");
        WebElement email1=driver.findElement(By.id("yourEmail"));
        email1.sendKeys("johnjons12@gmail.com");
        WebElement clintName=driver.findElement(By.id("clientNameId"));
        clintName.sendKeys("John");
        WebElement clintId=driver.findElement(By.id("ClientId"));
        clintId.sendKeys("12345789");
        WebElement clintFB=driver.findElement(By.id("ClientfeedbackId"));
        clintFB.sendKeys("johnjose123");
        WebElement proName=driver.findElement(By.id("ProjectNameId"));
        proName.sendKeys("Selenium");
        WebElement deadlineT=driver.findElement(By.id("ProjectTimeId"));
        deadlineT.sendKeys("09/24/2024");
        WebElement address1=driver.findElement(By.name("CurrentAddress"));
        address1.sendKeys("John jose street 123 VA");
        WebElement address2=driver.findElement(By.name("PermanentAddress"));
        address2.sendKeys("Lamba street 567 LA");
        WebElement submit=driver.findElement(By.name("btn-submit"));
        submit.click();
        WebElement clickHere=driver.findElement(By.linkText("Click Here."));
        clickHere.click();
        driver.quit();




    }
}
