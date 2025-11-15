import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // .substring() = A method used to extract a portion of a string
        //                         .substring(start, end)

        String username;
        String domain;
        String email;

        System.out.print("Enter your Email : ");
        email = scanner.nextLine();

        if (email.contains("@")) {

            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);

        } else {
            System.out.println("Email must contain '@'.");
        }

        scanner.close();
    }
}
