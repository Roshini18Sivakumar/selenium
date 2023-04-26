package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seled1 {
	
 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\ex\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String s =driver.getTitle();
		System.out.println(s);
		driver.get("https://www.flipkart.com/");
		String p =driver.getTitle();
		System.out.println(p);
		if(s.equals(p))
		{
			System.out.println("titles are same");

		}
		else {
			System.out.println("titles are not same");
			
		}
   	System.out.println(s==p);
		driver.close();
	}
	
}
