package lesson_9;

import java.util.ArrayList;

public class park {
    // Внутренний класс для аттракционов
    private static class Attraction {
        private final String name;
        private final String schedule;
        private final int price;

        public Attraction(String name, String schedule, int price) {
            this.name = name;
            this.schedule = schedule;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " (Часы работы: " + schedule + ", Цена: " + price + " руб.)";
        }
    }

    // Список для хранения аттракционов
    private final ArrayList<Attraction> attractions = new ArrayList<>();

    // Метод для добавления аттракционов
    public void addAttraction(String name, String schedule, int price) {
        attractions.add(new Attraction(name, schedule, price));
    }

    // Метод для отображения списка аттракционов
    public void showAttractions() {
        System.out.println("Аттракционы парка:");
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }
}
