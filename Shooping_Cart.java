import java.util.Scanner;
public class Shooping_Cart {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Enter ITEM :");
        item = scanner.nextLine();
        System.out.print("Enter PRICE :");
        price = scanner.nextDouble();
        System.out.print("Enter Quantity :");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println(total);

        System.out.println("\nYou have bought " + quantity + " " + item +"/S");
        System.out.println("Your total is " + currency + total);


    }
}
