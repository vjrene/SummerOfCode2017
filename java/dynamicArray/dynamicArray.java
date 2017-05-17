import java.util.Arrays;

//implementation of dynamic array
public class dynamicArray<T>{ //for user defined types

Object[] dynArray;
int size;

    public dynamicArray(){
        dynArray = new Object[1];
        size = 0;
    }

    //get size of dynamic array
    public int getSize(){
        return dynArray.length;
    }

    //get specific element in dynamic array
    public T getElement(int index){
        return (T) dynArray[index];
    }

    //insert element into dynamic array
    public void addElement(Object elementAdded){

        //make sure that you have enough space to add element
        ensureSpace(size+1); //you need at least 1 more than the size of the array to fit it in
        dynArray[size++] = elementAdded; //if we have space, put it in the array
    }

    public void ensureSpace(int minSpace){
        //check the size of the array, do we need to create more space or do we have enough
        int oldSize = getSize(); //returns the size we're working with

        //logic: if the minSpace available is greater than the oldSize, we need more space for the elements
        if(minSpace>oldSize) {
            int newSize = oldSize * 2; //double the size of the array

            if(newSize<minSpace) { //if new capacity is less than minimum space needed/if user deletes element
                newSize = minSpace;
            }

            dynArray = Arrays.copyOf(dynArray, newSize); //making new array with new size
        }

    }

}
