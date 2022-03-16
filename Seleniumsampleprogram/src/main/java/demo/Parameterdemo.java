package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterdemo {
	@Parameters({"Myname"})
	@Test
	public void test(@Optional("Roy")String name)
	{
	System.out.println("my name is "+ name);	
	}

}
