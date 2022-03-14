package abstraction;
abstract class A
{    public void show()
    {    System.out.println ("class a is  super class");   
    }
          abstract void display(int x);
}
class B extends A
{    public void show()
    {    super.show();
        System.out .println ("class b is sub class");   
    }
     void display(int x)
    {    System.out.println(" x is in sub class "+x);
    }
}
public class abstractclassmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  B b=new B();
          b.show();
       b.display(3);
	}

}
