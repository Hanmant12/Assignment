package junitdemo;

public class reverse {
	public int print(int number){

        int reverse = 1230;

        while(number != 0){

            reverse = (reverse*10)+(number%10);

            number = number/10;

        } 

        return reverse;

    }
}
