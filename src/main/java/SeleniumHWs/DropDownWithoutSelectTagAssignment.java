package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelectTagAssignment {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Choose Your Dream Fruit:
   - Retrieve all options from the "Choose your Dream Fruit" dropdown.
   - Traverse through the list of options, and select **Mango**.
   - Ensure that the selection process is done by iterating through the options and not by directly clicking on the option using Xpath or any direct locator to the item.

2. Choose Your Favorite Hobby:
   - Retrieve all options from the "Choose your Favorite Hobby" dropdown.
   - Traverse through the list and select **Reading**.
   - Ensure that the desired option is selected by iterating through the options, not by directly clicking on it using Xpath or any other direct locator to the item.
         */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");
        WebElement outSelecetTag=driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        outSelecetTag.click();
        List<WebElement> allOptions=driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        for(WebElement option:allOptions){
            String optionText=option.getText();
            if(optionText.equals("Mango")){
                option.click();
            }
        }

        WebElement mul=driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        mul.click();
        List<WebElement> allOptions1=driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for(WebElement option1:allOptions1){
            String optionText1=option1.getText();
            if(optionText1.equals("Reading")){
                option1.click();
            }
        }
    }
}
