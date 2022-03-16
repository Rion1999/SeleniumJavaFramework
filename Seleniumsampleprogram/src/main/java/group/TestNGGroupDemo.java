package group;

import org.testng.annotations.Test;
@Test(groups = {"all"})
public class TestNGGroupDemo {
		@Test(groups = {"sanity"})
		public void test1(){
			System.out.println("test1");
		}
		@Test(groups = {"smoke"})
		public void test2(){
			System.out.println("test2");
		}
		@Test(groups = {"regression"})
		public void test3(){
			System.out.println("test3");
			
	}
		@Test(groups = {"windows.regression"})
		public void test4(){
			System.out.println("test4");
			
	}
		@Test(groups = {"linux.regression"})
		public void test5(){
			System.out.println("test3");
			
	}
}

