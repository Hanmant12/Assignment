package thread;

public class threado {
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
	threado t=new threado();
t.start();
}
	

}
