import java.util.Scanner;

public class BMI_Calc {
    public BMI_Calc() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Provide your weight in kg: ");
        double weight = scanner.nextDouble();
        if (weight <= 0) {
            System.out.println("Weight must be a positive number.");
            return;
        }

        System.out.print("Provide your height in meters: ");
        double height = scanner.nextDouble();
        if (height <= 0) {
            System.out.println("Height must be a positive number.");
            return;
        }

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

        scanner.close();
    }
}
