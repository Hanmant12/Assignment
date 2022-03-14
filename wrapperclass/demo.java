package wrapperclass;

import java.util.Scanner;

class A
{    int x,y;
    void readdata()
    {    Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
    }
    void printdata()
    {    System.out.println("x="+x+"\n"+"y="+y);
    }
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a[ ]=new A[5];
        for(int i=0;i<5;i++)
        {    a[i]=new A();
            a[i].readdata();
            a[i].printdata();
        }
	}

}
