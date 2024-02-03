import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        float diametru;

        Scanner scanner = new Scanner(System.in);

        System.out.print("diametru: ");

        float pi = 3.14f;


        diametru  = scanner.nextFloat();

        double perimetru = pi * diametru;

        System.out.println(perimetru);
    }


}
