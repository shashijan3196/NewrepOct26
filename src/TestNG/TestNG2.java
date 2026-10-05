package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNG2 {
	
	@Parameters({"url","user"})
	@Test
	public void test1 (String url , String user)
	{
		System.out.println("Class TestN2 and Test1 method");
		System.out.println(url);
		System.out.println(user);
	}
	
	@Test(groups= {"Smoke"})
	public void cimon ()
	{
		System.out.println("Class TestNG2 and Test2 method");
	}
	
   @Test
	public void acountt ()
	{
		System.out.println("Class TestNG2 and Test 3 method");
	}
	
}
