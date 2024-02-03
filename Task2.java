import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        float kilograms;
        int height;

        Scanner input = new Scanner(System.in);

        kilograms = input.nextFloat();
        height = input.nextInt();

        float hightInMeters = height / 100.0f;

        float bmi;

        bmi = kilograms/(hightInMeters * hightInMeters);

        if (bmi < 18.5 && bmi > 24.9){
            System.out.println("BMI optimal: " + bmi);
        }else {
            System.out.println("BMI not optimal: " + bmi);
        }



    }
}
