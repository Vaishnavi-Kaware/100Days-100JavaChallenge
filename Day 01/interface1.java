interface Animal {
   public static final int age = 5;  // Final and cannot be modified
}

class Dog implements Animal {
    void changeAge() {
        // age = 10;  // ERROR: Cannot assign a value to final variable 'age'
        System.out.println("Dog's age: " + age);
    }
}

public class interface1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.changeAge(); // Output: Dog's age: 5
    }
}
