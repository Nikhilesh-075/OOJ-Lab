import java.util.Scanner;

class WrongSalary extends Exception {
	public WrongSalary() {
		super("Salary Error");
   	}

    public WrongSalary(String message) {
        super(message);
    }
}

class InputScanner {
    public static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}

class Manager extends InputScanner {
    public int ManagerSalary;

    public Manager() throws WrongSalary {
        ManagerSalary = getIntInput("Enter Manager Salary: ");
        if (ManagerSalary < 0) {
            throw new WrongSalary("Salary cannot be negative");
        }
    }

    public void display() {
        System.out.println("Manager Salary: " + ManagerSalary);
    }
}

class Emp extends Manager {
    private int EmpSalary;

    public Emp() throws WrongSalary {
        super();
        EmpSalary = getIntInput("Enter Employee age: ");
        if (EmpSalary > super.ManagerSalary) {
            throw new WrongSalary("Employee Salary  cannot be greater than Manager salary ");
        } else if (EmpSalary < 0) {
            throw new WrongSalary("Salary cannot be negative");
          }
else if(EmpSalary==super.ManagerSalary)
{ throw new WrongSalary("Salary cannot be equal to Manager salary!!!!");
}
    }

    public void display() {
        super.display();
        System.out.println("employee salary: " + EmpSalary);
    }
}

public class ExceptionHandlingdemo {
    public static void main(String args[]) {
        try {
            Emp emp = new Emp();
            emp.display();
        } catch (WrongSalary e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
