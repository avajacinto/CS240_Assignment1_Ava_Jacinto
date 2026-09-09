import java.util.Scanner;

public class hw1pt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the number's current base:");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Octal");
        System.out.println("4. Hexadecimal");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        System.out.print("Enter the number: ");
        String number = input.next();

        int originalBase;

        switch(choice) {
            case 1:
                originalBase = 2;
                break;
            case 2:
                originalBase = 10;
                break;
            case 3:
                originalBase = 8;
            case 4:
                originalBase = 16;
                break;
            default:
                System.out.println("Invalid choice for base.");
                input.close();
                return;
        }

        try {
            int decimalValue = Integer.parseInt(number, originalBase);

            System.out.println("Binary:      " + Integer.toBinaryString(decimalValue));
            System.out.println("Decimal:     " + decimalValue);
            System.out.println("Octal:       " + Integer.toOctalString(decimalValue));
            System.out.println("Hexadecimal: " + Integer.toHexString(decimalValue).toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("That number is invalid for the selected base.");
        }
        input.close();
    }
}