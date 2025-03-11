package array;

public class Main {

    public static void main(String[] args) {

        workWithOneDimensionArray();

        workWithTwoDimensionArray();

    }

    private static void workWithOneDimensionArray() {
        SingleDimensionArray sd = new SingleDimensionArray(10);
        sd.insert(0,0);
        sd.insert(1,10);
        sd.insert(2,20);

        sd.searchInArray(10);
        sd.searchInArray(30);

        sd.deleteValue(11);
        sd.deleteValueByIndex(2);

        sd.getValue(1);
        sd.traverseArray();
    }

    private static void workWithTwoDimensionArray() {
        TwoDimensionArray sda=new TwoDimensionArray(3,3);
        sda.insertValue(0,0,10);
        sda.insertValue(0,0,10);

        sda.searchValue(100);
        sda.deleteValueAt(1,0);
        sda.printArray();
    }
}
