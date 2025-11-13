import java.util.Scanner;

public class Playing_with_Age {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent = true;

        System.out.print("Enter your Name : ");
        name = scanner.nextLine();

        if (name.isEmpty()){
            System.out.println("Please Enter your Name ");
        }
        else{

            System.out.println("Hello" + " " + name);
        }

        System.out.print("Enter AGE : ");
        age = scanner.nextInt();

        if(age >= 65){
            System.out.println("You are a senior! 👴");
        }
        else if(age >= 18){
            System.out.println("You are an adult! 🧑");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet! 👼");
        }
        else if(age == 0){
            System.out.println("You are a baby! 👶");
        }
        else{
            System.out.println("You are a child! 🧒");
        }

        if (isStudent){
            System.out.println("You are a Student");
        } else {
            System.out.println("Not a Student");

        }
        scanner.close();

    }
}
