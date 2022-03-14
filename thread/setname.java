package thread;

public class setname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Thread obj=Thread.currentThread();
          System.out.println ("Current="+obj);
          obj.setName ("MERABHARATH");
          obj.setPriority(7);
          System.out.println ("After="+obj);
	}

}
