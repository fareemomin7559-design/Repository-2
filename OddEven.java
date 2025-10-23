package numbers;
import java.util.*;
public class OddEven {
	
	  private int n;
	Scanner Sc=new Scanner(System.in);
	
	  public void OddorEven()
	 
	{
		System.out.println("Enter a Number : ");
		n=Sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is Even !");
		}
		else
		{
			System.out.println("Number is Odd !");
		}
	}
	
	
	
}
