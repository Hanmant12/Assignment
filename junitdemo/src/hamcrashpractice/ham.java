package hamcrashpractice;

import org.junit.Assert;
import org.junit.Test;

public class ham {

	private static final String NullValue = null;
	@Test
	public void stat()
	{
		String name="hello";
		Assert.assertTrue(name,name.contains(name));
	}
	@Test
	public void get()
	{
		String s="pqr";
		Assert.assertTrue(s,s.startsWith(s));
	}
	@Test
	public void get1()
	{
		String s="pqr";
		Assert.assertNotSame(s,s.concat(s));
	}
	
}
