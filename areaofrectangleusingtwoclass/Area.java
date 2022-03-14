package areaofrectangleusingtwoclass;

/* Simple Java Program For Claculating Area Of A Rectangle Using two Classes */
class TwoClasses
{    float length, breadth;
    void getdata(float a, float b)
    {    length = a;
        breadth = b;
    }
}
class Area
{    public static void main(String args[ ])
    {    float area;
        TwoClasses Rectangle = new TwoClasses();
        Rectangle.getdata(5,5);
        area = Rectangle.length * Rectangle.breadth;
        System.out.println("Area : "+area);
    }
}
