package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetWebelements{

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Roshini\\eclipse-workspace\\Selenium\\edge\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	driver.get("https://www.amazon.in/");
//	String s =driver.getTitle();
//	System.out.println(s);
	driver.get("https://www.facebook.com/");
//	String p =driver.getTitle();
//	System.out.println(p);
//	if(s.equals(p))
//	{
//		System.out.println("titles are same");
//
//	}
//	else {
//		System.out.println("titles are not same");
//		
//	}
//	System.out.println(s==p);
//	driver.manage().window().maximize(); 
	//Thread.sleep(2000);
	//driver.manage().window().minimize();
	//Thread.sleep(2000);
	//Dimension d=new Dimension(500,500);
	//driver.manage().window().setSize(d);
	//Point q =new Point(250,250);
	//driver.manage().window().setPosition(q);
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("roshini123@gmail.com");
	
	driver.findElement(By.id("pass")).sendKeys("34567uh");
	driver.findElement(By.name("login")).click();

	Thread.sleep(10000); 
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskabkin-21%26hvadid%3D72567844807455%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	driver.findElement(By.name("email")).sendKeys("roshiii@gmail.com");
	driver.findElement(By.id("continue")).click();
	
	driver.get("https://www.nykaa.com/auth/verify?ptype=auth&redirect=%2F");
	driver.findElement(By.name("emailMobile")).sendKeys("roshini456@gmail.com");
	driver.findElement(By.id("submitVerification")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("userName")).sendKeys("Roshhh");
	driver.findElement(By.name("phoneNumber")).sendKeys("2345687");
	driver.findElement(By.name("password")).sendKeys("drftgh");

	
}

	
}
