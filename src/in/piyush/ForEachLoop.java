package in.piyush;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Ram","Shyam","Mohan","Neel","Nitin","Mukesh"
        };
        printArray(array);
        printArrayForEach(array);
    }

    //For Each Loop
    public static void printArrayForEach (String[] array) {
        for (String name: array){
            System.out.println(name);

        }

    }

    //For Loop
    public static void printArray (String[] array) {
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
    }
}
