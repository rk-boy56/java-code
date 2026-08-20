import java.util.Scanner;
public class Adloop {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        // Find the second-largest digit
        // System.out.print("enter any no. :" );
        // int num = user.nextInt();
        // int largest = -1;                   
        // int secondlargest = -1;

        // { here is (-1) because no. should be 0 to 9 and these all no. are//+- greater than -1 it's a safe way}

        // while (num != 0) {
        //     int digit = num % 10;
        //     if(digit > largest){
        //         secondlargest = largest;
        //         largest = digit;
        //     }else if(digit > secondlargest && digit != largest){
        //         secondlargest = digit;
        //     }
        //     num = num / 10;
        // }
        // System.out.println("largest no. = " + largest);
        // System.out.println("secondlargest no. = " + secondlargest);


        // Find the second-smallest digit
        // System.out.print("enter any no. :" );
        // int num = user.nextInt();
        // int smallest = 10;                   
        // int secondsmallest = 10;

        // while (num != 0) {
        //     int digit = num % 10;
        //     if(digit < smallest){
        //         secondsmallest = smallest;
        //         smallest = digit;
        //     }else if(digit < secondsmallest && digit != smallest){
        //         secondsmallest = digit;
        //     }
        //     num = num / 10;
        // }
        // System.out.println("smallest no. = " + smallest);
        // System.out.println("secondsmallest no. = " + secondsmallest);

        // Remove all zeros from a number
        System.out.print("enter any no. :" );
        int num = user.nextInt();
        int other = 0;       
        int place = 1;         

        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            if (digit != 0) {
                other = digit * place + other;
                place = place * 10;
            
            }
        }
        System.out.println(other);




    }
    
}
