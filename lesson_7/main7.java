package lesson_7;

public class main7 {
    private static task5 Task5;

    public static void main(String[] args) {
        // Задача 1: Проверка суммы двух чисел
        System.out.println("Задача 1: Проверка суммы двух чисел");
        System.out.println(Task1.isSumInRange(5, 15)); // true (5 + 15 = 20, в пределах от 10 до 20)


        System.out.println("Задача 2: Проверка знака числа");
        Task2.printSign(-5);
        Task2.printSign(3);
        Task2.printSign(0);


        System.out.println("Задача 3: Проверка, отрицательное ли число");
        System.out.println(Task3.isNegative(-3)); // true (отрицательное)
        System.out.println(Task3.isNegative(5));  // false (положительное)
        System.out.println(Task3.isNegative(0));  // false (ноль считается положительным)


        System.out.println("Задача 4: Печать строки несколько раз");
        Task4.printStringMultipleTimes("Hello", 3); // Hello, Hello, Hello

        System.out.println("Задача 5: Проверка високосного года");
        System.out.println(Task5.isLeapYear(2024));
        System.out.println(Task5.isLeapYear(2023));


        System.out.println("Задача 6: Перевод 0 в 1 и 1 в 0 в массиве");
        int[] arr1 = {1, 0, 1, 0, 0, 1};
        Task6.flipArray(arr1);
        for (int num : arr1) {
            System.out.print(num + " "); // 0 1 0 1 1 0
        }
        System.out.println();


        System.out.println("Задача 7: Заполнение массива числами от 1 до 100");
        Task7.fillArray(); // Выводит 1 2 3 ... 100


        System.out.println("Задача 8: Умножение элементов меньше 6 на 2");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        Task8.multiplyLessThanSix(arr2);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.println("Задача 9: Заполнение диагонали массива единицами");
        Task9.fillDiagonal(5);


        System.out.println("Задача 10: Создание массива с одинаковыми значениями");
        int[] arr3 = Task10.createArray(5, 7);
        for (int num : arr3) {
            System.out.print(num + " ");
        System.out.println();


        System.out.println("Задача 11: Циклический сдвиг массива");
        int[] arr4 = {1, 2, 3, 4, 5};
        Task11.shiftArray(arr4, 2);
        for (int num : arr4) {
            System.out.print(num + " "); // 4 5 1 2 3
        }
    }
}

}
