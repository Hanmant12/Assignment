package beforeannotaion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;
import junitdemo.calculator;

public class testcase {
	  int x=0;
	    int y=0;
	    int result=0;
	    calculator calculator =null;
	    @BeforeClass
	    public static void beforeclass()
	    {
	    	System.out.println("before class");
	    }
	    @AfterClass
	    public static void afterclass()
	    {
	    	System.out.println("after class");
	    }
	    @Before
	    public void setup(){
	         x=30;
	         y=20;
	        result=50;
	        calculator =new calculator();
	    }
	@Test
	public void addtionTest(){
         x=30;
      y=20;
         result=50;
       // calculator calculator = new calculator();
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
		 x=30;
          y=20;
       result=600;
       // calculator calculator = new calculator();
        int finalResult=calculator.multipilication(x,y);
        Assert.assertEquals(result, finalResult);
	}
	
	  @After
	    public void cleaning(){
	        x=0;
	        y=0;
	        calculator =null;
	    }
	  @Test
		@Ignore
		public void show()
		{
			
		}
}
