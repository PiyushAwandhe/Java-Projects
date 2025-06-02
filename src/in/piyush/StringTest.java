package in.piyush;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a test");
        sb.append(" This Is a Updated text ");
        sb.append(45);
        sb.toString();
        System.out.println(sb);
    }
}
