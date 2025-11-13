import java.util.Scanner;
public class Rectangle_area {
    public static void main(String [] args){

        Scanner scanner  = new Scanner(System.in);

        double breadth = 0;
        double height = 0;
        double area = 0;

        System.out.print("breadth val:" );
        breadth = scanner.nextDouble();

        System.out.print("Height value :" );
        height = scanner.nextDouble();

        area = breadth*height;

        System.out.print("Area : ");
        System.out.println(area);

        scanner.close();

    }
}
