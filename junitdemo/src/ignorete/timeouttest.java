package ignorete;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class timeouttest {

	@Test(timeout=12)
	public void testadd()
	{
		int a=6,b=7;
		int result=13;
		timeout t=new timeout();
		int d=t.add(a, b);
		Assert.assertEquals(result,d);
	}
	@Test
	@Ignore("not ready")
	public void err()
	{
		
	}
}
