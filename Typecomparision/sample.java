package Typecomparision;

class X
{    int i, j;
}
class Y
{    int i, j;
}
class Z extends X
{    int k;
}
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 X x = new X();
         Y y = new Y();
         Z z = new Z();
         if(x instanceof X)
             System.out.println("x is instance of X");
         X obj;
         obj = z; // X reference to Z
         if(obj instanceof Z)
             System.out.println("obj is instance of Z");
	}

}
