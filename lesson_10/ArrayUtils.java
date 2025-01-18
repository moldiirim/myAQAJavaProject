package lesson_10;
import java.util.Arrays;
public class ArrayUtils {
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices or null array");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana"};
        System.out.println("Before swap: " + Arrays.toString(fruits));
        swapElements(fruits, 0, 2);
        System.out.println("After swap: " + Arrays.toString(fruits));
    }
}
