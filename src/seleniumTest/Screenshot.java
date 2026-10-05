package seleniumTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     WebDriver driver  = new ChromeDriver();
     driver.get("https://www.google.com/");
     
     // webpage screenshot-----------------
//    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(scr, new File("C://Users//shash//OneDrive//Pictures//.newss.png"));
 
     //specific element screenshot-----------------------------------------------
   WebElement element = driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]"));
   element.sendKeys("facebook");
    File scr =element.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scr, new File("logo.png"));
    
     
     
     
     
     
     
	}

}
