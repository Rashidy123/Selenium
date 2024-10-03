package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTableAssignment {
    public static void main(String[] args) {
        /*
        1. **Print All Entries with the Country "USA"**:
   - Dynamically search the table for entries where the country is **"USA"**.
   - Print all the rows matching criteria

2. **Dynamic Logic**:
   - Ensure the search and filtering logic is **dynamic** and does not rely on hard-coded xpaths.
   - The code should be flexible enough to accommodate changes in the country name
   - If the country name changes (e.g., from "USA" to "Canada"), the same logic should still work, and the output should reflect the correct entries based on the updated country.
         */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");
        List<WebElement> country=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count=1;
        for(WebElement usa:country){
            String USA=usa.getText();
            if(USA.equals("USA")){
                System.out.println(count);
                WebElement row=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(row.getText());
            }

            count++;
        }

    }
}
