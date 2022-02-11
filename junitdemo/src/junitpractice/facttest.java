package junitpractice;

import org.junit.Test;

import junit.framework.Assert;

public class facttest {

	@Test
	public void testFact()
	{
		int ft=120;
		fact f=new fact();
		int show=f.fact(5);
		Assert.assertEquals(ft, show);
	}
}
