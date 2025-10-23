package numbers;
import java.util.*;
public class PrimeorNot {
	/*
	public void checkPrime(int n)
	{
		int d=2;
		while(d<=n/2)
		{
			if(n%d==0)
			{
				System.out.println("Not Prime ! ");
				System.out.println("It is divisible by : "+d);

				break;
			}
			d++;
		}
		if(d>n/2)
		{
			System.out.println("Prime ");
		}
	}
	*/
	Scanner Sc=new Scanner(System.in);
	  private int n;

	public void checkPrime()
	{
		System.out.println("Enter a Number : ");
		n=Sc.nextInt();
		int d;
		for(d=2;d<=n/2;d++)
		{
			if(n%d==0)
			{
				System.out.println("Not Prime ! ");
				System.out.println("It is divisible by : "+d);

				break;
			}
		}
		if(d>n/2)
		{
			System.out.println("Prime ");
		}
	}
}
