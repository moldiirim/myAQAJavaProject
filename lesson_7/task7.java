package lesson_7;

public class task7 {
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

