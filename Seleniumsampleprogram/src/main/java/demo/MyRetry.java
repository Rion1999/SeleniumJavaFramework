package demo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {
public int retrycount=0;
public int maxretrycount=3;
	public boolean retry(ITestResult result) {
		if(retrycount<maxretrycount) {
			retrycount++;
			return true;
		}
		return false;
	}

}
