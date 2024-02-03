import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int root = (b * b) - (4 * a * c);


        if (root < 0) {
            System.out.println("Delta negative");
            return;
        }
        double x1 = (-b - Math.sqrt(root))/(2*a);
        double x2 = (-b + Math.sqrt(root))/(2*a);

    }
}
