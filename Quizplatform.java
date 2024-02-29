import java.util.*;
public class Quizplatform {
	private Map<String, String> users; 
    private List<Quiz> quizzes;

    public Quizplatform() {
        users = new HashMap<>();
        quizzes = new ArrayList<>();
    }

    public void registerUser(String username, String password) {
        users.put(username, password);
    }

    public boolean authenticateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public void createQuiz(String title) {
        quizzes.add(new Quiz(title));
    }

    // Other methods for managing quizzes

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quizplatform platform = new Quizplatform();

        // Registration
        System.out.println("Welcome to the Quiz Platform!");
        System.out.println("Register a new user:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        platform.registerUser(username, password);
        System.out.println("User registered successfully!");

        // Login
        System.out.println("\nLogin:");
        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();
        if (platform.authenticateUser(loginUsername, loginPassword)) {
            System.out.println("Login successful!");
            // Offer quiz creation and taking functionalities here
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }
    }

}
