package exception;

public class stopfinelly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
		        System.out.println(args[0]);
		        }catch (ArrayIndexOutOfBoundsException e) {
		            // TODO: handle exception
		            System.out.println("Exception "+ e);
		        }
		        finally {
		            System.out.println(args[0]);
		            System.out.println("Finnally Block executed");
		        }
	}

}
