class SubstringMatch{
	public static void main(String args[]){
		String s1="Welcome to Bmsce College of Engineering";
		String sub1="Bmsce Collage";
		String sub2="Bmsce college";
		boolean isMatched1=s1.regionMatches(true,11,sub1,0,sub1.length());
		if(isMatched1){
			System.out.println("Substring is matched");
		}
		else{
			System.out.println("Substring is not matched");
		}
		boolean isMatched2=s1.regionMatches(true,11,sub2,0,sub2.length());
		if(isMatched2){
			System.out.println("Substring is matched");
		}
		else{
			System.out.println("Substring is not matched");
		}
	}
}