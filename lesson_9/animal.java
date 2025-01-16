package lesson_9;

public class animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    private static int count = 0;  // Счётчик для всех животных

    public animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;  // Увеличиваем счётчик при создании каждого объекта
    }

    // Статический метод для получения общего количества животных
    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м.");
        }
    }
}