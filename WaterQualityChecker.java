import java.util.Scanner;

public class WaterQualityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Water Quality Checker!");

        // Input water parameters
        System.out.print("Enter pH level: ");
        double phLevel = scanner.nextDouble();

        System.out.print("Enter turbidity level (NTU): ");
        double turbidity = scanner.nextDouble();

        System.out.print("Enter temperature (°C): ");
        double temperature = scanner.nextDouble();

        // Evaluate water quality based on input values
        System.out.println("\nWater Quality Report:");

        // pH Level Check
        if (phLevel < 6.5) {
            System.out.println("pH level is low. The water is acidic.");
        } else if (phLevel > 8.5) {
            System.out.println("pH level is high. The water is alkaline.");
        } else {
            System.out.println("pH level is within the normal range.");
        }

        // Turbidity Check
        if (turbidity > 5) {
            System.out.println("Turbidity level is high. The water may be contaminated.");
        } else {
            System.out.println("Turbidity level is acceptable.");
        }

        // Temperature Check
        if (temperature < 0 || temperature > 40) {
            System.out.println("Temperature is outside safe limits. The water may be unsafe.");
        } else {
            System.out.println("Temperature is within the safe range.");
        }

        System.out.println("\nThank you for using the Water Quality Checker!");
        scanner.close();
    }
}
