package in.piyush;

public class StudentDetails {
    String name;
    int age;
    int class1;

    public StudentDetails(String name, int age, int class1) {
        this.name = name;
        this.age = age;
        this.class1 = class1;
    }

    @Override
    public String toString() {
        return "in.piyush.StudentDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", class1=" + class1 +
                '}';
    }

    public static void main(String[] args) {
        StudentDetails details = new StudentDetails("Piyush",19 ,10);
        System.out.println(details);
    }
}
