import java.util.Scanner;
class PrintNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int x = sc.nextInt();
		printTheNumbers(x);
	}
	static void printTheNumbers(int x)
	{
		System.out.println("The list of Numbers till "+x+" in Sequence is :");
		for(int i=1;i<=x;i++)
		{
			System.out.println(i);
		}
		System.out.println("The list of numbers till "+x+" as a list is ");
		for(int j = 1;j<=x;j++)
		{
			if (j == x)
			{
				System.out.print(j);
			}
			else
			{
				System.out.print(j+", ");
			}
		}
	}
}