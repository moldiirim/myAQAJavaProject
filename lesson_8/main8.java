package lesson_8;

public class main8 {

    public static void main(String[] args) {
        // Создание массива сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mail.com", "89151234567", 40000, 45);
        employees[2] = new Employee("Sidorov Alex", "Developer", "sidorov@mail.com", "89067891234", 50000, 25);
        employees[3] = new Employee("Smirnova Anna", "Analyst", "anna@mail.com", "89232345678", 60000, 50);
        employees[4] = new Employee("Kuznetsova Olga", "Designer", "olga@mail.com", "89991112233", 55000, 42);

        // Вывод информации о сотрудниках старше 40 лет
        System.out.println("Сотрудники старше 40 лет:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
