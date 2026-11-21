
import java.util.Scanner;

public class InputHandler {

    private Scanner sc = new Scanner(System.in);

    public int readInt(String message, int min, int max) {

        while (true) {

            try {

                System.out.print(message);

                int value = Integer.parseInt(sc.nextLine());

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println("Enter a valid value!");

            } catch (NumberFormatException e) {

                System.out.println("Please enter an integer!");
            }
        }
    }

    public double readDouble(String message,
                             double min, double max) {

        while (true) {

            try {

                System.out.print(message);

                double value = Double.parseDouble(sc.nextLine());

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println("Enter a valid value!");

            } catch (NumberFormatException e) {

                System.out.println("Please enter a number!");
            }
        }
    }

    public String readString(String message) {

        while (true) {

            System.out.print(message);

            String value = sc.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("Name cannot be empty!");
        }
    }
}
