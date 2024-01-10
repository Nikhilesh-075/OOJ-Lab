import java.util.Scanner;
class InputScanner{
	Scanner s=new Scanner(System.in);
	double getInput(String prompt){
		System.out.println(prompt);
		return s.nextDouble();
	}
}

abstract class Shape extends InputScanner{
	double s1,s2;
	abstract void area();
}

class Rectangle extends Shape{

	Rectangle(){
		s1=getInput("Enter the length of the rectangle:");
		s2=getInput("Enter the breadth of the rectangle:");
	}
	void area(){
		double area=s1*s2;
		System.out.println("Area of the rectangle="+area);
	}
}

class Triangle extends Shape{
	Triangle(){
		s1=getInput("Enter the base of the triangle:");
		s2=getInout("Enter the height of the triangle:");
	}
	void area(){
		double area=s1*s2/2;
		System.out.println("Area of the triangle="+area);
	}
}

class Circle extends Shape{
	Circle(){
		s1=getInput("Enter the radius of the circle:");
	}
	void area(){
		double area=Math.PI*s1*s1;
		System.out.println("Area of the circle="+area);
	}
}

class Main1{
	public static void main(String args[]){
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		r.area();
		t.area();
		c.area();
	}
}