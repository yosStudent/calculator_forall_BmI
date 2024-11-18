import java.util.Scanner;

public class BMI_Calc {
    public BMI_calc() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Provide your height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 19.2) {
            System.out.print("Skeleton?");
        } else if (bmi >= 19.2 && bmi <= 23.4) {
            System.out.print("Smash!");
        } else if (bmi > 23.4 && bmi <= 28.7) {
            System.out.print("Smash");
        } else if (bmi > 28.7) {
            System.out.print("Pass");
        }

        scanner.close();
    }
}
