public class hellow {
    public static void main(String[] args) {

        // Declare an int variable with your age and print it with a label, e.g. "My age is: 21"

        int age = 19;
        String me = " my age is : ";
        System.out.println(me + age );
        // Create int num1 = 15 and num2 = 4. Print their sum, difference, product, and quotient.

        byte num1 = 15;
        byte num2 = 4;

        int sum = num1 + num2;
        int diff = num1 - num2; 
        int product = num1 * num2;
        double quot = num1 / num2;

        System.out.println(sum +"\n"+  diff +"\n"+  product +"\n"+  quot);

        // Store your name in a Stringinginginginginging and print "Hello, my name is <name>"

        String name = "rohit";
        String intro = "Hello, my name is ";

        System.out.println(intro + name);

        // Create a boolean isStudent and print a sentence stating true or false.

        boolean isStudent = true;
        String about = ", i am a student";

        System.out.println(isStudent + about);

        // Store an item's price as a double (e.g. 499.99) and print it with a currency label.

        double price = 499.99;
        String currency = "price : $ ";


        System.out.println(currency + price);

        // Store the first letter of your name in a char and print it.

        char first = 'R';
        String other = "ohit";

        System.out.println(first + other);
        
        // Given int a = 5, b = 10, swap their values using a third variable, then print both.

        int a = 5;
        int b = 10;
        int c = a;
        a = b;
        b = c;

        System.out.println(a +" "+ b);

        // Store length and width as int, calculate the area, and print the result.

        int length = 15;
        int width = 10;
        int area = length * width;
        
        System.out.println(area);

        // Store your height in cm as a float, then print it converted to meters (divide by 100).

        float hight = 166.0f;
        float cnvrt = hight / 100;

        System.out.println(cnvrt);

        // Create 3 int variables for marks in 3 subjects, and print their average.

        short math = 85 ;
        short english = 75;
        short science = 80;

        float average = (math + english + science) / 3.0f;

        System.out.println(average);

    }
}
