public class operate {
    public static void main(String[] args){

        // Add two integers and print the sum. 

        int a = 7;
        int b = 5;

        int sum = a + b;

        System.out.println(sum);

        // Subtract two float values and print the result.

        float fv1 = 8.5f;
        float fv2 = 5.0f;

        System.out.println(fv1 - fv2);

        // Use % to check whether a number is even or odd.

        int num = 7;

        if(num % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        
        // Use += to add 10 to a variable's current value.

        int v = 15;
        int add = v += 10;

        System.out.println(add);

        // Print 7/2 and then 7.0/2 — compare the two outputs.

        int num1 = 7;
        int num2 = 2;
        float num3 = 7.0f;

        int div1 = num1 / num2;
        float div2 = num3 / num2;

        System.out.println(div1 + "\n" + div2 );

        // Increase a counter variable by 1 using ++, then print it.

        int var = 1;
        var++;
        System.out.println(var);

        // Compare two numbers using > and print true or false.

        int c1 = 15;
        int c2 = 5;

        System.out.println(c1 > c2);

        // What will be the result of: float a = 7 / 4 * 9 / 2;

        float result = 7 / 4 * 9 / 2;

        System.out.println(result);

        // Use comparison operators to check if a given number is greater than a user-entered number

        int given = 25;
        int user = 10;

        boolean isgreater = given > user;

        System.out.println(isgreater);

        // Write this expression in a Java program: (v² − u²) / (2 * a * 5)


        int x = 40;
        int u = 15;
        int j  = 10;

        int exp1 = (x*x - u*u);
        int exp2 = (2 * j * 5);
        int check = exp1 / exp2;

        System.out.println(check);

        // int x = 7; int a = 7*49/7 + 35/7; — predict the value of a, then run it to check.

        int p = 7;
        int y = 7*49/7 + 35/7;

        System.out.println(y);

        // Use && to check if someone can vote: age >= 18 && isCitizen.

        int age = 25;
        
        if(age >= 18){
            System.out.println("you can vote");
        }else{
            System.out.println("you can't vote");
        }

        // Use || to check if a discount applies: isMember || couponApplied.

        boolean isMember = false;
        boolean iscouponApplied = true;
        boolean discount = isMember || iscouponApplied;

        System.out.println("discount applies : " + discount);

        // Predict the output of a++ and ++a used together in the same print statement.

        int z = 5;
        int output = z++ + ++z;

        System.out.println(output);

        // Write a program to encrypt a grade by adding 8 to it, then decrypt it back to the correct grade.

        char grade = 'A';
        char encryptedGrade = (char) (grade + 8);
        char decryptedGrade = (char) (encryptedGrade - 8);

        System.out.println(grade + "\n" + "encryptedGrade : " + encryptedGrade +"\n" + "decryptedGrade : " +  decryptedGrade);

        // Build a mini calculator that takes two numbers and prints +, -, *, /, and % results.

        int opr1 = 10;
        int opr2 = 5;

        int sum1 = opr1 + opr2;
        int diff = opr1 - opr2;
        int multi = opr1 * opr2;
        int divide = opr1 / opr2;
        int prsnt = opr1 % opr2;

        System.out.println(sum1 + "\n" + diff + "\n" + multi + "\n" + divide + "\n" + prsnt);

        // Check if a triangle is valid: sum of two sides must be greater than the third side.

        int ang1 = 50;
        int ang2 = 70;
        int ang3 = 80;

        if ((ang1 + ang2) > ang3){
            System.out.println("it's a triangle");
        }else if((ang2 + ang3) > ang1){
            System.out.println("it's a triangle");
        }else if((ang1 + ang3) > ang2){
            System.out.println("it's a triangle");
        }else{
            System.out.println("it's not a triangle");
        }

        // Simulate an ATM PIN check using == and !.

        int pin = 6523;

        if(pin == 6525){
            System.out.println("transection successful");
        }else {
            System.out.println("transection failed");
        }

        // Calculate simple interest as a Java expression: (P * R * T) / 100.

        int P = 10;
        int R = 5;
        int T = 15;

        float SI = (P * R * T/100f);
        System.out.println(SI);


        // Predict the final value of a variable after a mix of +=, ++, and -- applied in sequence.

        int value = 10;
        value += 5;
        value ++;
        value --;

        System.out.println(value);



    }
}
