package thiskeyword;
class Rectangle
{    int length,breadth;
      void show(int length,int breadth)
    {    this.length=length;
            this.breadth=breadth;
    }
      int calculate()
    {    return(length*breadth);
      }
}
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rectangle=new Rectangle();
         rectangle.show(5,6);
         int area = rectangle.calculate();
         System.out.println("The area of a Rectangle is  :  " + area);
	}

}
