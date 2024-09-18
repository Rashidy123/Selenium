package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        WebElement Hobbies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        Hobbies.sendKeys("Reading books");
        WebElement click=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        click.click();
        WebElement movie=driver.findElement(By.xpath("//input[@name='favoriteMovies']"));
        movie.sendKeys("Dragon");
        WebElement paragraph=driver.findElement(By.xpath("//label[contains(text(),'vitae qui eligendi commodi')]"));
        String paragraph1=paragraph.getText();
        System.out.println(paragraph1);
        WebElement city=driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("San Diego");
        WebElement personalE=driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        personalE.sendKeys("john12@gmail.com");
        WebElement officeE=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        officeE.sendKeys("john345@gmail.com");
        WebElement ProfessionalE=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        ProfessionalE.sendKeys("john2024@gamail.com");
        WebElement clintN=driver.findElement(By.xpath("//input[@data-detail='one' and @name='clientName']"));
        clintN.sendKeys("Jose");
        WebElement clintId=driver.findElement(By.xpath("//input[@data-detail='two' and @name='clientId']"));
        clintId.sendKeys("1234jose");
        WebElement streetNo=driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNo.sendKeys("1231");
        WebElement houseN=driver.findElement(By.xpath("//input[@data-detail='two' and @name='HouseNo']"));
        houseN.sendKeys("1234");
        driver.quit();

    }
}
