import java.util.Scanner;

public class Nested_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 9.99;
        String studentAns;
        String seniorAns;

        System.out.print("Are you a student? (yes/no): ");
        studentAns = scanner.nextLine();

        System.out.print("Are you a senior? (yes/no): ");
        seniorAns = scanner.nextLine();

        boolean isStudent = studentAns.equalsIgnoreCase("yes");
        boolean isSenior = seniorAns.equalsIgnoreCase("yes");

        if(isStudent){
            // Student Block
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;   // 30% total discount
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;   // 10% discount
            }
        }
        else{
            // Not a student block
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;   // 20% discount
            }
            else{
                price *= 1;     // No discount
            }
        }

        System.out.printf("The price of a ticket is: $%.2f", price);

        scanner.close();
    }
}
