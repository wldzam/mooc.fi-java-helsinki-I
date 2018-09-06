import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // write testcode here

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {

        int minValue = array[0];

        for (int i = 0; i<array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }

        return minValue;

    }

    public static int indexOfTheSmallest(int[] array) {

        int minValue = array[0];
        int smallestIndex = 0;

        for (int i = 0; i<array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int smallest = array[index];
        int smallestIndex = index;

        for (int i = index; i<array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;

    }

    public static void swap(int[] array, int index1, int index2) {

        int temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;

    }

    public static void sort(int[] array) {

        int smallestElementFrom = 0;

        for (int i = 0; i < array.length; i++) {
            printArray(array);
            smallestElementFrom = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestElementFrom);
        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print("\n");
    }

}
