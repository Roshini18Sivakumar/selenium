package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\edge\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts"); 
	

		WebElement clickbtn1= driver.findElement(By.id("alertButton"));
		clickbtn1.click();
		org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		WebElement clickbtn2= driver.findElement(By.id("timerAlertButton"));
		clickbtn2.click();
		Thread.sleep(5000);
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		Thread.sleep(5000);
		alert2.accept();

		WebElement clickbtn3= driver.findElement(By.id("confirmButton"));
		clickbtn3.click();
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		Thread.sleep(5000); 
		alert3.accept(); 

		WebElement clickResult1=driver.findElement(By.id("confirmResult"));
		System.out.println(clickResult1.getText());

		WebElement clickbtn4= driver.findElement(By.id("promtButton"));
		clickbtn4.click();
		org.openqa.selenium.Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("hello");
		Thread.sleep(5000);
		alert4.accept();
 
		WebElement clickResult2=driver.findElement(By.id("promptResult"));
		System.out.println(clickResult2.getText());
	} 
}