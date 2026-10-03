public class Strings {
    public static void main(String[] args) {

        String name  = "rohit";
        String lname = "saw";
        String result = String.join(" ", name, lname);
        System.out.println(result);

        String a = "hellow";
        String b = "hellow";
        System.out.println(a == b);

        // it's true because these values are stored in string constant pool which is inside the heap memory

        String c = new String("world");
        String d = new String("world");
        System.out.println(c == d);

        // it's false because these values are stored inside the heap memory instead of string constant pool

        

    }
}
