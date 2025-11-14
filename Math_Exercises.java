import java.util.Scanner;
public class Math_Exercises{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
//         HYPOTENUSE formula :- Math.sqrt( a² + b²)
//        double a;
//        double b;
//        double c;
//        System.out.print("Enter the value of A : ");
//        a = scanner.nextDouble();
//        System.out.print("Enter the value of B : ");
//        b = scanner.nextDouble();
//        c = Math.pow(a, 2) + Math.pow(b, 4);
//        System.out.println("The Hypo : " + c);



        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        double circumference;
        double area;
        double radius;
        double volume;
        System.out.print("Enter the radius : ");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The Circumference : " + circumference);
        System.out.println("The Area : " + area);
        System.out.println("The Volume : " + volume);

        scanner.close();
    }
}