package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonsAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
        List<WebElement> Favorite=driver.findElements(By.xpath("//input[@name='beverage']"));
        for(WebElement beverage:Favorite){
            if(beverage.getAttribute("value").equals("Juice")){
                beverage.click();
            }
        }
        List<WebElement> Preferred=driver.findElements(By.xpath("//input[@name='working_enviroment']"));

        for(WebElement all:Preferred){
            String buttons=all.getAttribute("value");
            if(buttons.equals("hybrid"));
            all.click();
        }
        WebElement spring=driver.findElement(By.xpath("//input[@value='spring']"));
        if(!spring.isEnabled()){
            WebElement enable=driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
            enable.click();
            if(spring.isEnabled()){
                spring.click();
            }
        }
        WebElement winter=driver.findElement(By.xpath("//input[@value='winter']"));
        if(!winter.isDisplayed()){
            System.out.println("Winter is not displayed ");
            WebElement showBtn=driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
            showBtn.click();
            if(winter.isDisplayed()){
                winter.click();
            }
        }
        List<WebElement>meals= driver.findElements(By.xpath("//input[@name='meal']"));
        for(WebElement lunch:meals){
            if(lunch.getAttribute("value").equals("lunch")){
                lunch.click();
            }
        }

    }
}
