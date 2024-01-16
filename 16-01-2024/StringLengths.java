class StringLengths{
	public static void main(String args[]){
		String s1="Navya";
		int length=s1.length();
		System.out.println(length);
		String s2="Hello";
		String s3="Nikhilesh";
		String comb=s2+","+s3+"!";
		System.out.println(comb);
		String con=s2.concat(" ").concat(s3);
		System.out.println(con);
	}
}