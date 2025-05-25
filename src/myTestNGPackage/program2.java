package myTestNGPackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class program2 {
	@BeforeSuite
	public void beforeSuite() {
	
	 System.out.println("Before Suite");
	}
	@BeforeClass
	public void beforeclass() {
	
	 System.out.println("Before class");
	}
	
	@AfterClass
	public void afterclass() {
	
	 System.out.println("After class");
	}
	@Test
	public void simplefunction() {
		System.out.println("simple function");
	}
	@Test
	public void complexfunction() {
		System.out.println("complex function");
	}
	@BeforeTest
	public void beforeTest() {
	
	 System.out.println("BeforeTest");
	}
	@BeforeMethod
	public void beforemethod() {
	
	 System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test(priority=3)
	public void adminlogin() {
		
		System.out.println("login into adminstration account");
	
	}
	@Test(priority=2)
	public void adminlogout() {
		
		System.out.println("logout from adminstration account");
	}
	@Test(dependsOnMethods= {"adminlogin"})
	public void placement() {
		
		System.out.println("Placement dependant on student login");
	}
}
