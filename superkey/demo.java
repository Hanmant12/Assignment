package superkey;
//this and super keywords
class Counter
{
    int i = 0;
    Counter increment()
    {
        i++;
        return this;
    }
    void print()
    {    System.out.println ("i = " + i);
    }
}
public class demo extends Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Counter x = new Counter();
          x.increment().increment().increment().print();
	}

}
