import java.util.Scanner;

public class New {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("enter unit you used : ");
        double U = user.nextDouble();
        double total = 0;



        if (U <= 100) {
            total = U * 1.50;
            System.out.println(total);
        } else if (101 <= U && U <= 200) {
            total = (100 * 1.50) + ((U - 100) * 2.50);
            System.out.println(total);
        } else if (U > 200) {
            total = U * 4.00;
            System.out.println(total);
        } else {
            System.out.println("try one more time");
        }
    }
}
