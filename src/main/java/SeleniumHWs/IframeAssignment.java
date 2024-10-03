package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAssignment {
    public static void main(String[] args) {
        /*
        1. Select Age Checkbox:
   - Select the **Age** checkbox.

2. **Select City**:
   - Select any city from the dropdown.

3. **Enter Username**:
   -enter your username in the **Username** field.
         */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");
        driver.switchTo().frame(1);
        WebElement third=driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
        driver.switchTo().frame(third);
        WebElement cb=driver.findElement(By.xpath("//input[@class='cb1-element']"));
        cb.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement city=driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel=new Select(city);
        sel.selectByVisibleText("Los Angeles");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement userName=driver.findElement(By.xpath("//input[@name='Username']"));
        userName.sendKeys("ehsan9087");

    }
}
