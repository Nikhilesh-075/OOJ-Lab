import java.util.Scanner;

class WrongAge extends Exception{
	public WrongAge(){
		super("Age Error");
    	}

    	public WrongAge(String message){
        	super(message);
    	}
}

class InputScanner{
    	public static int getIntInput(String prompt){
        	Scanner scanner=new Scanner(System.in);
        	System.out.print(prompt);
        	return scanner.nextInt();
    	}
}

class Father extends InputScanner{
    	public int fatherAge;
    	public Father() throws WrongAge{
    		fatherAge=getIntInput("Enter Father's age: ");
        	if(fatherAge<0){
            		throw new WrongAge("Age cannot be negative");
        	}
    	}
    	public void display(){
        	System.out.println("Father's Age: "+fatherAge);
    	}
}

class Son extends Father{
    	private int sonAge;
    	public Son() throws WrongAge{
        	super();
        	sonAge=getIntInput("Enter Son's age: ");
        	if(sonAge > super.fatherAge){
            		throw new WrongAge("Son's age cannot be greater than father's age");
        	}
		else if(sonAge<0){
            		throw new WrongAge("Age cannot be negative");
        	}
		else if(sonAge==super.fatherAge){
            		throw new WrongAge("Son's age cannot be equal to father's age");
        	}
    	}
    	public void display(){
        	super.display();
        	System.out.println("Son's Age: "+sonAge);
    	}
}

public class ExceptionHandling{
    	public static void main(String args[]){
        	try{
            		Son son=new Son();
            		son.display();
        	}
		catch(WrongAge e){
            		System.err.println("Error: "+e.getMessage());
        	}
    	}
}
