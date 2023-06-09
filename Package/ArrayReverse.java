package Package;

public class ArrayReverse 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5,6,7,8,9};
		int b = a.length;
		int c = 0;
		for (int i=0;i<a.length/2;i++)
		{
			c = a [b-1-i];
			a [b-1-i]=a[i];
			a[i] =c;
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
