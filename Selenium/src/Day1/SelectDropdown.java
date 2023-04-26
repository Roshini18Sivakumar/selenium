package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown 
{
	public static void main(String[] args, int length)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\ex\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement FirstName= driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Rosh");
		driver.findElement(By.name("lastname")).sendKeys("Siva");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("qwerty@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwerty");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select selectday= new Select(day);
		//selectday.selectByIndex(2);
		selectday.selectByVisibleText("3");
	//	selectday.selectByIndex(2);
		
		
		Select selectmonth= new Select(month); 
		//selectmonth.selectByIndex(2);
		selectmonth.selectByVisibleText("Apr");
		
		Select selectyear= new Select(year);
		//selectyear.selectByIndex(23);
		selectyear.selectByValue("2016")  ;
	}
		public static void selectvaluefromdropdown(WebElement element, String value, int length) {
			Select select=new Select(element);
			select.selectByVisibleText(value);
		
		Select selectday = null;
		List<WebElement>list=selectday.getOptions(); 
		
	    WebElement firstIndex=list.get(5);
	    
	    int middle=(length/2);
	     
	    WebElement lastIndex=list.get(30);
	    String lastin=lastIndex.getText();
	    System.out.println(lastin);
	    
	   // for (int i=select.

		
		
		
		
	
//		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();//select gender
		
		
		

	}
}