package thiskeyword;
//Variable in subclass hides the variable in the super class
class A
{
    int i;
}
class B extends A
{    int i;         // this i hides the i in A
    B(int a, int b)
    {    super.i = a;     // i in A
            i = b;         // i in B
      }
    void show()
    {        System.out.println("i in superclass: " + super.i);
            System.out.println("i in subclass: " + i);
      }
}
public class subclasshides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B subOb = new B(1, 2);
         subOb.show();
	}

}
