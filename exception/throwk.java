package exception;

public class throwk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
         {
         throw new ArithmeticException("Hello");
         }
         catch(ArithmeticException e)
         {    System.out.println(e.getMessage());
         }
	}

}
