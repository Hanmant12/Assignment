package thread;
class AA extends Thread
{    int i;     public void run()
    {    System.out.println("Thread A");
        for(i=0;i<5;i++)
        {    
        	Thread.yield();
        	 System.out.println("Thread A : "+i);    
       
        }
    }
} class B extends Thread
{    int i;     public void run()
    {    System.out.println("Thread B");
        for(i=0;i<5;i++)
        {    System.out.println("Thread B : "+i);  
         Thread.yield();
        }
    }
} class C extends Thread
{    int i;     public void run()
    {    System.out.println("Thread C");
        for(i=0;i<5;i++)
        {    System.out.println("Thread C : "+i);  
        Thread.yield();
        }
    }
}
public class implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA(); B b = new B();     C c = new C();
        a.start(); b.start(); c.start();
	}

}
