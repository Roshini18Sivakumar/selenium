package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args)  {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\ex\\chromedriver.exe");
//    WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\edge\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
    
    driver.manage().window().maximize();
    driver.get("https://demo.automationtesting.in/Frames.html");
  
//    //single frame
//    WebElement Frame1=driver.findElement(By.id("singleframe"));
//    
//    driver.switchTo().frame(Frame1);
//    
//    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
//    
//    driver.switchTo().defaultContent(); 
//    
//
    //Multiple frames
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
    WebElement Multi1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
    
    driver.switchTo().frame(Multi1);
    
    
    WebElement Multi2=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
    
    driver.switchTo().frame(Multi2); 
    
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rosh");
     
    
    
    
    
	}

}
