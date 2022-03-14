package exception;

import java.util.Scanner;

public class arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
        System.out.println("Enter two integer values");
        Scanner scon = new Scanner(System.in);
        a = scon.nextInt();
        b = scon.nextInt();
        try   
        {    c=a/b;
            System.out.println ("Quotient="+c);
        }
        catch(Exception e)
        {    System.out.println(e);
        }
	}

}
