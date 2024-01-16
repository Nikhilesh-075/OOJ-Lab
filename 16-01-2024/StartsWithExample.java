class StartsWithExample{
	public static void main(String args[]){
		String s1="Hello World";
		String s2="Hello";
		String s3="hi";
		boolean b1=s1.startsWith(s2);
		boolean b2=s1.startsWith(s3);
		System.out.println("Starts with '"+s2+"':"+b1);
		System.out.println("Starts with '"+s3+"':"+b2);
	}
}