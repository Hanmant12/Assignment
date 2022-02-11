package junitdemo;

import org.junit.Assert;
import org.junit.Test;



public class testreverse {

	@Test
	public void rev()
	{
		int rev=1230;
		reverse r=new reverse();
		int p=r.print(0);
		Assert.assertEquals(rev, p);
		
	}
}
