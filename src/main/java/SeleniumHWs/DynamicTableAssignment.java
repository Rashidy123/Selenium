package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTableAssignment {
    public static void main(String[] args) {
        /*
        1. Look for an Employee ID on Page 3:
   take any employee id on page 3 manually.

2. Dynamic Search and Deletion:
   - Write dynamic code logic that goes to the website, searches for the employee ID across multiple pages , and once found, selects the checkbox associated with that employee.


3. Dynamic Logic:
   - The code should be **dynamic**, meaning that it should work even if the employee ID is located on other pages (such as 4, 5, 7, etc.) without changing any part of the logic.
   - The script should be able to navigate across pages dynamically and locate the employee ID without requiring manual input of page numbers.
         */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        List<WebElement> allId=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        boolean notFound=true;
        while(notFound) {
            int count = 1;
            for (WebElement ids : allId) {
                String all = ids.getText();
                if (all.equals("111044A")) {
                    System.out.println(count);
                    WebElement number = driver.findElement(By.xpath("//table/tbody/tr["+count+"]/td[1]"));
                    number.click();
                    notFound=false;
                }
                count++;
            }
            if(notFound){
                WebElement next=driver.findElement(By.xpath("//a[text()='Next']"));
                next.click();
                allId=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

            }
        }


    }
}
