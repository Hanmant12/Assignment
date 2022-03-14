package exception;
class UserException extends Exception
{    public UserException()
    {    System.out.println("Divide by zero exception");
    }
}
public class userdefinedexc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
        a=10; b=0;
        try
        {    if(b==0)
                throw new UserException();
            else
                System.out.println("Q"+a/b);
        }
        catch(Exception e)
        {
        }
	}

}
