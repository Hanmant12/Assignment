package thread;

class Th extends Thread
{   
         int i=0;
           public void run()
           {   
               try
                    {   
                    for(;i<10;i++)
                 {    
                           sleep(500);
                           System.out.println("The value is:"+i);
                              }
                  }
                  catch(Exception e)
                 {
                    System.out.println("Error"+e);
                  }
        }}
public class threadmethod 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Th td=new Th();
         Thread t=new Thread();
           td.start();
            try
              {   
                   for(int j=0;j<10;j++)
                {
                       Thread.sleep(500); System.out.println("The value in main:"+j);
               }
                 }
                 catch(Exception a1)
                {
                  System.out.println("Error"+a1);
                }
	}

}
