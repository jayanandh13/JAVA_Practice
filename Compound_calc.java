import java.util.Scanner;
public class Compound_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // compound formula:- where A = future amount, P = principal,
        // r = annual rate (decimal), n = compounding frequency per year, t = years.

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Principle : ");
        principle = scanner.nextDouble() / 100;

        System.out.print("Enter rate in(%) : ");
        rate = scanner.nextDouble();

        System.out.print("Enter timesCompounded :  ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the no of Years : ");
        years = scanner.nextInt();

        //  amount=Principle(1+rate/timesCompounded)timeCompounded * Years

        amount = principle * Math.pow(1 +  rate/timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);


        scanner.close();
    }
}
