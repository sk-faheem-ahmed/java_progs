import java.util.Scanner;
import java.util.Date;
class MyBankEx {

	public static void main(String[] args) 
	{
		AccountEx acc = null;
		while(true)
		{
			System.out.println("***********************");
			System.out.println("1. Create an Account");
			System.out.println("2. Deposit into an Account");
			System.out.println("3. Withdraw from an Account");
			System.out.println("4. Check Balance of the ");
			System.out.println("5. Exit from Banking ");
			System.out.print("Please Enter an Option : ");
			Scanner sc = new Scanner(System.in);
			int opt = sc.nextInt();
			switch(opt)
			{
				case 1:
					if(acc==null)
					{
						System.out.println("|----------------|");
						System.out.println("Savings (6) or Current (7) :");
						int accopt = sc.nextInt();
						System.out.print("Enter the Account No : ");
						long accno = sc.nextLong();
						sc.hasNextLine();
						System.out.print("Enter your Name : ");
						String accname = sc.nextLine();
						System.out.print("Enter initial Deposit : ");
						int bal = sc.nextInt();
						Date currdate = new java.util.Date();
						if(accopt == 6)
						{
							System.out.print("Please enter a max limit :");
							float maxlimit = sc.nextFloat();
							//SavingsAcc aacc= null;
							acc = new SavingsAcc(accno,accname,bal,currdate,"ACT","SAV",maxlimit);
							System.out.println("Account Created !");
							acc.savingsdisplay();
						}
						else
						{
							acc = new AccountEx(accno,accname,bal,currdate,"ACT","CURR");
							System.out.println("Account Created !");
							acc.display();
							//System.out.println("No : "+acc.accno);
							//System.out.println("Name : "+acc.accname);
							//System.out.println("Bal : "+acc.bal);
							
						}
					}
					else
					{
						System.out.println("Account already exists !");
					}
					break;
				case 2:
					System.out.print("Enter the Amount to be deposited : ");
					int amt = sc.nextInt();
					acc.deposit(amt);
					break;
				case 3:
					System.out.print("Enter the Amount to be withdrawn : ");
					int amt1 = sc.nextInt();
					acc.withdraw(amt1);
					break;
				case 4:
					acc.display();
					break;
				case 5:
					System.out.println("Exiting Application");
					System.exit(0);
					sc.close();
					break;
			}//swith
		}//while
	}//main
}//class
