package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Edge.Driver","D:\\selenium\\Seleniums\\edge\\msedgedriver.exe");
		WebDriver obj=new EdgeDriver();
		obj.get("https://www.w3schools.com/html/html_tables.asp");
        obj.manage().window().maximize();
    
        WebElement table=obj.findElement(By.id("customers"));
        
		List<WebElement>tr=obj.findElements(By.tagName("tr"));
	//	WebElement th=table.findElement(By.tagName("th"));
		
		for(int i=0;i<tr.size();i++){
			WebElement row=tr.get(i);
			String row1 = row.getText();
			System.out.println(row1);
	        System.out.println("  ");
		
			
				
			List<WebElement>th=row.findElements(By.tagName("th"));
			for(int j=0;j<th.size();j++) {
				
				WebElement head=th.get(j);
				String text=head.getText();
				System.out.println(text);
				System.out.println("  ");
		
			
	}
	}
}}