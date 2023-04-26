package Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClas {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\newEdge\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
        
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        
        Actions a=new Actions(driver);
        
        WebElement mob=driver.findElement(By.xpath("//a[text()='Mobiles']"));
        a.contextClick(mob).perform();
        
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        
        
        

	}

}
