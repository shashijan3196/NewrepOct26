package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@AfterTest
	public void test1()
	{
		System.out.println("After every method");
	}
	
	@Test(groups = { "Smoke"} )
	public void test2()
	{
		System.out.println("Class1 and test 2 method");
	}
	
	@Test
	public void test3()
	{
		
		System.out.println("Class 1 and test3 method");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test4()
	{
		System.out.println("Class 1 and test4 method");
	}
	
	@Test
	public void test5 ()
	{
		System.out.println("Class 1 and test5 method");
	}
	
	@BeforeTest
	public void test6()
	{
		System.out.println("Before every method");
	}
	

}
