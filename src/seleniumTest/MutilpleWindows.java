package seleniumTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutilpleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver  driver =  new ChromeDriver();
        driver.get("https://www.amazon.in");
//        ((JavascriptExecutor) driver).executeScript("window.open('https://www.google.com/')");
//        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com/')");
//        ((JavascriptExecutor) driver).executeScript("window.open('https://www.amazon.com/')");
//     Set<String> windows=  driver.getWindowHandles();
//     ArrayList<String> w = new ArrayList(windows);
//     driver.switchTo().window(w.get(2));
//     Thread.sleep(2000);
//     driver.switchTo().window(w.get(3));
     
//        for(int i=0; i<5 ;i++)
//        {
//        	driver.switchTo().newWindow(WindowType.TAB);
//        	Thread.sleep(2000);
//        }
//        
//        Set<String> windows=  driver.getWindowHandles();
//        ArrayList<String> w = new ArrayList(windows);
//        
//        ArrayList<String> a = new ArrayList(Arrays.asList("https://www.google.com/", "https://www.facebook.com/", "https://www.youtube.com/","https://www.bookmyshow.com/"));
//        for(int i=0 ; i<4 ; i++)
//        {
//        	driver.switchTo().window(w.get(i));
//        	Thread.sleep(2000);
//        	driver.get(a.get(i));
//        	System.out.println(	driver.getTitle());
//        	
//        }
        
        
        ArrayList<String> a = new ArrayList(Arrays.asList("https://www.google.com/", "https://www.facebook.com/", "https://www.youtube.com/","https://www.bookmyshow.com/"));
        for(int i=0; i<a.size();i++) {
        	if(i>0)
        	{
        		driver.switchTo().newWindow(WindowType.TAB);
        		Thread.sleep(1000);
        	}
        	driver.get(a.get(i));
        }
      
        
        
        Set<String> windows=  driver.getWindowHandles();
      for(String wind : windows)
      {  
    	   driver.switchTo().window(wind);
    	   
       if( driver.getTitle().toLowerCase().contains("youtube"))
        {
        	 System.out.println("YouTube window found");
        	break;
        }
      }
      
      
      
	}

}
