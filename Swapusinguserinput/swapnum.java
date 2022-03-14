package Swapusinguserinput;

import java.util.Scanner;

public class swapnum {

	int a,b;
	Scanner sc=new Scanner(System.in);
	public void get()
	{
		System.out.println("enter value");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void swap()
	{

		a=a+b;
        b=a-b;
        a=a-b;
	}
	public void swapusing()
	{
		int temp;
        temp =a;
        a=b;
        b=temp;
	}
	 public void display()
     {    System.out.println ("value of a: "+a+"  value of b: "+b);
     }
	
}
