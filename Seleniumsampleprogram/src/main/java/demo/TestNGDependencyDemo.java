package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	@Test(dependsOnGroups = {"Sanity1"},priority=1)
	public void test1(){
		System.out.println("test1");
	}
	@Test(groups = "Sanity1")
	public void test2(){
		System.out.println("test2");
	}
	@Test(priority=0)
	public void test3(){
		System.out.println("test3");
		
}
}
