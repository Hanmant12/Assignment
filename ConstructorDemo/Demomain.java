package ConstructorDemo;

public class Demomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Demo d1=new Demo(4,5,6);
		Demo d2=new Demo(d1);
		d.sum();
		d1.sum();
		d2.sum();
		
	}

}
