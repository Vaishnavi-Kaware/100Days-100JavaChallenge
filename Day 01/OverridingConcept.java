// interface Animal{
//     void sound();
// }


// class Dog implements Animal{
//    public void sound()
//    {
//     System.out.println("bark");
//    }
// }

// public class OverridingConcept {
//     public static void main(String[] args) {
//         Dog my=new Dog();
//         my.sound();
//     }
// }


class Animal{
    void sound(){
        System.out.println("Hiparent");
    }
}

class Dog extends Animal{
    // public void sound()
    // {
    //     System.out.println("Hi");
    // }
}

public class OverridingConcept{
    public static void main(String[] args) {
        Dog sc=new Dog();
        sc.sound();
    }
}