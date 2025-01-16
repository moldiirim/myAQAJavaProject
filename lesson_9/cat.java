package lesson_9;

public class cat extends animal {
private static int catCount = 0;
private boolean isFull;


// Конструктор
public cat(String name) {
    super(name, 200, 0);
    this.isFull = false;
    catCount++;
}



    public void eat(plate plate) {
    if (!isFull && plate.decreaseFood(10)) {
        isFull = true;
        System.out.println(name + " поел.");
    } else {
        System.out.println(name + " не смог поесть.");
    }
}


public boolean isFull() {
    return isFull;
}

public static int getCatCount() {
    return catCount;
}
}