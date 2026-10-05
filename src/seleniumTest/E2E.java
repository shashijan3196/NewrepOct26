package seleniumTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	 String From ="BLR";
	 String To = "MAA";
	 int FrmDate= 15;
	 int ReturnDate = 20;
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
       driver.get("https://www.spicejet.com/");
       driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).click();
       driver.findElement(By.xpath("//div[text()='"+From+"']")).click();
       driver.findElement(By.xpath("//div[text()='"+To+"']")).click();
      
       Thread.sleep(1000);
      
	   driver.findElement(By.xpath("//*[@data-testid='undefined-calendar-day-"+FrmDate+"']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[contains(@data-testid,'return-date')]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@data-testid='undefined-month-September-2026']//*[@data-testid='undefined-calendar-day-"+ReturnDate+"']")).click();
       
   System.out.println(   driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-homxoj r-ubezar\"])[1]")).getText());
       
       driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
 
       Assert.assertEquals( driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-homxoj r-ubezar\"])[1]")).getText() , "Tue, 15 Sep 2026");
       
       
       int i=1;
       while(i<5)
       {
       driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
       i++;
       }
     WebElement done=  driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']"));
    Actions action = new Actions(driver);
    action.scrollToElement(done).perform();

    		done.click();
    		
    		
    driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']//following::div[4]/div[1]/div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
   WebElement currency =driver.findElement(By.xpath("//div[text()='OMR']"));
   action.scrollToElement(currency).perform();
   currency.click();
   System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-7o8qx1'])[1]")).isSelected());
   driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-7o8qx1'])[1]")).click();
   Thread.sleep(1000);
   System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-7o8qx1'])[1]")).isSelected());
   
  System.out.println( driver.findElements(By.xpath("//div[@class=\"css-1dbjc4n r-7o8qx1\"]")).size());
  
   driver.findElement(By.xpath("//div[text()='Search Flight']/parent::div")).click();
	}

}
