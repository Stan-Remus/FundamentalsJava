import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numar Pozitiv: ");
        int input = scanner.nextInt();

        scanner.close();

        if (input <= 0) {
            System.out.println("Numaru nu e pozitiv");
        } else {

            double harmonicSum = CalculatorFormula(input);

            System.out.println(harmonicSum);
        }
    }

    private static double CalculatorFormula(int n) {
        double harmonicSum = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }

        return harmonicSum;


    }

}
