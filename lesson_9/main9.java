package lesson_9;

public class main9 {
    public static void main(String[] args) {
        dog dog1 = new dog("Бобик");
        dog dog2 = new dog("Шарик");
        cat cat1 = new cat("Мурзик");
        cat cat2 = new cat("Барсик");

        dog1.run(300);
        dog1.swim(5);
        dog2.run(600);
        cat1.run(150);
        cat1.swim(5);

        System.out.println("\nПодсчёт животных:");
        System.out.println("Всего животных: " + animal.getCount());
        System.out.println("Всего собак: " + dog.getDogCount());
        System.out.println("Всего котов: " + cat.getCatCount());

        // Тестируем кормление котов
        System.out.println("\nТестируем кормление котов:");
        cat[] cats = {cat1, cat2, new cat("Васька"), new cat("Рыжик"), new cat("Котяра")};
        plate plate = new plate(40); // Тарелка с 40 единицами еды

        System.out.println("Перед кормлением:");
        plate.info();

        for (cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("\nПосле кормления:");
        plate.info();

        System.out.println("\nИнформация о сытости котов:");
        for (cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.isFull());
        }

        System.out.println("\nДобавляем еду в тарелку:");
        plate.addFood(20);
        plate.info();

        System.out.println("\nДаем шанс голодным котам покушать:");
        for (cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(plate);
            }
        }

        System.out.println("\nИтоговая информация о сытости котов:");
        for (cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.isFull());
        }
        payment payment = new payment();

        // Добавляем товары
        payment.addItem("Телефон", 50000);
        payment.addItem("Ноутбук", 100000);

        // Показываем список товаров
        payment.showItems();
    }

    static {
        park park = new park();
        park.addAttraction("Колесо обозрения", "10:00-20:00", 300);
        park.addAttraction("Американские горки", "11:00-22:00", 500);
        park.showAttractions();
    }
}
