package SeleniumHWs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");
        WebElement inspectMe=driver.findElement(By.xpath("//div[@id='textattr']"));
        String text=inspectMe.getText();
        if(text.equals("inspect me to view my custom attribute")){

            System.out.println("inspect me to view my custom attribute!");
        }else{
            System.out.println("The retrieve is not matching ");
            }
        WebElement musicl=driver.findElement(By.xpath("//input[@value='music_festival']"));
        if(musicl.isEnabled()) {
            musicl.click();
        }
        WebElement TechTalk=driver.findElement(By.xpath("//input[@value='tech_talk']"));
        if( TechTalk.isDisplayed()) {
            System.out.println("The Tech Talk radio box is disabled ");
            WebElement showMore = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
            showMore.click();
            WebElement art = driver.findElement(By.xpath("//label[@id='hiddenRadioLabel']"));
            if (art.isDisplayed()) {
                art.click();
            }
        }
            WebElement att=driver.findElement(By.xpath("//div[@id='hidden_message']"));
            String print =att.getAttribute("title");
            System.out.println(print);
            WebElement checkBox1=driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
            if(checkBox1.isEnabled()){
                checkBox1.click();
            }
            WebElement checkBox2=driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
            boolean disabled=checkBox2.isEnabled();
            if(!disabled){
                System.out.println("check box2 is disabled");
            }
            WebElement clear1=driver.findElement(By.xpath("//input[@id='inputField']"));
            clear1.clear();
            Thread.sleep(2000);
            clear1.sendKeys("here is the custom text entered");







    }
}
