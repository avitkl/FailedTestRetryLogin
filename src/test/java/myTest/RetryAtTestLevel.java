package myTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAtTestLevel {
	
	
	@Test(retryAnalyzer=analyzer.RetryAnalyzer.class)  // One way to implement Retry logic at "Test level"
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test(retryAnalyzer=analyzer.RetryAnalyzer.class)  // One way to implement Retry logic at "Test level"
	public void Test2()
	{
		Assert.assertEquals(true, true);
	}
	

}
