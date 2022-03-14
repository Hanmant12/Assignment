package wrapperclass;
class Rodent
{    void eat( )
       {
        }
}
class Mouse extends Rodent
{    void eat( )
       {     System.out.println ("MOUSE Eating");
       }
}
class Gerbil extends Rodent
{    void eat( )
       {     System.out.println("GERBIL Eating");
       }
}
class Hamster extends Rodent
{       void eat( )
       {     System.out.println ("HAMSTER Eating");
       }
}
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent r[ ]=new Rodent[3];
        r[0]=new Mouse();
       r[1]=new Gerbil();
        r[2]=new Hamster();
 r[0].eat();
       r[1].eat();
       r[2].eat();
	}

}
