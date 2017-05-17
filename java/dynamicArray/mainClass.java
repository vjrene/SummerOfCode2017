/**
 * Created by Parallel on 5/17/17.
 */
public class mainClass {

    public static void main (String args[]) {

        dynamicArray<Integer> da = new dynamicArray<Integer>(); //initialize array

        da.addElement(3);
        System.out.println("Array size:" + da.getSize());
        System.out.println("Elements in array: ");
        for (int i=0; i<da.getSize(); i++) { System.out.println(da.getElement(i)); }
        da.addElement(16);
        System.out.println("Array size:" + da.getSize());
        da.addElement(2);
        System.out.println("Array size:" + da.getSize());
        da.addElement(100);
        System.out.println("Array size:" + da.getSize());
        da.addElement(34);
        da.addElement(29);
        for (int i=0; i<da.getSize(); i++) { System.out.println(da.getElement(i)); }

    }
}
