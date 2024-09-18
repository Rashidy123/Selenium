package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");
        WebElement book3=driver.findElement(By.xpath("//input[@id='least-favorite']"));
        book3.sendKeys("book3");
        WebElement book2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        book2.sendKeys("book2");
        WebElement book1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        book1.sendKeys("book1");
        WebElement Book1=driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        Book1.sendKeys("Book11");
        WebElement Book2=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        Book2.sendKeys("Book22");
        WebElement Book3=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        Book3.sendKeys("Book33");
        WebElement grandPa=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandPa.sendKeys("Grandpa");
        WebElement father=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        father.sendKeys("Father");
        WebElement child=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Child");

        driver.quit();
    }
}
