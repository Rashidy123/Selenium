package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssHw {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");
        WebElement Id=driver.findElement(By.cssSelector("input#UserID"));
        Id.sendKeys("ID123");
        WebElement userName=driver.findElement(By.cssSelector("input.form-control and,input#UserName"));
        userName.sendKeys("James");
        WebElement lecture=driver.findElement(By.cssSelector("input[data-starts*='introCSSAdv']"));
        lecture.sendKeys("Lecture number12");
        WebElement feedback1=driver.findElement(By.cssSelector("input[class^='form-control feedbackBox1']"));
        feedback1.sendKeys("Lecture was good");
        WebElement feedback2=driver.findElement(By.cssSelector("input[id$='fromDucky']"));
        feedback2.sendKeys("The lecture was great");
        WebElement clintId=driver.findElement(By.cssSelector("input.form-control and, input[data-ends$='clientID']"));
        clintId.sendKeys("efd12345");
        WebElement email=driver.findElement(By.cssSelector("input[name*='email']"));
                email.sendKeys("Ahmad123@gmail.com");
        WebElement topic=driver.findElement(By.cssSelector("input[data-content^='CSS']"));
        topic.sendKeys("The course topic is CSS");
        driver.quit();
    }
}
