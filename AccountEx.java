import java.util.Date;
public class AccountEx 
{
	long accno;
	String accname;
	float bal;
	Date opendate;
	String status;
	String type;
	AccountEx(long accno,String accname,float bal,Date opendate, String status, String type)
	{
		this.accno = accno;
		this.accname = accname;
		this.bal = bal;
		this.opendate = opendate;
		this.status = status;
		this.type = type;
	}
	AccountEx(){}
	void display() 
	{
		System.out.println("Account Details : ");
		System.out.println("Acc No : "+this.accno);
		System.out.println("Acc Name : "+this.accname);
		System.out.println("Balance : "+this.bal);
		System.out.println("Opened On :"+this.opendate);
		System.out.println("Status :"+this.status);
		System.out.println("Type :"+this.type);
	}
	void withdraw(float amt)
	{
		if(this.bal<amt)
		{
			System.out.println("Insuficient Funds !");
		}
		else
		{
			this.bal = this.bal-amt;
			System.out.println("Amount withdrawn ! "+"Balance is "+this.bal);
		}
	}
	void deposit(float amt)
	{
		this.bal = this.bal+amt;
		System.out.println("Amount Deposited ! "+"Balance is "+this.bal);
	}
}
class SavingsAcc extends AccountEx
{
	float maxlimit;
	SavingsAcc(){}
	SavingsAcc(long accno,String accname,float bal,Date opendate,String status,String type,float maxlimit)
	{
		super(accno,accname,bal,opendate,status,type);
		this.maxlimit =maxlimit;
	}
	void savingsdisplay()
	{
		System.out.println("Savings Display");
		super.display();
		System.out.println("Max Limit : "+this.maxlimit);
	}
	void setmaxlimit(float maxlimit)
	{
		this.maxlimit = maxlimit;
		System.out.println("maximim limt set to "+this.maxlimit+" for acc : "+this.accno);
	}
}
