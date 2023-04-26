package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//Action class
public class ActionsClas {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\edge\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		Actions a= new Actions(driver);
		
		WebElement login=driver.findElement(By.name("login"));
		a.click(login).perform();
		
		WebElement forgotPass=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		a.contextClick(forgotPass).perform();
		
		driver.get("https://www.amazon.com/");
		
		WebElement cs=driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		a.doubleClick(cs).perform();//double click

		
		
		
		
		
		

	}

}
