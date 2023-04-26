package Day1;

import java.io.File;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\ex\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.netflix.com/in/Login");
		TakesScreenshot ts= (TakesScreenshot) driver;

		File source=ts.getScreenshotAs(OutputType.FILE);

		//to get timestamp
		Date date=new Date(); 
		String FileName = date.toString().replace(":", "_").replace(" ", "_");

		File destination=new File("C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\Screenshot\\"+"netZ"+FileName+".png");

		FileUtils.copyFile(source,destination);

		//get file name
		System.out.println(destination.getName());
 
		System.out.println("screenshot taken");

		driver.close();
	}
}