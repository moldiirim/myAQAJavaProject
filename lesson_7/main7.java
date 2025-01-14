package lesson_7;

public class main7 {
    public static void main(String[] args) {
        // Task 1
        System.out.println(Task1.isSumInRange(5, 15)); // true

        // Task 2
        Task2.printSign(-5); // Отрицательное

        // Task 3
        System.out.println(Task3.isNegative(-3)); // true

        // Task 4
        Task4.printStringMultipleTimes("Hello", 3);

        // Task 5
        System.out.println(Task5.isLeapYear(2024)); // true

        // Task 6
        int[] arr = {1, 0, 1, 0, 0, 1};
        Task6.flipArray(arr);
        for (int num : arr) {
            System.out.print(num + " "); // 0 1 0 1 1 0
        }

        // Task 7
        Task7.fillArray();

        // Task 8
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        Task8.multiplyLessThanSix(arr2);
        for (int num : arr2) {
            System.out.print(num + " "); // 2 4 6 8 5 6 7
        }

        // Task 9
        Task9.fillDiagonal(5);

        // Task 10
        int[] arr3 = Task10.createArray(5, 7);
        for (int num : arr3) {
            System.out.print(num + " "); // 7 7 7 7 7
        }

        // Task 11
        int[] arr4 = {1, 2, 3, 4, 5};
        Task11.shiftArray(arr4, 2);
        for (int num : arr4) {
            System.out.print(num + " "); // 4 5 1 2 3
        }
    }
}

