package Conditionaloperator;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 5;
         int y = 10, result=0;
      boolean bl = true;
         if((x == 5) && (x < y))
       System.out.println("value of x is "+x);
         if((x == y) || (y > 1))
       System.out.println("value of y is grater than the value of x");
        result = bl ? x : y;
       System.out.println("The returned value is "+result);
	}

}
