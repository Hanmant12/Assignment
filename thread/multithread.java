package thread;
//Java Program demo for Extends Thread Multithreading
class ThreadDemo extends Thread
{   
           int i=0;
             public void run()
            {   
                for(;i<10;i++)
                      {   
                      try
                      {
                           sleep(5000);
                       }
                                  catch(Exception e) {
                            System.out.println("Error in Thread"+e);
                        }           
                                  System.out.println ("Separate Thread:"+i);
                       }
           }
}
public class multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td=new ThreadDemo();
        td.start();
                    for(int j=0;j<10;j++)
        {   
                   try
                      {
                            td.sleep(5000);
                       }
                                catch(Exception e) {
                         System.out.println("Error "+e);
                      }
                                System.out.println("Main Thread:"+j);
        }
	}

}
