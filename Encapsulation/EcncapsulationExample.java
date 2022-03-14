package Encapsulation;
//Write a Java Program for concept of Encapsulation
class Check
{
	private int amount=0;

	public int getAmount() // getter method
	{
		return amount;
	}

	public void setAmount(int amount) // setter method
	{
		this.amount = amount;
	}
	
}

public class EcncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check(); // creating object of class
		c.setAmount(30); // calling setter
		System.out.println(c.getAmount()); // calling getter

	}

}
