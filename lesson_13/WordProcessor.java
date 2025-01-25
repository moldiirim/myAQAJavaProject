package lesson_13;
import java.util.*;
public class WordProcessor {
    private final List<String> words;

    public WordProcessor(List<String> words) {
        this.words = words;
    }

    // Метод для получения уникальных слов
    public Set<String> getUniqueWords() {
        return new HashSet<>(words);
    }

    // Метод для подсчёта количества вхождений каждого слова
    public Map<String, Integer> countWordOccurrences() {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }
}
