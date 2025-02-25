interface Animal {
  int age = 5;  //Explicitly declared as a constant
 
}

class Dog implements Animal {
    void showAge() {
        // age = 10;  //  ERROR: Cannot assign a value to final variable 'age'
        System.out.println("Dog's age: " + age);
    }
}



public class interface2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.showAge(); // Output: Dog's age: 5
        
        System.out.println("Accessing directly: " + Animal.age); //Allowed
    }
}
