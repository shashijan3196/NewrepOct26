package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.48.0");
	System.out.println( driver.getCurrentUrl());
	System.out.println(  driver.getTitle());
	if(driver.getTitle().equals("Maven Repository"))
	{ System.out.println("if case passed "); }
	else
	{
		System.out.println("else excecuted");
	}
	// System.out.println(driver.getPageSource()); -- to get the complete html source code of current web page
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.close();

	}

}
