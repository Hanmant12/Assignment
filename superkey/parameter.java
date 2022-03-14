package superkey;

class std
{    public std(String name)
    {    System.out.println ("super "+name);
    }
}
class show extends std
{    public show(int score)
    {    super ("Dr. Tarkeshwar");
                     System.out.println ("sub "+score);
    }
}
public class parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 show obj=new show(10);
	}

}
