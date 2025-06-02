package in.piyush;

public class StringFormat {
    public static void main(String[] args) {
        int marks = 45;
        String name = "sandeep";
        System.out.println("Hello " + name +"," + " Your Marks are " + marks );
        System.out.printf("Hello %S, Your Marks are: %d", name , marks);
    }
}
