package abstraction;
abstract class Shape1
{    public String color;
    public Shape1() {  }
    public void setColor(String c) { color = c; }
    public String getColor()
    {    return color;
    }
    abstract public double area();
}
public class demo1 extends Shape1
{    static int x, y;
    public demo1() {    x = 0;  y = 0;}
    public double area() {    return 0;    }
    public double perimeter() {    return 0;     }
    public static void print()
    {    System.out.println ("point: " + x + "," + y);
    }}
//public class demo1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Shape1 p = new Shape1();
//		p.print();
//	}

//}
