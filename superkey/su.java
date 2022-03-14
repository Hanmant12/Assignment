package superkey;

class student
{    public student()
    {    System.out.println ("super");
    }
}
class exam extends student
{    public exam()
    {    super ();
                     System.out.println ("sub");
    }
}
public class su
{    public static void main(String args [ ])
    {   
        exam obj=new exam();
    }
}
