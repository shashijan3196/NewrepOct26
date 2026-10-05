package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG3 {

	@Test
	public void method1()
	{
      System.out.println("Method1 Class 3");
	}
	
	@Test(dataProvider = "getData")
	public void method2(String username, String psw)
	{
      System.out.println("Method2 Class 3");
      System.out.println(username);
      System.out.println(psw);
    }
	
	@Test
	public void method3()
	{
	  System.out.println("Method3 Class 3");
    }
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2] ;
		data[0][0] = "username";
		data[0][1] = "password";
		
		data[1][0] = "username";
		data[1][1] = "password";
		
		data[2][0] = "username";
		data[2][1] = "password";
		return data ;
				
	}
	
}
