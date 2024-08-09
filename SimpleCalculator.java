import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // take user input for operation to perform
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\n6. Bitwise AND\n7. Bitwise OR\n8. Bitwise XOR\n9. Bitwise Not\n10. Left Shift\n11. Right Shift\nEnter the operation to perform: ");
        int op = sc.nextInt();
        
        // take user input for operands
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        int b;

        // take only one input in case operation is Bitwise Not 
        if (op!=9) {
            System.out.print("Enter the value of B: ");
            b = sc.nextInt();
        } else {
            b = 0;
        }

        // close the scanner as no longer needed
        sc.close();
        int ans;

        // performing operation as asked and printing appropriate message
        switch (op) {
            case 1:
                ans = a+b;
                System.out.println("Addition is: " + ans);
                break;
            case 2:
                ans = a-b;
                System.out.println("Subtraction is: " + ans);
                break;
            case 3:
                ans = a*b;
                System.out.println("Multiplication is: " + ans);
                break;
            case 4:
                ans = a/b;
                System.out.println("Division is: " + ans);
                break;
            case 5:
                ans = a%b;
                System.out.println("Modulo is: " + ans);
                break;
            case 6:
                ans = a&b;
                System.out.println("Bitwise AND is: " + ans);
                break;
            case 7:
                ans = a|b;
                System.out.println("Bitwise OR is: " + ans);
                break;
            case 8:
                ans = a^b;
                System.out.println("Bitwise XOR: " + ans);
                break;
            case 9:
                ans = ~a;
                System.out.println("Bitwise Not: " + ans);
                break;
            case 10:
                ans = a<<b;
                System.out.println("Left Shift: " + ans);
                break;
            case 11:
                ans = a>>b;
                System.out.println("Right Shift: " + ans);
                break;
            default:
                System.out.println("Invalid Operation Selected!");
                break;
        }
    }
}