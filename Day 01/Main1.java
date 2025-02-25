// Abstract class with common methods
abstract class Animal {
    void makeSound() {  // Concrete method
        System.out.println("Some generic animal sound...");
    }

    abstract void sleep(); // Abstract method to be implemented by subclasses
}



// Subclasses with their own implementations
class Lion extends Animal {
    void sleep() {
        System.out.println("Lion sleeps in the den...");
    }


    void raju()
    {
        System.out.println("raju is good boy");
    }
}

class Tiger extends Animal {
    void sleep() {
        System.out.println("Tiger sleeps under a tree...");
    }
    public void raju()
    {
       System.out.println("Good Boy");
    }
}

class Cat extends Animal {
    void sleep() {
        System.out.println("Cat sleeps on the couch...");
    }
}

class Horse extends Animal {
    void sleep() {
        System.out.println("Horse sleeps standing up...");
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println("Dog sleeps in its kennel...");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Parent class reference holding child objects
        Animal my=new Lion();
        my.sleep();

        my=new Dog();
        my.sleep();

        Cat my1=new Cat();
        my1.sleep();


        

        


       
    }
}
