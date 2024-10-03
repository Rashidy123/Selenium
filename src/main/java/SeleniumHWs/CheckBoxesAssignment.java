package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");
        WebElement news=driver.findElement(By.xpath("//input[@id='newsletter']"));
        if(news.isEnabled()){
            news.click();
        }
        List<WebElement> hobbies=driver.findElements(By.xpath("//input[@class='cb-element']"));
        for(WebElement hobby:hobbies){
            String two=hobby.getAttribute("value");
            if(two.equals("reading")||two.equals("cooking")){
                hobby.click();
            }
        }
        WebElement Support=driver.findElement(By.xpath("//input[@value='Support']"));
        WebElement music=driver.findElement(By.xpath("//input[@value='Music']"));
        if(!Support.isDisplayed()&&!music.isDisplayed()){
            WebElement show=driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
            show.click();
            Thread.sleep(2000);
            music.click();
        }
        WebElement Receive=driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        if(!Receive.isEnabled()){
            WebElement enable=driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
            enable.click();
            Receive.click();
        }







    }
}
