abstract class Bird {
    // Abstract methods
    abstract void fly();
    abstract void makeSound();
}

// Subclass Eagle
class Eagle extends Bird {
    // Implementation of fly() method for Eagle
    @Override
    void fly() {
        System.out.println("Eagle flies high in the sky.");
    }

    // Implementation of makeSound() method for Eagle
    @Override
    void makeSound() {
        System.out.println("Eagle screeches loudly.");
    }
}

// Subclass Hawk
class Hawk extends Bird {
    // Implementation of fly() method for Hawk
    @Override
    void fly() {
        System.out.println("Hawk soars gracefully through the air.");
    }

    // Implementation of makeSound() method for Hawk
    @Override
    void makeSound() {
        System.out.println("Hawk emits piercing.");
    }
}

// Main class to demonstrate the program
public class BirdExample {
    public static void main(String[] args) {
        // Creating an Eagle object
        Eagle eagle = new Eagle();
        System.out.println("Eagle:");
        eagle.fly();
        eagle.makeSound();

        // Creating a Hawk object
        Hawk hawk = new Hawk();
        System.out.println("\nHawk:");
        hawk.fly();
        hawk.makeSound();
    }
}
