import java.util.Scanner;
class MultiplierTable
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		sc.close();
		printMultiplier(n);
	}
	static void printMultiplier(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" x "+i+" = "+i*num);
		}
	}
}