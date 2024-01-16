class GetCharacters{
	public static void main(String args[]){
		String s1="Welcome to Bmsce college";
		char chars1[]=new char[5];
		s1.getChars(11,16,chars1,0);
		String sub=new String(chars1);
		System.out.println("Extracted substring: "+sub);
	}
}