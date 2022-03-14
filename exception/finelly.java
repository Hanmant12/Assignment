package exception;

public class finelly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int x[]=new int[10];
          try
          {    x[20]=100;
          }
          catch(ArrayIndexOutOfBoundsException e)
          {    System.out.println("Exception cought");
          }
          finally
          {      System.out.println("Not Possible to print");
                 System.out.println("quit");
          }
	}

}
