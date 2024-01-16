class EndsWithExample{
	public static void main(String args[]){
		String s1="Hello World";
		String s2="World";
		String s3="java";
		boolean b1=s1.endsWith(s2);
		boolean b2=s1.endsWith(s3);
		System.out.println("Starts with '"+s2+"':"+b1);
		System.out.println("Starts with '"+s3+"':"+b2);
	}
}
