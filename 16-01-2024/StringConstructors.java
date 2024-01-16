class StringConstructors{
	public static void main(String args[]){
		String s1="Hello";
		System.out.println(s1);
		char chars1[]={'a','b','c'};
		String s2=new String(chars1);
		System.out.println(s2);
		byte chars2[]={72,101,108,108,111};
		String s3=new String(chars2);
		System.out.println(s3);
		char chars3[]={'a','b','c','d','e','f'};
		String s4=new String(chars2,0,4);
		System.out.println(s4);
	}
}
	