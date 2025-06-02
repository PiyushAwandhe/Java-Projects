package in.piyush;

public class StudentToString {
    String name;
    int age;
    int class1;

    public StudentToString(String name, int age, int class1) {
        this.name = name;
        this.age = age;
        this.class1 = class1;
    }

    @Override
    public String toString() {
        return "in.piyush.StudentToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", class1=" + class1 +
                '}';
    }

    public static void main(String[] args) {
        StudentToString student = new StudentToString("John Doe", 19, 10);
        System.out.println(student);
    }
}