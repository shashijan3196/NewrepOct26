package seleniumTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMutipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver =  new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 driver.manage().window().maximize();
 driver.get("https://www.google.com/");
driver.switchTo().newWindow(WindowType.TAB);
Set<String> window =driver.getWindowHandles();
   Iterator<String> it=window.iterator();
   String parentID= it.next();
   String childID = it.next();
   driver.switchTo().window(childID);
  driver.get("https://www.facebook.com/");
  String title= driver.getTitle();
 System.out.println( driver.getTitle());
 driver.switchTo().window(parentID);
 driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys(title);
 
 
 
  

	}

}
