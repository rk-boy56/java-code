import java.util.Scanner;

public class condition {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        // 1. Write a Scanner-based program that reads a person's age using nextInt()
        // and prints "Adult" if the age is 18 or above, otherwise prints "Minor".

        // System.out.println("enter your age");
        // int age = user.nextInt();
        // if(age >= 18){
        // System.out.println("adult");
        // }else{
        // System.out.println("minor");
        // }

        // Q2. Take a number from the user and print whether it is positive, negative,
        // or zero.

        // System.out.println("enter a number to check positive or negative" );
        // int num1 = user.nextInt();
        // if(num1 >= 0){
        // System.out.println(num1 + " is a positive number");
        // }else{
        // System.out.println(num1 + " is a nagetive number");
        // }

        // Q3. Take a number and print whether it is even or odd using the % operator.

        // System.out.println("enter a number");
        // int num = user.nextInt();
        // if(num % 2 == 0){
        // System.out.println(num + " is an even number ");
        // }else{
        // System.out.println(num + " is a odd number");
        // }

        // Q4. Take marks as input and print "Pass" if marks are 40 or above, otherwise
        // print "Fail"

        // System.out.println("enter your marks to check pass or fail");
        // int marks1 = user.nextInt();
        // if (marks1 >= 40) {
        // System.out.println("pass");
        // }else{
        // System.out.println("fail");
        // }

        // Q5. Take two numbers from the user and print the larger of the two.

        // System.out.println("enter first number to check greater no.");
        // int num2 = user.nextInt();

        // System.out.println("enter second number to check greater no.");
        // int num3 = user.nextInt();

        // if (num2 > 3) {
        // System.out.println(num2 + " is greater than " + num3);
        // }else{
        // System.out.println(num3 + " is greater than " + num2);
        // }

        // 6. Take three numbers from the user and print the greatest of the three.

        // System.out.println("enter first number to check greatest no.");
        // int gnum1 = user.nextInt();

        // System.out.println("enter second number to check greatest no.");
        // int gnum2 = user.nextInt();

        // System.out.println("enter third number to check greatest no.");
        // int gnum3 = user.nextInt();

        // if (gnum1 > gnum2 && gnum1 > gnum3) {
        // System.out.println(gnum1 + " is greatest");
        // }else if(gnum2 > gnum3){
        // System.out.println(gnum2 + " is greatest");
        // }else{
        // System.out.println(gnum3 + " is greatest");
        // }

        // Q7. Write a student grade calculator using an else-if chain: A (≥90), B
        // (≥80), C (≥70), Pass (≥40), Fail (below 40).

        // System.out.println("enter your marks");
        // int marks = user.nextInt();

        // if (marks > 100 || marks < 0) {
        // System.out.println("this marks is out of expected");
        // } else if (marks >= 90) {
        // System.out.println("A");
        // } else if (marks >= 75) {
        // System.out.println("B");
        // } else if (marks >= 50) {
        // System.out.println("C");
        // } else if (marks < 50) {
        // System.out.println("fail");
        // } else {
        // System.out.println("reenter the marks");
        // }

        // Q8. What will this code print?

        // System.out.println("enter a number");
        // int x = user.nextInt();
        // if (x % 2 == 0) {
        // System.out.println("Even");
        // } else {
        // System.out.println("Odd");
        // }

        // Q9. Find the mistake in this code and correct it:

        // System.out.println("enter marks");
        // int marks1 = user.nextInt();

        // if (marks1 >= 40) {
        //     System.out.println("Pass");
        // } else if (marks1 < 40) {
        //     System.out.println("fail");
        // }

        // Q10. Write a simple login validator using .equals() and && — access is granted only if the entered username AND password both match the stored values.

        // String name = "rohit";
        // String pass = "rohit@123";

        // System.out.print("enter your username : ");
        // String uname = user.nextLine();

        // System.out.print("enter your password");
        // String upass = user.nextLine();

        // if (name.equals(uname) && pass.equals(upass) ) {
        //     System.out.println("log in successful");
        // }else {
        //     System.out.println("log in failed");
        // }

        // Q11. Write an ATM withdrawal check: allow the withdrawal only if pinCorrect is true AND balance >= amount.

        // int setpin = 1234;
        // int crbalance = 10000;
        
        // System.out.print("enter your pin : ");
        // int pin = user.nextInt();

        // System.out.print("enter balance : ");
        // int balance = user.nextInt();

        // if(setpin == pin && crbalance >= balance){
        //     System.out.println("you can access your money");
        // }else{
        //     System.out.println("check your pin or enter valid amount");
        // }

        // Q12. Write an exam-entry validator using nested if: entry is allowed only if the student has a hall ticket AND an ID card.

        // System.out.print("do you have hall ticket (true / false) : ");
        // boolean isTicket = user.nextBoolean();

        // System.out.print("do you have ID (true / false) : ");
        // boolean isID = user.nextBoolean();

        // if (isTicket) {
        //     if (isID) {
        //         System.out.println("you can enter");
        //     }else{
        //         System.out.println("you don't have your ID");
        //     }
        // }else{
        //     System.out.println("you don't have hall ticket ");
        // }

        // Q13. Challenge: if the shopping total is greater than 1000, apply a 10% discount; otherwise apply no discount. Print the final amount to pay.

        System.out.print("enter your paying amount : ");
        int amount = user.nextInt();
        int disamount = 1000;


        if (amount >= disamount) {
            int discount =( amount * 10)/100;
            int total = discount - amount;
            System.out.println("total discount : " + discount);
            System.out.println("total amount : " + Math.abs(total));
        }else{
            System.out.println("discount applied only when your amount is greater then " + disamount);
        }

    }

}
