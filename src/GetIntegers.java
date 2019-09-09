
import java.util.Scanner;

public class GetIntegers {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        for (int x =0; x < 10; x++) {
            System.out.println("Enter a number");
            num = keyboard.nextInt();
            total += num;

        }
        System.out.println(total);
        System.out.println("The total of all numbers is" + total);
    }
}
