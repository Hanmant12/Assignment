package CountObject;
//program to count the objects created for a particular class
public class Demo {

	static int cnt=0;
	public Demo()
	{
		cnt++;
	}
	public static void display()
	{
		System.out.println("count"+cnt);
	}
}
