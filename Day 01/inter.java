// Interface with a set of abstract methods
interface Animal {
    abstract void eat();     // Abstract method (no implementation)
    void sleep();   // Abstract method (no implementation)
    void makeSound(); // Abstract method (no implementation)

 
    
}

interface Animal1 {
    abstract void eat();     // Abstract method (no implementation)
    void sleep();   // Abstract method (no implementation)
    void makeSound(); // Abstract method (no implementation)

 
    
}

// Class implementing the interface
class Dog implements Animal,Animal1 {
    // Providing implementation for all methods
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
    }

    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

   

    
}

public class inter {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();       
        myDog.sleep();     
        myDog.makeSound(); 
        
    }
}
