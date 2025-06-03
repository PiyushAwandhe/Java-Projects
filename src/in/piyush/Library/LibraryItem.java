package in.piyush.Library;

public class LibraryItem {


        private String itemID;
        private String Title;
        private String Author;

        public void checkout() {
            System.out.println("Checking out");
        }

        public void  returnItemID() {
            System.out.println("Returning The Item ");
        }
}

