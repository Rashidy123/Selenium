package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAssignment {
    public static void main(String[] args) {
        /*
        1. Click on Button B1:
   - Ensure that clicking on the **B1** button opens a new window.
   - Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"**.

2. Click on Button B2:
   - Ensure that clicking on the **B2** button opens a new window.
   - Verify that the text in the window opened by the **B2** button is **"Welcome to B2 page"**.
         */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");
        WebElement B1=driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        B1.click();
        System.out.println("B1 page successfully opened on a new window");
        WebElement B2=driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        B2.click();
        System.out.println("B2 page opened on a new tab");


    }
}
