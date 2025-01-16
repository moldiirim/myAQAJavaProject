package lesson_9;

public class plate {
    private int food;

    public plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }

}
