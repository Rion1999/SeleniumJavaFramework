package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemoTest2 {
	@Test
	public void test4(){
		System.out.println("test1");
	}
	@Test
	public void test5(){
		System.out.println("test2");
	}
	@Test
	public void test6(){
		System.out.println("test3");
		throw new SkipException("this is skipped");
	}

}
