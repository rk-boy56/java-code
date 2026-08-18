import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        // 1. Print Numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2. Print numbers from 1 to 10 using a while loop.
        System.out.println("2nd answer...............");

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 3. Print Numbers 10 to 1
        System.out.println("3rd answer...............");

        for (i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 4. Print numbers from 10 down to 1.
        System.out.println("4th answer...............");

        int a = 10;
        while (a >= 1) {
            System.out.println(a);
            a--;
        }

        // 5. Print Even Numbers
        System.out.println("5th answer...............");

        for (int b = 1; b <= 50; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }

        // 6. Print all even numbers between 1 and 50.
        System.out.println("6th answer...............");

        int b = 1;
        while (b <= 50) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
            b++;
        }

        // 7. Sum of Natural Numbers
        // System.out.println("7th answer...............");

        // System.out.print("enter a number to sum : ");
        // int n = user.nextInt();
        // int sum = 0;
        // for (int c = 1; c <= n; c++) {
        // sum += c;
        // }
        // System.out.println(sum);

        // 8. Take n from the user and calculate the sum from 1 to n.
        // System.out.println("8th answer...............");

        // System.out.print("enter a number to sum : ");
        // int n1 = user.nextInt();
        // int c = 1;
        // int sum1 = 0;
        // while (c <= n1) {
        // sum1 += c;
        // c++;
        // }
        // System.out.println(sum1);

        // 9. Multiplication Table
        // System.out.println("9th answer...............");

        // System.out.print("enter a number to print table : ");
        // int tab = user.nextInt();
        // for (int d = 1; d <= 10; d++) {
        // int T = d * tab;
        // System.out.println(tab + " * " + d + " = " + T);
        // }

        // 10. Take a number and print its multiplication table from 1 to 10.
        // System.out.println("10th answer...............");

        // System.out.print("enter a number to print table : ");
        // int tab1 = user.nextInt();
        // int d = 1;
        // while (d <= 10) {
        // int T = d * tab1;
        // System.out.println(tab1 + " * " + d + " = " + T);
        // d++;
        // }

        // 11. Reverse a Number
        // System.out.println("10th answer...............");

        // System.out.println("enter any number to reverse");
        // int rev = user.nextInt();
        // for(){

        // }

        // 12. Reverse an integer using a while loop.
        // System.out.println("12th answer...............");

        // System.out.print("enter any number to reverse : ");
        // int number = user.nextInt();
        // int reverse = 0;
        // while (number != 0) {
        // int digit = number % 10;
        // reverse = reverse * 10 + digit;
        // number = number / 10;
        // }
        // System.out.println("Reversed number: " + reverse);

        // 13. Count Digits
        // Count the number of digits in a given integer.
        // System.out.println("13th answer...............");

        // System.out.print("enter any number to count : ");
        // int num1 = user.nextInt();
        // int count = 0;
        // while (num1 != 0) {
        //     num1 = num1 / 10;
        //     count++;
        // }
        // System.out.println(count);

        // 14. Sum of Digits
        // Find the sum of all digits of a number.
        // Example: 1234 → 10
        // System.out.println("14th answer...............");
        
        // System.out.print("enter any number to sum : ");
        // int num2 = user.nextInt();
        // int sum = 0;
        // while (num2 != 0) {
        //     int digit = num2 % 10;
        //     sum += digit;
        //     num2 = num2 / 10;
        // }
        // System.out.println(sum);

        // 15. Check whether a number is a palindrome.
        System.out.println("15th answer...............");

        System.out.print("enter any number to check palindrome : ");
        int number1 = user.nextInt();
        int reverse1 = 0;
        int real = number1;
        boolean ispalindrome;
        while (number1 != 0) {
        int digit = number1 % 10;
        reverse1 = reverse1 * 10 + digit;
        number1 = number1 / 10;
        }
        
        if(real == reverse1){
            ispalindrome = true;
            System.out.println("ispalindrome " + ispalindrome);
        }else{
            ispalindrome = false;
            System.out.println("ispalindrome " + ispalindrome);
        }
        

    }

}
