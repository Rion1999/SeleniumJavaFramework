package exceptiondemo;

public class Exceptionexample {

	public static void main(String[] args) {
		try {
		int i=1/0;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	//finall

}
