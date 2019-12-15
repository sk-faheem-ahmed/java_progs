import java.io.FileWriter;
import java.util.Scanner;
class MyFile
{
	public static void main(String[] args)  throws Exception
	{
		FileWriter file = new FileWriter("MyFile.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Of Lines : ");
		int lines = sc.nextInt();
		for(int j=0;j<=lines;j++)
		{
			String line = sc.nextLine();
			file.write(line);
		}	
		file.close();
	}
}