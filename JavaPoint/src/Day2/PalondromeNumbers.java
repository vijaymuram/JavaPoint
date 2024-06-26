package Day2;
import java.util.Scanner;
public class PalondromeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int t=n;
		int rev=0;
		while(t!=0)
		{
			int d=t%10;
			rev=rev*10+d;
			t=t/10;
		}
		if(rev==n)
		{
			System.out.println("it is a palondrome number");
		}
		else
		{
			System.out.println("it is not a palondrome number");
		
		}
	}
	

}
