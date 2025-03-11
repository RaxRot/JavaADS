package array;

public class Main {

    public static void main(String[] args) {

        SingleDimensionArray sd = new SingleDimensionArray(10);
        sd.insert(0,0);
        sd.insert(1,10);
        sd.insert(2,20);

        sd.searchInArray(10);
        sd.searchInArray(30);
    }
}
