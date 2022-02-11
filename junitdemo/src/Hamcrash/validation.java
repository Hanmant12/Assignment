package Hamcrash;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

public class validation {

	@Test
	public void testem()
	{
		String gmail="rajehanmant@hmail.com";
		Assert.assertTrue(gmail.contains("@"));
	}
	@Test
    public void testEmailIDHamcrest(){  // Hamcrest Test case
        String email="tbarua1@gmail.com";
        Assert.assertThat(email, StringContains.containsString("gmail.com"));
    }
	@Test
	public void endwith()
	{
		String name="hanmant";
		//Assert.assertThat(name,name.endsWith(name));
		Assert.assertTrue(name,name.endsWith("nt"));
		Assert.assertTrue(name,name.contains(name));
	}
	@Test
	public void startwith()
	{
		String name="hanmant";
		//Assert.assertThat(name,name.endsWith(name));
		Assert.assertTrue(name,name.startsWith("ha"));
	
	}
	@Test
	public void equalto()
	{
		String h="abc";
		Assert.assertTrue(h,h.equals(h));
	}
	
}
