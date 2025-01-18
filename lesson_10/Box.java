package lesson_10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) return 0;
        return fruits.size() * fruits.getFirst().getWeight();
    }

    public boolean compare(Box<?> otherBox) {
        return Float.compare(this.getWeight(), otherBox.getWeight()) == 0;
    }

    public void transferFruitsTo(Box<T> otherBox) {
        if (this == otherBox) {
            throw new IllegalArgumentException("Cannot transfer fruits to the same box");
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public int getFruitCount() {
        return fruits.size();
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());

        System.out.println("Apple Box Weight: " + appleBox.getWeight());
        System.out.println("Orange Box Weight: " + orangeBox.getWeight());
        System.out.println("Boxes have equal weight: " + appleBox.compare(orangeBox));

        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.transferFruitsTo(anotherAppleBox);
        System.out.println("Apple Box Count after transfer: " + appleBox.getFruitCount());
        System.out.println("Another Apple Box Count: " + anotherAppleBox.getFruitCount());
    }
}

