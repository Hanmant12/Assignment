package Arithmaticoperator;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=4;
         int y=6;
         int z=10;
         int rs=0;
         rs = x + y;
         System.out.println("The addition of (x+y):"+ rs);
         rs  = y - x;
         System.out.println("The subtraction of (y-x):"+ rs);
         rs = x * y;
         System.out.println("The multiplication of (x*y):"+ rs);
         rs = y / x;
         System.out.println("The division of (y/x):"+ rs);
         rs = x + (y * (z/x));
         System.out.println("The result is now :"+ rs);
	}

}
