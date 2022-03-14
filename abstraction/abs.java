package abstraction;
//Demo for abstract class with empty method shows the no.of sides of shapes.
abstract class Shape
{    public abstract void numberOfSides();
}
class Trapezoid extends Shape
{    public void numberOfSides()
  {    System.out.println("Number of Sides:"+4);
  }
}class Hexagon extends Shape
{    public void numberOfSides()
  {    System.out.println("Number of Sides:"+6);
  }
}class Triangle extends Shape
{    public void numberOfSides()
  {    System.out.println("Number of Sides:"+3);
  }}
public class abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
        s = new Trapezoid();    s.numberOfSides();
        s = new Hexagon();       s.numberOfSides();   
        s = new Triangle();    s.numberOfSides();
	}

}
