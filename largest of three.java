import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n The Largest of Three Program \n\n");
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int total = 0;
        int largest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n Please enter an integer for num1: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("\n\n Please enter the second integer: ");
        num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("\n\n Please enter the third and last integer: ");
        num3 = Integer.parseInt(scanner.nextLine());
        total = num1 + num2 + num3;
        System.out.println("\n The sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + total);
        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            }
            else {
                largest = num2;
            }
        }
        else {
            if (num2 > num3) {
                largest = num2;
            }
            else {
                largest = num3;
            }
        }
        System.out.println("\n\n The largest number out of " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);

    }
}
