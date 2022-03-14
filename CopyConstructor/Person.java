package CopyConstructor;

class Person1
{
    public
        int age;
        Person1(int age) { this.age=age;}
}
public class Person
{
    public static void main(String args[ ])
    {
            Person1 a=new Person1(10);
            Person1 b=new Person1(15);
            Person1 c = a;
            System.out.println(a.age+" "+b.age+" "+c.age);
            a.age = 23;
            System.out.println(a.age+ " "+b.age+" "+c.age);
        }
}