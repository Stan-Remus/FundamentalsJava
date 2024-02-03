import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Numar pozitiv: ");
        int userInput = scanner.nextInt();


        if (userInput <= 1) {
            System.out.println("Numaru nu e pozitiv");
        } else {
            System.out.println(userInput + ":");
            printeazaNumaruPrim(userInput);
        }
    }


    private static void printeazaNumaruPrim(int limit) {
        for (int i = 2; i < limit; i++) {
            if (verificaNumDacaEPrim(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean verificaNumDacaEPrim(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

   }

}
