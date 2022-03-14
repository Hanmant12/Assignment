package ConstructorDemo;

public class Demo {

	int a,b,c;
	Demo()
	{
		System.out.println("default constructor");
	}
	public Demo(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a+" "+b+" "+c);
	}
	 Demo(Demo p)
	 {
		 a = p.a; b=p.b;  c=p.c;
	 }
	   void sum()
       {    System.out.println("sum of the values:"+ (a+b+c));
       }
}
