package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes
{
	public static void main(String[]args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\ex\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@type='submit']//parent::div")).click();
		
		
}
}	