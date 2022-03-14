package Array;

public class sumofelementuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;
         int n[ ]=new int [10];
         for(int i=0;i<5;i++)
         {    n[i]=Integer.parseInt(args[i]);
             sum=sum+n[i];
         }
         System.out.println("Total="+sum);
	}

}
