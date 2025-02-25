import java.util.*;

abstract class UserAuthentication {
    protected String username;
    protected String password;

    // Constructor to initialize credentials
    UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Abstract method - Every subclass must define this
    abstract void performOperation();
}

class InsertUser extends UserAuthentication {
    InsertUser(String username, String password) {
        super(username, password);
    }

    @Override
    void performOperation() {
        System.out.println("🔹 User " + username + " added successfully!");
    }
}

class UpdateUser extends UserAuthentication {
    UpdateUser(String username, String password) {
        super(username, password);
    }

    @Override
    void performOperation() {
        System.out.println("🔹 User " + username + "'s details updated successfully!");
    }
}

class DeleteUser extends UserAuthentication {
    DeleteUser(String username, String password) {
        super(username, password);
    }

    @Override
    void performOperation() {
        System.out.println("🔹 User " + username + " deleted from the system.");
    }
}

public class Main {
    private static String storedUsername;
    private static String storedPassword;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take username and password and store it
        System.out.print("Set your Username: ");
        storedUsername = scanner.nextLine();
        System.out.print("Set your Password: ");
        storedPassword = scanner.nextLine();
        System.out.println("✅ Account Created Successfully!");

        while (true) {
            // Step 2: Display Menu
            System.out.println("\n🔹 MENU 🔹");
            System.out.println("1. Insert User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 4) {
                System.out.println("🔹 Exiting... Goodbye!");
                scanner.close();
                return;
            }

            // Step 3: Ask for username and password before performing operation
            System.out.print("Enter Username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter Password: ");
            String inputPassword = scanner.nextLine();

            // Step 4: Validate credentials
            if (!inputUsername.equals(storedUsername) || !inputPassword.equals(storedPassword)) {
                System.out.println("❌ Access Denied! Incorrect Username or Password.");
                continue; // Go back to the menu
            }

            UserAuthentication operation = null;

            // Step 5: Perform the Selected Operation
            switch (choice) {
                case 1:
                    operation = new InsertUser(inputUsername, inputPassword);
                    break;
                case 2:
                    operation = new UpdateUser(inputUsername, inputPassword);
                    break;
                case 3:
                    operation = new DeleteUser(inputUsername, inputPassword);
                    break;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
                    continue;
            }

            // Execute the selected operation
            operation.performOperation();
        }
    }
}
