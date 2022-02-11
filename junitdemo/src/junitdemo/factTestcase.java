package junitdemo;

import org.junit.Test;

import junit.framework.Assert;

public class factTestcase {

	@Test
	public void TestFact()
	{
		int fact=120;
		fact f=new fact();
		int re=f.fact(5);
		Assert.assertEquals(fact, re);
	}
}
