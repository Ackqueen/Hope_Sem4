package Day10Task;

import java.util.Scanner;

class AuthourizationService {

    public void login(String username, String password) throws Exception {

        if (username == null || username.isEmpty()) {
            throw new Exception("Username cannot be empty");
        }

        if (password == null || password.length() < 6) {
            throw new Exception("Password must be at least 6 characters");
        }

        String User = "Ackqueen";
        String Pass = "123456";

        if (!username.equals(User) || !password.equals(Pass)) {
            throw new Exception("Invalid username or password");
        }

        System.out.println("Login successful!");
    }
}

public class throwThrowsApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        AuthourizationService auth = new AuthourizationService();

        try {
            auth.login(username, password);
        } catch (Exception e) {
            System.out.println("Login failed : " + e.getMessage());
        }
    }
}