package junitpractice;

public class fact {

	public int fact(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return fact(num-1)* num;
		}
	}
}
