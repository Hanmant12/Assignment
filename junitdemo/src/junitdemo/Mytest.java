package junitdemo;

import org.junit.Test;

import junit.framework.Assert;


public class Mytest {
	
	//@SuppressWarnings("deprecation")
	@Test
	public void addtionTest(){
        int x=30;
        int y=20;
        int result=50;
        calculator calculator = new calculator();
        int finalResult=calculator.addition(x,y);
        Assert.assertEquals(result, finalResult);
}
	@Test
	public void subTst()
	{
		int x=30;
        int y=20;
        int result=10;
        calculator calculator = new calculator();
        int finalResult=calculator.subtraction(x,y);
        Assert.assertEquals(result, finalResult);
	}
	@Test
	public void mult()
	{
		int x=30;
        int y=20;
        int result=600;
        calculator calculator = new calculator();
        int finalResult=calculator.multipilication(x,y);
        Assert.assertEquals(result, finalResult);
	}
	@Test
	public void div()
	{
		int x=30;
        int y=20;
        int result=1;
        calculator calculator = new calculator();
        int finalResult=calculator.division(x,y);
        Assert.assertEquals(result, finalResult);
	}

	
}