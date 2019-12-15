public class StringBuilderEx
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("Welcome");
		sb.append(" to BKIC");
		sb.replace(0,4,"WELC");
		sb.replace("c","X");
		System.out.println(sb);
	}
}