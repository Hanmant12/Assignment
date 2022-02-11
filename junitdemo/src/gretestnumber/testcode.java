package gretestnumber;

import org.junit.Test;

import junit.framework.Assert;

public class testcode {
	@Test
	 public void findGreaterNumber()

	    {

		int a=6,b=7,c=8;
	        int re=8;

	        //demo d=new demo();
	        int re1=demo.greatest(a,b,c);
	        Assert.assertEquals(re, re1);
	    }
}
