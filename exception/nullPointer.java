package exception;

import java.text.DecimalFormat;

public class nullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
         {    double x=100.25;
              DecimalFormat d=null;
              System.out.println(d.format(x));
         }
         catch(NullPointerException e)
         {    System.out.println(e.getMessage());
              System.out.println(e.toString());
              e.printStackTrace();
         }
	}

}
