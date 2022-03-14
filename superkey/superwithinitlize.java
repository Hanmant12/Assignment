package superkey;
//Java program demo for super keyword with initialize
class A
{    int a=10;
             public void show()
    {    System.out.println ("Class A is good");
    }
}
class B extends A
{    public void show()
    {    super.show();
                     System.out.println ("Class B is good"+ super.a);
    }
}
class C extends A
{    public void show()
    {    super.show();
                   System.out.println ("Class C is good");
    }
}
public class superwithinitlize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  A a=new A();
          B b=new B();
          C c = new C();
                       a.show();
          b.show();
          c.show();       

	}

}
