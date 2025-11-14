import java.util.Random;
public class Random_num {
    public static void main(String [] args){
        Random random = new Random();
        int num1;
        double num2;
        boolean num3;

        num1 = random.nextInt(1,65);
        System.out.println(num1);
        num2 = random.nextDouble(4,65.33);
        System.out.println(num2);
        num3 = random.nextBoolean();

        if (num3){
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }






    }
}
