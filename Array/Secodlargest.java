package Array;

public class Secodlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};
		int max=Integer.MIN_VALUE;
		int max1=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max1 && a[i]!=max)
			{
				max1=a[i];
			}
		}
		System.out.println(max1);
	}

}
