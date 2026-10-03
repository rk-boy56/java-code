class Student {
    Nstring name;
    int rno;
    float marks;

    Student() {
        this.name = "roit";
        this.rno = 25;
        this.marks = 85.4f;
    }
    void greeting () {
        System.out.println("my name is " + this.name);
    }

    void changeName (Nstring newName) {
        this.name = newName;
    }

    // Student(int rno, String name, float marks) {
    //     this.name = name;
    //     this.rno = rno;
    //     this.marks = marks;
    // }
}

public class Classop {
    public static void main(Nstring[] arg) {
        Student st1 = new Student();
        // st1.name = "rohit saw";
        // st1.rno = 15;
        // st1.marks = 84.5f;

        System.out.println(st1.name);
        System.out.println(st1.rno);
        System.out.println(st1.marks);
        st1.greeting();
        st1.changeName("advancher lover");
    }
}