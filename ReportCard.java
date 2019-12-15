import java.util.Scanner;
class ReportCard
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Name of Student : ");
		Scanner sc = new Scanner(System.in);
		String Sname = sc.nextLine();
		System.out.print("Enter the Number of Subjects : ");
		int NoOfSubjects = sc.nextInt();
		int markslist[] = new int[NoOfSubjects];
		for(int i = 1;i<=markslist.length;i++)
		{
			System.out.print("Enter the Marks for Subject"+i+" :");
			markslist[i-1] = sc.nextInt();
		}
		PrintReport(Sname, NoOfSubjects, markslist);
	}
	static void PrintReport(String fname, int num, int[] marks)
	{
		int Total = 0;
		System.out.println("-----------------------------------");
		System.out.println("Name \t\t"+fname);
		System.out.println("-----------------------------------");
		System.out.println(" 	     REPORT CARD 			   ");
		System.out.println("-----------------------------------");
		for(int i = 1;i<=num;i++)
		{
			System.out.println("Mark for Subject"+i+"\t\t"+marks[i-1]);
			Total = Total + marks[i-1];
		}
		System.out.println("-----------------------------------");
		System.out.println("Total : "+Total);
		float totalPercent  = (((float)Total/((float)marks.length*100)))*100;
		System.out.println("Total Marks : "+Total+" Percentage "+totalPercent+"%");
		System.out.println("-----------------------------------");
		if(totalPercent >35 && totalPercent < 50)
		{
			System.out.println("Result \t\t "+"PASS - GRADE C ");
		}
		else if(totalPercent >50 && totalPercent < 60)
		{
			System.out.println("Result \t\t "+"PASS - GRADE C ");
		}
		else if(totalPercent >60 && totalPercent < 70)
		{
			System.out.println("Result \t\t "+"PASS - GRADE B ");
		}
		else if(totalPercent >70 && totalPercent < 80)
		{
			System.out.println("Result \t\t "+"PASS - GRADE A ");
		}
		else if(totalPercent >80 && totalPercent < 90)
		{
			System.out.println("Result \t\t "+"PASS - GRADE A+ ");
		}
		else if(totalPercent >90)
		{
			System.out.println("Result \t\t "+"PASS - GRADE A++ ");
		}
		else
		{
			System.out.println("Result \t\t "+"FAIL");
		}
		System.out.println("-----------------------------------");
	}
}