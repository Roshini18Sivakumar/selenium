package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpaths {
	public static void main(String[]args) 
	{
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\edge\\msedgedriver.exe");
		//WebDriver d=new EdgeDriver();      
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\chromee\\chromedriver.exe");
//		WebDriver d=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d=new ChromeDriver(options);
		d.get("https://www.facebook.com/");
		 
		//d.close();
//		WebElement user = d.findElement(By.id("email"));
//	    user.sendKeys("roshini123@gmail.com");	
//		d.findElement(By.id("pass")).sendKeys("34567uh");
//		//d.findElement(By.name("login")).click();
//		d.navigate().to("https://www.twitter.com/");
		d.manage().window().maximize(); 
		
		d.switchTo().newWindow(WindowType.TAB);
		d.get("https://www.myntra.com/");
		
			
	}

}
