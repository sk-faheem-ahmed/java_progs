class MemoryCheck
{
	public static void main(String[] args) 
	{
		System.out.println("-------------- System Constant Pool --------------");
		String s1 = "Welcome";
		String s2 = "Welcome";
		System.out.println("-------------------");
		System.out.println("test = : \t\t"+(s1==s2));
		System.out.println("test .equals :\t\t"+s1.equals(s2));
		System.out.println("test .contentequals : \t"+s1.contentEquals(s2));

		System.out.println("-------------- Heap Memory --------------");
		String s3 = new String("Java");
		String s4 = new String("Java");
		String s5 = new String("Welcome");
		System.out.println("-------------------");
		System.out.println("test = : \t\t"+(s3==s4));
		System.out.println("test .equals :\t\t"+s3.equals(s4));
		System.out.println("test .contentequals : \t"+s3.contentEquals(s4));
		System.out.println("scp vs heap : \t\t"+(s1==s5));
	}
}