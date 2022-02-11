package junitpractice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class testcase {

	
	
	
	int a=0,b=0;
	int c=0;
	calculator t=null;
	@Before
	public void shows()
	{
		int a=5,b=6;
		int c=0;
	}
	@Test
	public void test()
	{
		 a=5;
		b=6;
		int c=a+b;
		 t=new calculator();
		int d=t.add(a, b);
		Assert.assertEquals(c, d);
		}
	@Test
	public void testm()
	{
		int c=10;
		calculator t=new calculator();
		int re=t.mult(5, 2);
		Assert.assertEquals(c, re);
	}
	@Test
	@Ignore("not ready")
	public void ig()
	{
		
	}
	
	
	
	@Test//(expected=Exception.class)
	public void get()
	{
		int re=5;
		t=new calculator();
		int s=t.sub(10, 5);
		Assert.assertEquals(re, s);
	}
	@Test(timeout=2)
	public void tst()
	{
		System.out.println("hello");
	}
	@After
	public void clean()
	{
		a=0;
		b=0;
		t=null;
	}
}
