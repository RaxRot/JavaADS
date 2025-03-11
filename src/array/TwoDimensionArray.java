package array;

public class TwoDimensionArray {
    private int[][] arr;

    public TwoDimensionArray(int numOfRows, int numOfColumns) {
        arr = new int[numOfRows][numOfColumns];
        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column < numOfColumns; column++) {
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValue(int indexOfRow, int indexOfColumn, int valueToBeInserted) {
        if (indexOfRow < 0 || indexOfRow >= arr.length ||
                indexOfColumn < 0 || indexOfColumn >= arr[0].length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (arr[indexOfRow][indexOfColumn] == Integer.MIN_VALUE) {
            arr[indexOfRow][indexOfColumn] = valueToBeInserted;
            System.out.println("Inserted value successfully at (" + indexOfRow + ", " + indexOfColumn + ")");
        }else{
            System.out.println("This cell is already occupied");
        }
    }

    public void searchValue(int valueToSearch){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == valueToSearch) {
                    System.out.printf("%d founded at row %d at column %d ", arr[row][column], row, column);
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }

    public int getValueAt(int row, int column) {
        if (row < 0 || row >= arr.length || column < 0 || column >= arr[0].length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[row][column];
    }

    public void deleteValueAt(int indexOfRow, int indexOfColumn) {
        if (indexOfRow < 0 || indexOfRow >= arr.length || indexOfColumn < 0 || indexOfColumn >= arr[0].length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (arr[indexOfRow][indexOfColumn] != Integer.MIN_VALUE){
            arr[indexOfRow][indexOfColumn] = Integer.MIN_VALUE;
            System.out.println("Deleted");
        }else{
            System.out.println("This cell is already empty");
        }
    }

    public void printArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
