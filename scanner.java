import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        // 1. Take the user's name and city as input, then print: "Hello <name> from
        // <city>!"

        // System.out.println("user's name : ");
        // String name = user.nextLine();

        // System.out.println("user's city : ");
        // String city = user.nextLine();

        // System.out.println("Hello i am " + name + " from " + city);

        // 2. Take two integers as input and print their sum, difference, product, and
        // quotient.

        // System.out.println("num1");
        // int num1 = user.nextInt();

        // System.out.println("num2");
        // int num2 = user.nextInt();

        // int sum = num1 + num2;
        // int diff = num1 - num2;
        // int product = num1 * num2;
        // int quot = num1 / num2;

        // System.out.println(sum + "\n" + diff + "\n" + product + "\n" + quot);

        // 3. Take length and breadth (as doubles) from the user and calculate the area.

        // System.out.println("length");
        // double length = user.nextDouble();

        // System.out.println("width");
        // double width = user.nextDouble();
        // double area = length * width;

        // System.out.println(area);

        // 4. Take an integer as input and print whether it is even or odd.

        // System.out.println("enter a number");
        // int num3 = user.nextInt();

        // if (num3 % 2 == 0) {
        // System.out.println(num3 + " is an even number");
        // } else {
        // System.out.println(num3 + " is a odd number");
        // }

        // 5. Take principal, rate, and time (all doubles) as input and calculate simple
        // interest using:SI = (P * R * T) / 100

        // System.out.println("enter principal");
        // double P = user.nextDouble();

        // System.out.println("enter rate");
        // double R = user.nextDouble();

        // System.out.println("enter time");
        // double T = user.nextDouble();

        // double SI = (P * R * T) / 100;

        // System.out.println("SI = " + SI);

        // 6. Take temperature in Celsius as input and convert it to Fahrenheit using:F
        // = (C * 9/5) + 32

        // System.out.println("enter temperature in Celsius");
        // double C = user.nextDouble();

        // double F = (C * 9/5) + 32;

        // System.out.println("Fahrenheit : " + F);

        // 7. Take marks (0–100) as input and print the grade based on this logic:

        // ≥ 90 → "A"
        // 75–89 → "B"
        // 50–74 → "C"
        // below 50 → "Fail"

        // System.out.println("enter your marks");
        // int marks = user.nextInt();

        // if(marks > 100 || marks < 0){
        //     System.out.println("this marks is out of expected");
        // }else if(marks >= 90){
        //     System.out.println("A");
        // }else if(marks >= 75){
        //     System.out.println("B");
        // }else if(marks >= 50){
        //     System.out.println("C");
        // }else if(marks < 50){
        //     System.out.println("fail");
        // }else{
        //     System.out.println("reenter the marks");
        // }

        // 8. Take an integer as input and print the sum of its digits (e.g., 123 → 1+2+3 = 6).

        int get = user.nextInt();

        int first = get / 100;
        int second = (get / 10) % 10;
        int third = get % 10;

        int sum = first + second + third;

        System.out.println("Sum of digits = " + sum);

    }
}
