package myTestNGPackage;
import org.testng.annotations.Test;

public class Program {

	@Test(priority=1)
	public void studentlogin(){
		
		System.out.println("Login into student account");
	}
	@Test(priority=0)
public void studentlogout(){
		
		System.out.println("Logout from student account");
	}
}
