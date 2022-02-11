package assertionexception;

import org.junit.Test;

import junit.framework.Assert;
import junitdemo.calculator;

public class testc {
	@Test(expected=Exception.class)
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
}
