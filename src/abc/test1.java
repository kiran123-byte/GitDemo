package abc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void near()
	{
		System.out.println("print");
		
	}

	
	@BeforeMethod
	public void far()
	{
		System.out.println("if");
	}
}
