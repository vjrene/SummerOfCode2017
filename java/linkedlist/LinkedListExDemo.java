public class LinkedListExDemo {
    public static void main (String[]args){
        //initialize new ll
        LinkedListEx<String> names = new LinkedListEx<String>();

        names.add("Vanessa");
        names.add("Marielle");
        names.add("Arnold");
        names.add("Raphael");
        System.out.println("display the names...");
        names.display();
        System.out.println("get rid of a name...");
        names.delete();
        System.out.println("after deleting...");
        names.display();

    }
}
