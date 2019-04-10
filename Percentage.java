import java.util.Scanner;
class Percentage
{
	public static void main(String []arges)
	{
		int p;

		Scanner scan =new Scanner(System.in);
		System.out.println("enter the percentage : ");
		p=scan.nextInt();
 		
		if(p>=75)
		System.out.println("first class with division");

		else if(p>=60)
		System.out.println("first class ");

		else if(p<=60)
		System.out.println("secound class");

		else if(p<=40)
		System.out.println("3rd class");
		
		else if(p<34)
		System.out.println("failed");

		System.out.println("Done");
	}
System.out.println("Done");
}
