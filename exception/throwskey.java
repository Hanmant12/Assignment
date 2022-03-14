package exception;
class throwsdemo
{    public throwsdemo() throws NullPointerException
    {    System.out.println("caught");
        throw new NullPointerException("demo");
    }
}
public class throwskey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  {  
			  try
          {  
			  throwsdemo td = new throwsdemo();
          }
        
          catch(NullPointerException e)
          {    System.out.println("recaught");
          }
	}

	}}
