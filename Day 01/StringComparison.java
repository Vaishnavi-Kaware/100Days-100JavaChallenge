public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Using '==' (Reference Comparison)
        System.out.println("str1 == str2: " + (str1 == str2)); // true (same memory reference)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different memory reference)

        // Using '.equals()' (Value Comparison)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (same value)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (same value)
    }
}
