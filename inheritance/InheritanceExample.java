package inheritance;

//Write a Java Program for concept of Run-time Polymorphism
class A
{    
	public void fun1(int  x) // method1
	{
		System.out.println("value of A is :" + x);
    }
}
class B extends A // inheriting the parent class
{   
	public void fun2(int  x, int  y) // method2
	
    {    fun1(6);  
        System.out.println("value of B is :" + x + " and " + y);
    }
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B obj=new B();// making object of class
	        obj.fun2(2, 5); // calling function
	}

}
