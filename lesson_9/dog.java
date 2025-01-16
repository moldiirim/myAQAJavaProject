package lesson_9;

public class dog extends animal {
    private static int dogCount = 0;

    public dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }



    public static int getDogCount() {
        return dogCount;
    }
}