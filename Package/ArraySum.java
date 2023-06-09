package Package;
public class ArraySum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] mark = {1,2,3,4,5,6,7,8,9,};
		int sum = 0;
			for (int i=0;i<mark.length;i++)
				{
					sum += mark [i];
				}
		System.out.println("Total sum is "+sum);
	}
}
