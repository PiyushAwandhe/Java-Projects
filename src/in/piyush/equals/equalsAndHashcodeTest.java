package in.piyush.equals;

public class equalsAndHashcodeTest {

    public static void main(String[] args) {


    person person1 = new person("piyush", 19, "123");
    person person2 = new person("piyush", 19, "123");

    if (person1.equals(person2)) {
        System.out.println("Equal");
    } else {
        System.out.println("Not Equal");
    }

    }
}
