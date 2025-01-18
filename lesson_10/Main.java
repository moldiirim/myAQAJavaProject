package lesson_10;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        System.out.println("Weight of apple: " + apple.getWeight());
        System.out.println("Weight of orange: " + orange.getWeight());
    }
}
