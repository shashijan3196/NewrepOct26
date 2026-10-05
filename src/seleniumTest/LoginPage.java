package seleniumTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
   driver.manage().window().maximize();
   String d1 ="Monday";
   driver.get("https://testautomationpractice.blogspot.com/");

//   System.out.println( driver.findElement(By.xpath("//input[@class='form-control'][3]")).getText());
//   driver.findElement(By.id("name")).sendKeys("shashi");
//   driver.findElement(By.id("email")).sendKeys("shashijan11@gmail.com");
//   driver.findElement(By.xpath("//input[@placeholder='Enter Phone']")).sendKeys("1234567890");
//   driver.findElement(By.cssSelector("#textarea")).sendKeys("Banglore-560058");
//   driver.findElement(By.id("male")).click();
//  // ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");     //or we can use action class ------
//   
////   Actions a = new Actions(driver);
////    a.scrollByAmount(0, 500).build().perform();
//    
// List<WebElement> days = driver.findElements(By.xpath("//label[@for='days']/following-sibling::div/input"));
// System.out.println(days.size());
// for(WebElement dd : days)
// {
//	String day= dd.getAttribute("value");
//	System.out.println(day);
//
//	if(day.equalsIgnoreCase(d1))
//	{
//		dd.click();
//	}
// }
// 
// Select s = new Select (driver.findElement(By.id("country")));
// // s.selectByIndex(6);
//  //s.selectByContainsVisibleText("Ind");
//    s.selectByVisibleText("India");
// //s.selectByValue("india");
//    
//    Select s1 = new Select(driver.findElement(By.id("colors")));
//    s1.selectByContainsVisibleText("Red");
//    
//
//    Select s2 = new Select(driver.findElement(By.id("animals")));
//    s2.selectByContainsVisibleText("Lion");
//   
//    
//    
//    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//    driver.findElement(By.xpath("//a[text()='16']")).click();
//    
//    String datee = "20";
//    String month = "Jan";
//    String year = "2016";
//    driver.findElement(By.name("SelectedDate")).click();
//   Select s3 = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
//   s3.selectByContainsVisibleText(month);
//   
//   
//   Select s4 = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
//   s4.selectByContainsVisibleText(year);
//   
//   
//  driver.findElement(By.xpath("//a[text()='"+datee+"']")).click();
//    Thread.sleep(1000);
//    
//    
//    driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']")).click();
//    
//    //alert
//    driver.findElement(By.id("alertBtn")).click();
//    driver.switchTo().alert().accept();
//    
//    Thread.sleep(1000);
//    driver.findElement(By.id("confirmBtn")).click();
//    driver.switchTo().alert().accept();
//    
//    Thread.sleep(1000);
//    driver.findElement(By.id("promptBtn")).click(); 
//    Alert at = driver.switchTo().alert();
//   System.out.println( at.getText());
//   Thread.sleep(1000);
//   at.sendKeys("Shashi");
//   at.accept();
//   
//   
//   
//   driver.findElement(By.xpath("//button[text()='New Tab']")).click();
//   Set<String> window = driver.getWindowHandles();
//  Iterator<String> it  =window.iterator();
//  Thread.sleep(1000);
//  driver.switchTo().window(it.next());
//  Thread.sleep(1000);
//  
  
  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
 Actions a2 = new Actions(driver);
 a2.moveToElement(driver.findElement(By.xpath("//button[text()='Point Me']"))).build().perform();
 
 //double click
 a2.moveToElement(driver.findElement(By.cssSelector("#field1"))).doubleClick().doubleClick().build().perform();
		 
 //copy text from  field1
 a2.moveToElement(driver.findElement(By.cssSelector("#field1"))).doubleClick().doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
 
// paste it in field2
 a2.moveToElement(driver.findElement(By.cssSelector("#field2"))).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
 
 //Drag and drop
 WebElement drag =driver.findElement(By.xpath("//div[@id='draggable']"));
 WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));
 a2.dragAndDrop(drag, Drop).build().perform();
 
 // slider
 WebElement liftslider = driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
 WebElement Rightslider = driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
 Thread.sleep(1000);
 a2.dragAndDropBy(liftslider, -15, 0).build().perform();
 Thread.sleep(1000);
 a2.dragAndDropBy(Rightslider, 70, 0).build().perform();
 
 driver.findElement(By.cssSelector("[placeholder=\"Select an item\"]")).click();
 driver.findElement(By.xpath("//*[text()='Item 19']")).click();
 
List<WebElement> Mobiles  =driver.findElements(By.xpath("(//h4)[1]/following-sibling::label"));
  for(WebElement mb : Mobiles)
  {
	  System.out.println(mb.getText());
  }
 
  List<WebElement> LapLinks  =driver.findElements(By.xpath("(//div/h4)[2]/following-sibling::a"));
  for(int i=0 ; i<LapLinks.size(); i++ )
  {
	  
	  LapLinks.get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
  }  
	Set<String>  windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	 while(it.hasNext())
	 {
		 driver.switchTo().window(it.next());
		System.out.println( driver.getTitle());
	 }
  
 
 Thread.sleep(3000);
 driver.quit();
	}

}
