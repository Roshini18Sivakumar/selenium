package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbXpath {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\ex\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys("roshinisivakumar18@gmail.com"); 

		d.findElement(By.id("pass")).sendKeys("34567uh");
		d.findElement(By.name("login")).click();
		
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//d.findElement(By.name("email")).sendKeys("roshinisivakumar18@gmail.com");

		d.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		d.findElement(By.xpath("//button[@value='1']")).click();
  
//		d.get("http://www.twitter.com/");
//		Thread.sleep(5000);
//		d.findElement(By.xpath("//span[text()='Create account']")).click(); 
//		Thread.sleep(2000);
//	    d.findElement(By.name("name")).sendKeys("rosh");
//	    d.findelement()
//        d.findElement(By.xpath
//		d.findElement(By.xpath
	}
}
