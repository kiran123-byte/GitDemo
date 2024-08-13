package abc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	
	@Test
	public void day()
	{
		System.out.println("hello");
	}
	
	@AfterMethod
	public void eve()
	{
		System.out.println("bye");
	}

}
