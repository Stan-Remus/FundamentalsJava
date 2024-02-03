import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numar pozitiv te rog: ");
        int input = scanner.nextInt();

        scanner.close();

        if (input < 0) {
            System.out.println("Numaru nu e pozitiv");
        } else {

            long fibNum = calculateFibonacci(input);

            System.out.println(fibNum);
        }
    }

    private static long calculateFibonacci(int index) {
        if (index <= 1) {
            return index;
        }

        long fibPrev = 0;
        long fibCurr = 1;

        for (int i = 2; i <= index; i++) {
            long temp = fibCurr;
            fibCurr = fibPrev + fibCurr;
            fibPrev = temp;
        }

        return fibCurr;




    }
}
