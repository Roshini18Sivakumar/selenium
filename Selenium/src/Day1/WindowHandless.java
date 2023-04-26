package Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandless {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\newEdge\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https:/www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.findElement(By.name("q")).sendKeys("iphones");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Starlight, 128 GB)']")).click();
        driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).click();
 
        Set<String> ws=driver.getWindowHandles();
        List<String> win=new ArrayList<>(ws);
        driver.switchTo().window(win.get(1));
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

        
        
	}

}
