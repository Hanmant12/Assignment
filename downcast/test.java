package downcast;

abstract class A
{

	protected abstract void disp();
}
class B extends A
{    protected void disp()
        {    System.out.println ("Well");
        }
}
class test
{        public static void main(String args[ ])
        {    A t;
            B k=new B();
               t=(A)k;   
               t.disp();
        }
}