// public class  PrimeNum {
//     public static void main(String[] args) {
//         int n=19;
//         boolean isprime=true;

//         for(int i=2; i<n; i++)
//         {
//             if(n%i==0)
//             {
//              isprime=false;
//             }
            
//         }

//         if(isprime==true)
//         {
//             System.out.println("This Number is prime");
//         }else{
//             System.out.println("Not prime");
//         }

//     }
// }

// import java.util.Scanner;

// class PrimeNum{
//     public static boolean isPrime(int n )
//     {
//       boolean isprime=true;
//       if(n<1)
//       {
//         return false;
//       }
//       for(int i=2;i<n;i++)
//       {
//         if(n%i==0)
//         {
//             isprime=false;
//         }

//       }

//       return isprime;
//     }
//     public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in); // FOr taking values from user 
//        System.out.print("Enter Any Value : ");
//        int n=sc.nextInt();
//         boolean result =PrimeNum.isPrime(n);
//         if(result==true)
//         {
//             System.out.println("prime");
//         }else{
//             System.out.println("not prime");
//         }

//     }
// }

class PrimeNum{

    static Integer m=5;
    static Integer n=5;

    static{
        System.out.println("hi");
    }

    public static Integer add(Integer c)
    {
       
       System.out.println("Raju");

       Integer sum=n+m+c;
       return sum;

    }

    public static void Raju()
    {
        System.out.println("Bhojane");
    }




     public static void main(String[] args) {

    //    Integer result=PrimeNum.add(15);

    //    System.out.println(result);

     }
}