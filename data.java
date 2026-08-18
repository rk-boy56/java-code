public class data {
    public static void main(String[] args) {

                                            //    Boolean

        // Create a boolean isLightOn and print a sentence describing whether the light is on.

        boolean isLightOn = true;

        System.out.println("light is on : " + isLightOn);

        // Store marks in an int, then create a boolean hasPassed that's true if marks are 35 or above.

        int marks = 85;
        boolean hasPassed = marks >= 35;
        
        System.out.println("result : " + hasPassed);

        // Create a boolean isWeekend and print "Time to relax!" logic based on its value (just print the boolean for now).

        boolean isWeekend = true;

        System.out.println("Time to relax : " + isWeekend);

        // Create a boolean isOffline and print its opposite using the ! operator.

        boolean isOffline = true;

        System.out.println("you are offline : " + !isOffline);

        // Create two booleans, hasTicket and hasID, and print the result of hasTicket && hasID.

        boolean hasTicket = true;
        boolean hasID = true;

        System.out.println("You have ticket : " + hasTicket + "\n" + "You have ID : " + hasID);


                                            // String


        // Store your name, age, and city in separate variables, then print one combined sentence using +.

        String name = "Rohit";
        int age = 19;
        String city = "Koderma";

        System.out.println("my name is " + name + " and my age is " + age + " and i an from " + city );

        // Store your favorite movie and favorite food as Strings, then print both in one sentence.

        String anime = "Naruto";
        String food = "fried rice";

        System.out.println("my favorite anime is " + anime + " and my favorite food is " + food);

        // Create a char for your first initial and a String for your full name — print both, labeled.

        char first = 'R';
        String full = "ohit";

        System.out.println(first + full);

        // Store a name and a domain as Strings, then concatenate them into a fake email address, e.g. name + "@example.com".

        String dname = "rohit009";
        String email = "@gmail.com";

        System .out.println(dname + email);

        // What's wrong with: char symbol = "$";  — rewrite it correctly.

        char symbol = '$';

        System.out.println(symbol);
    }
}
