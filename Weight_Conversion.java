import java.util.Scanner;

public class Weight_Conversion {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newweight;
        int choice;
        System.out.println("Weight Conv Prgm !!");
        System.out.println("1 : lbs to KG");
        System.out.println("2 : kg to lbs");

        System.out.print("Enter Your Choice : ");
        choice = scanner.nextInt();
        if (choice == 1){
            System.out.print("Enter the weight in lbs : ");
            weight = scanner.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("The new weight in kg :  %.2f" , newweight);
        }
        else if (choice == 2){
            System.out.print("Enter the weight in kg : ");
            weight = scanner.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("The new weight in lbs : %.2f " , newweight);
        }
        else {
            System.out.println("BAD CHOICE !!  ");
        }




    }
}
