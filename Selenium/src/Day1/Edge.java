package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\edge\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.get("https://www.amazon.in/");
		//String s =driver.getTitle();
		//System.out.println(s);
		
		//TO OPEN NEW TAB AND HIT DIFFERENT LINK
	 	driver.get("https://www.flipkart.com/");
		Thread.sleep(3000); 
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
			
		
//		String p =driver.getTitle();
//		System.out.println(p); 
//		if(s.equals(p))
//		{
//			System.out.println("titles are same");
//
//		}
//		else {
//			System.out.println("titles are not same");
//			
//		}
//   	System.out.println(s==p);
		//driver.close();
	}

}
