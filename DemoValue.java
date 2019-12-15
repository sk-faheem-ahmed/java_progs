public class DemoValue
{
	int data = 50;

	public static int operation(int pnum)
	{
		System.out.println("In operation - data :"+pnum);
		data = pnum*2/6;
		System.out.println("after calc - data :"+pnum);
		return(pnum);
	}
	public static String retString()
	{
		System.out.println("In Return string : and printing ASDFGH ");
		return("ASDFGH");
	}
	public static void main(String[] args) 
	{
		DemoValue d = new DemoValue();
		System.out.println("Value before execution "+d.data);
		d.operation(500);
		String catchedret = retString();
		System.out.println("catchedret "+catchedret);
		System.out.println("Value after execution "+d.data);
	}
}