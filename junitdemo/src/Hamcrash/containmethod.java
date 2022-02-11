package Hamcrash;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;

import org.junit.Assert;
import org.junit.Test;

public class containmethod {

	@Test
	//@DisplayName("test sucess")
	public void tst()
	{
		Assert.assertThat("rajehanmant@gmail.com",endsWith(".com"));
	}
	@Test
	public void containsw()
	{
		Assert.assertThat("abc", containsString("abc"));
	}
}
