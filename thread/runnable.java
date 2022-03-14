package thread;
 class firstthread extends Thread
{   
           public void run()
    {   
            System.out.println ("Thread is running….");
    }
    public void start()
    {   
                                              run();
     }
     public static void main(String args[ ])
    {         
                                                firstthread t=new firstthread();
        t.start();
    }
}
 class t1 extends Thread
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
public class runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t1 td=new t1();
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
