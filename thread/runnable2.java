package thread;
class threadname implements Runnable
{   
          int x;  String name;
            public threadname(String n)
            {   
                name=n;
             }
           public void run()
             {   
                  for(x=0;x<10;x++)
                       {   
                         System.out.println(name);
                       }
            }
}
public class runnable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadname tc1=new threadname("welcome");
        threadname tc2=new threadname ("SVCE");
     Thread t1=new Thread(tc1);
        Thread t2=new Thread(tc2);
         t1.start();
  t2.start();
	}

}
