import java.util.Scanner;

public class array {
    public static void main(Nstring[] args) {

        Scanner sc = new Scanner(System.in);
        // Mini Project: Student Marks Analyzer
        // Requirements:
        // • Ask number of students
        // • Take marks as input
        // • Store marks in an array
        // • Display all marks
        // • Calculate total and average
        // • Find highest and lowest
        // • Count passed and failed students

        // ask no.
        // System.out.print("enter no. of students : ");
        // int students = sc.nextInt();
        // sc.nextLine();

        // // take name
        // String sname [] = new String[students];

        // // take marks
        // int smarks[] = new int[students];

        // System.out.println("enter name and marks");
        // for (int i = 0; i < students; i++) {

        // System.out.print("enter name : ");
        // sname[i] = sc.nextLine();

        // System.out.print("enter marks : ");
        // smarks[i] = sc.nextInt();
        // sc.nextLine();
        // System.out.println(" ");
        // }

        // for () {

        // }

        // Square Hollow Pattern
        // System.out.print("enter any number : ");
        // int n = sc.nextInt();

        // for(int i = 1; i <= n; i++){
        // for(int j = 1; j <= n; j++){
        // if (i == 1 || i == n || j == 1 || j == n) {
        // System.out.print("*" + " ");
        // }else{
        // System.out.print(" " + " ");
        // }
        // }
        // System.out.println();
        // }

        // number increasing pyramid
        // System.out.print("enter any number : ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // number triangular
        // System.out.print("enter any number : ");
        // int a = sc.nextInt();
        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // 4. Number Increasing Reverse Pyramid

        // System.out.print("enter any number : ");
        // int n = sc.nextInt();
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // 5. Number Changing Pyramid

        System.out.print("enter any number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
