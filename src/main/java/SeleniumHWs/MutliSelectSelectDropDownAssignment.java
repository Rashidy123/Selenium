package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class MutliSelectSelectDropDownAssignment {
    public static void main(String[] args) throws InterruptedException {
        /*
        . Select List Demo:
   - Use the **Select** class to select the option **"Pear"** from the dropdown.
   - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
   - Use the **getOptions** method to retrieve all options from the dropdown and print them on the console.

2. Select Multiple Options:
   - First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.
   - Using the **Select** class, make the following selections:
     - **Traveling**
     - **Cooking**
     - **Gardening**
   - Click the **"Get All Selected"** button and print the result on the console.
   - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
   - Click the **"Get All Selected"** button again and print the result on the console.
         */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");
        WebElement dd=driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select sel=new Select(dd);
        sel.selectByVisibleText("Pear");
        List<WebElement> allOptions=sel.getOptions();
        for(WebElement option:allOptions){
            System.out.println(option.getText());
        }
        WebElement dd1=dd.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select sel1=new Select(dd1);
        boolean yes=sel1.isMultiple();
        System.out.println("The dropdown multi is "+yes);
        sel1.selectByValue("Traveling");
        sel1.selectByVisibleText("Cooking");
        sel1.selectByIndex(4);
        WebElement all=driver.findElement(By.xpath("//button[@id='get_all']"));
        all.click();
        List<WebElement> options=sel1.getAllSelectedOptions();
        for(WebElement option:options) {
            System.out.println(option.getText());
        }

            Thread.sleep(2000);
            sel1.deselectByVisibleText("Traveling");
        WebElement all1=driver.findElement(By.xpath("//button[@id='get_all']"));
        all.click();
        List<WebElement> upOptions=sel1.getAllSelectedOptions();
        for(WebElement updateOption:upOptions) {
            System.out.println(updateOption.getText());
        }










    }
}
