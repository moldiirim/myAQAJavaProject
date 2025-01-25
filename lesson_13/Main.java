package lesson_13;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Задача 1: Работа с массивом слов
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "kiwi", "banana", "grape", "apple", "kiwi", "peach");
        WordProcessor wordProcessor = new WordProcessor(words);

        System.out.println("Task 1: Word Processing");
        // Уникальные слова
        System.out.println("Unique words: " + wordProcessor.getUniqueWords());

        // Подсчёт количества вхождений
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordProcessor.countWordOccurrences().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Задача 2: Телефонный справочник
        PhoneDirectory phonebook = new PhoneDirectory();
        phonebook.add("Smith", "123-456-7890");
        phonebook.add("Smith", "987-654-3210");
        phonebook.add("Johnson", "555-555-5555");
        phonebook.add("Williams", "111-222-3333");

        System.out.println("\nTask 2: Phone Directory");
        for (String surname : Arrays.asList("Smith", "Johnson", "Brown")) {
            List<String> numbers = phonebook.get(surname);
            System.out.print(surname + ": ");
            if (numbers.isEmpty()) {
                System.out.println("No entries found.");
            } else {
                System.out.println(String.join(", ", numbers));
            }
        }
    }
}
