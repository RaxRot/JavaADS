package array;

import java.util.Arrays;

public class SingleDimensionArray {
    private int[]arr;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        Arrays.fill(arr,Integer.MIN_VALUE);
    }

    //Array Insertion
    public void insert(int location, int valueToBeInserted) {
       try {
           if (arr[location] == Integer.MIN_VALUE) {
               arr[location] = valueToBeInserted;
               System.out.println("Successfully inserted");
           }else{
               System.out.println("This cell is already occupied");
           }
       }catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Array index out of bounds");
       }
    }

    //Array getting value
    public int getValue(int location) {
        if (location<0 || location>=arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[location];
    }

    //Array traversal
    public void traverseArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    //Search an element
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.printf("Found element %d at index %d ",valueToSearch,i);
                System.out.println();
                return;
            }
        }
        System.out.println("Element not found");
    }

    //Delete value from array using index
    public void deleteValueByIndex(int location) {
       if (location<0 || location>=arr.length) {
           System.out.println("Index out of bounds");
           return;
       }
       arr[location]=Integer.MIN_VALUE;
        System.out.println("Successfully deleted");
    }

    //Delete value from array
    public void deleteValue(int valueToDelete) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToDelete) {
                arr[i]=Integer.MIN_VALUE;
                System.out.println("Successfully deleted");
                return;
            }
        }
        System.out.println("Element not found");
    }
}
