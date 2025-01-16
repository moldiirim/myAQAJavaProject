package lesson_7;

public class Task11 {
    public static void shiftArray(int[] arr, int n) {
        int length = arr.length;
        n = n % length;
        if (n < 0) {
            n = length + n;

            for (int i = 0; i < n; i++) {
                int temp = arr[length - 1];
                for (int j = length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }

    }

}


