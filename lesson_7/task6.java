package lesson_7;

public class task6 {
        public static void flipArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] == 0 ? 1 : 0;
            }
        }
    }

