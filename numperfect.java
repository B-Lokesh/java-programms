import java.util.*;
class numperfect
{
		static boolean funn (int a)
		{
                        int sum=0;
			for(int i=1;i<a;i++)
			{
				if(a%i==0)
				{
				  sum=sum+i;	
				}
			}
			if(sum==a)
			      return true;
			else
			     return false;   
		}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(funn(n));
	}
}