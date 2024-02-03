import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i + 1);
            }

        }


    }

}
