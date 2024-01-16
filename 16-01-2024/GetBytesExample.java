public class GetBytesExample{
	public static void main(String[] args){
        	String s1="Hello, World!";
        	byte[] byteArray=s1.getBytes();
        	System.out.print("Byte Array: ");
        	for (byte b:byteArray){
            		System.out.print(b+" ");
        	}
		String s2="Java Programming";
        	char[] charArray=s2.toCharArray();
		System.out.print("Char Array: ");
        	for (char c:charArray){
        		System.out.print(c+" ");
		}
    	}
}
