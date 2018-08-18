import java.util.Scanner;
class LinearSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("enter how many numbers");
		int n=sc.nextInt();
		int a[]=new int[n],i;
		for(i=0;i<n;i++)
		{
		System.out.print("enter element"+(i+1)+":");
		a[i]=sc.nextInt();
		}


		System.out.print("enter element to search");
		int item= sc.nextInt();
		boolean found=false;
		for(i=0;i<n;i++)
		{
			if(a[i]==item)
			{
				found = true;
				break;
			}
		}
		if(found==true)
			System.out.print("found at pos"+(i+1) );
		else
			System.out.print("not found");
	}
}
