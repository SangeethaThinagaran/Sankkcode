package test.Amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Amazon_IRetryAnalyzerProgram implements IRetryAnalyzer {
int initialCount=0;
int retryCount=3;
@Override
public boolean retry(ITestResult result) {
	{
		while(initialCount<retryCount) {
			initialCount++;
			return true;
		}
	}
	return false;
}



}
