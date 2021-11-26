package bai5;

public class Student {
    private int age;
    private String name;
    private static String college = "BBDIT";

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }
    public void display() {
        System.out.println(age + " " + name + " " + college);
    }

//    public static void Main(String[] args) {
//        di
//    }
}
